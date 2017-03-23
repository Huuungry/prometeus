package stage6;

public class Sendbox {

	public static void main(String[] args) {

		String inputString = args[0];
		String result = new String();
		int numberOfRepeated = 1;
		
		for (int i = 0; i < inputString.length(); i++) {

			if (i < inputString.length()-1 && inputString.charAt(i) != inputString.charAt(i + 1)) {
				// System.out.println(numberOfRepeated);
				result = result.concat(Character.toString(inputString.charAt(i)));
				if (numberOfRepeated > 1 && numberOfRepeated < 10){
					result = result.concat(Integer.toString(numberOfRepeated));
					numberOfRepeated=1;
				}
			
			} else if (i == inputString.length()-1) {
				result = result.concat(Character.toString(inputString.charAt(i)));
				if (numberOfRepeated != 1){
					result = result.concat(Integer.toString(numberOfRepeated));
				}
			}
			else if (numberOfRepeated<9) {
				numberOfRepeated++;
			}
			else{
				result = result.concat(Character.toString(inputString.charAt(i)));
				result = result.concat(Integer.toString(numberOfRepeated));
				numberOfRepeated=1;
			}
		}
		System.out.println(result);
	}

}
