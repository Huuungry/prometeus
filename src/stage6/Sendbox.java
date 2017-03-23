package stage6;

public class Sendbox {

	public static void main(String[] args) {

		String str1 = "abbyuiop";
		String result = new String();
		result = Character.toString(str1.charAt(0));
		int numberOfRepeated = 1;
		for (int i = 0; i < str1.length() - 1; i++) {
			

			if (str1.charAt(i) == str1.charAt(i + 1)) {
				numberOfRepeated++;
				// System.out.println(numberOfRepeated);
			}

			else {
				System.out.println(numberOfRepeated);
				if (numberOfRepeated != 1) {
					result = result.concat(Integer.toString(numberOfRepeated));
					 numberOfRepeated = 1;
				} else {
					result = result.concat(Character.toString(str1.charAt(i+1)));
				}
			}
		}
		System.out.println(result);
	}

}
