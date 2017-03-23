package stage6;

public class Sendbox {

	public static void main(String[] args) {

		String str1 = "aaabbbmmmcccc";
		String result = new String();
		int numberOfRepeated = 1;
		for (int i = 0; i < str1.length(); i++) {

			if (i < str1.length()-1 && str1.charAt(i) != str1.charAt(i + 1)) {
				// System.out.println(numberOfRepeated);
				result = result.concat(Character.toString(str1.charAt(i)));
				if (numberOfRepeated != 1){
					result = result.concat(Integer.toString(numberOfRepeated));
					numberOfRepeated=1;
				}
			} else if (i == str1.length()-1) {
				result = result.concat(Character.toString(str1.charAt(i)));
				if (numberOfRepeated != 1){
					result = result.concat(Integer.toString(numberOfRepeated));
				}
			}
			else {
				numberOfRepeated++;
			}

		}
		System.out.println(result);
	}

}
