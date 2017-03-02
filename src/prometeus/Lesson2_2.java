package prometeus;

public class Lesson2_2 {

	public static void main(String[] args) {

		int number = 1;
		int size = 5;
		//
		String[][] matrix = { { "*", "2", "3", "4", "5" }, { "6", "*", "8", "*", "10" },
				{ "11", "12", "*", "14", "15" }, { "16", "*", "18", "*", "20" }, { "*", "22", "23", "24", "*" } };

		for (int i = 0; i < (matrix.length); i++) {
			for (int j = 0; j < (matrix[i].length); j++) {
				if (matrix[i][j].length() < 2) {
					System.out.print(" " + matrix[i][j] + " ");
				} else {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();

		}
	}
}
