package stage6;

public class decode {

	public static void main(String[] args) {

		String inputString = "Hh9h3e4l2o5";
		String result = "";

		// Iterate symbols in string
		if (inputString.length() == 0) {

		}

		else {
			result = new String(inputString.substring(0, 1));

			for (int i = 1; i < inputString.length(); i++) {

				if (inputString.substring(i - 1, i).equals(inputString.substring(i, i + 1))) {
					result = "";
					break;
				}

				else {
					// Check that there are no number sequences or string start from it
					try {
						if (i < inputString.length() - 1 && Integer.parseInt(inputString.substring(i, i + 1)) >= 0
								&& Integer.parseInt(inputString.substring(i + 1, i + 2)) >= 0
								|| Integer.parseInt(inputString.substring(0, 1)) >= 0) {
							result = "";
							break;
						}
					} catch (NumberFormatException e) {
					}

					try {
						// Try to parse current symbol to int, if OK - concat
						// previous
						// symbol int times
						int testint = Integer.parseInt(inputString.substring(i, i + 1));
						for (int j = 0; j < testint - 1; j++) {
							result = result.concat(inputString.substring(i - 1, i));

						}

						// if exception, symbol is not a number... just concat
						// it to the
						// result
					} catch (NumberFormatException e) {
						result = result.concat(inputString.substring(i, i + 1));
					}
				}

			}

		}
		System.out.println(result);

	}
}
