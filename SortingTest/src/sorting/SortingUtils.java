package sorting;

public class SortingUtils {

	public static int[] doInsertionSort(int[] input) {
		if (input == null) {
			return new int[] {};
		}

		if (input.length == 0 || input.length == 1) {
			return input;
		}

		int temp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		return input;
	}
}
