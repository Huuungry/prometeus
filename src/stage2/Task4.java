package stage2;

public class Task4 {

	public static void main(String[] args) {

		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;

		int lenght = data.length;
		int left = 0;
		int right = lenght - 1;

		while (left <= right && left >= 0 && right >= 0) {
			int middle = left + (right - left) / 2;
			if (numberToFind == data[middle]) {
				System.out.println(middle);
				break;
			} else if (numberToFind > data[middle]) {
				left = middle + 1;
			} else if (numberToFind < data[middle]) {
				right = middle - 1;
			}
		}

		if (left > right || left < 0 || right < 0) {
			System.out.println(-1);
		}
	}
}
