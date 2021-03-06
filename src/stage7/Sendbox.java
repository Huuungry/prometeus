package stage7;

import java.util.Deque;
import java.util.LinkedList;

public class Sendbox {

	public static double parse(String rpnString) {

		String[] arguments = rpnString.split(" ");
		LinkedList<Double> stack = new LinkedList<Double>();
		Double result = null;
		try{
			for (String str : arguments) {
				switch (str) {
				case "+":
					stack.push((stack.pop() + stack.pop()));
					break;
				case "*":
					stack.push(stack.pop() * stack.pop());
					break;
				case "-":
					double y = stack.pop();
					double x = stack.pop();
					stack.push(x - y);
					break;
				case "/":
					double yy = stack.pop();
					double xx = stack.pop();
					if (yy == 0 || Double.isInfinite(xx / yy)) {
						throw new ArithmeticException();
					}
					try {
						stack.push(xx / yy);
					} catch (ArithmeticException e) {
						// System.out.println("Hi");
						throw new ArithmeticException();
					}
					break;
				case "NaN":
					throw new ArithmeticException();

				default:
					String variable = "";
					boolean frac = false;

					for (char ch : str.toCharArray()) {

						if (ch == '-') {
							variable = "-";
						} else if (Character.isDigit(ch)) {
							variable = variable + ch;
						} else if (ch == '.' && !frac) {
							variable = variable + ".";
							frac = true;
						}
						else throw new RPNParserException();
					}

					stack.push(Double.parseDouble(variable));



					break;
				}

			}
		}catch(ArithmeticException e){
			throw new ArithmeticException();
		}


		catch(Exception ex){
			throw new RPNParserException();
		}

		result = stack.pop();
		System.err.println(result);
		return result;
	}

	public static void main(String[] args) {

		if (args == null || args.length == 0 || args[0] == null) {
			throw new RPNParserException();
		} else {
			parse(args[0]);
		}

	}

}