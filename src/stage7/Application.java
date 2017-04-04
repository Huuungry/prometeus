package stage7;
import java.util.Deque;
import java.util.LinkedList;

public class Application {

	public static double parse(String rpnString) {
		String result = "";
		boolean frac = false;

		for (char ch : rpnString.toCharArray()) {
			if (ch == '-') {
				result = "-";
				continue;
			}
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

		if (args == null || args.length == 0 || args[0] == null) {
			throw new RPNParserException();
		}

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
					stack.push(parse(str));
					break;
				}
			}
		} catch (ArithmeticException e) {
			throw new ArithmeticException();
		}

		catch (Exception ex) {
			// System.out.println(ex);
			throw new RPNParserException();
		}

		if (stack.size() > 1)
			throw new RPNParserException();

		Double result = stack.pop();
		// if (result.isNaN() || result.isInfinite())
		// throw new ArithmeticException();

		int intresult = result.intValue();
		System.out.println(intresult);
	}

}
      
      