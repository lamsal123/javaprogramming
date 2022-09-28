package Classwork;

public class SortAnArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 6, -1, 4, 10 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers);
		}
		for (int j = 0; j < numbers.length; j++) {
			int num = numbers[j];

			for (int k = 1; k < numbers.length; k++) {
				if (numbers[k] < numbers[j]) {
					int temp = numbers[j];
					numbers[j] = numbers[k];
					numbers[k] = temp;

				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
