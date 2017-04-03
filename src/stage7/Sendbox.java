package stage7;

import java.util.Deque;
import java.util.LinkedList;

import java.util.LinkedList;

public class Sendbox {
	
	public static double parse(String rpnString) {
		String result = "";
		boolean frac = false;
		for (char ch : rpnString.toCharArray()) {
			if (Character.isDigit(ch)) {
				result = result + ch;
				continue;
			}
			if (ch == '.' && !frac) {
				result = result + ".";
				frac = true;
				continue;
			}

			throw new RPNParserException();
		}

		return Double.parseDouble(result);
	}

	public static void main(String[] args) {
		
		if (args == null || args.length == 0 || args[0] == null)
			throw new RPNParserException();

		String[] arguments = args[0].split(" ");
		LinkedList<Double> stack = new LinkedList<Double>();
		try {
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
					stack.push(xx / yy);
					break;
				default:
					stack.push(parse(str));
					break;
				}
			}
		} catch (Exception ex) {
			throw new RPNParserException();
		}

		if (stack.size() > 1)
			throw new RPNParserException();

		Double result = stack.pop();
		if (result.isNaN() || result.isInfinite())
			throw new ArithmeticException();

		int intresult = result.intValue();
		System.out.println(intresult);
	}

}