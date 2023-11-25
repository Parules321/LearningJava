package multiDimensionalArrayAssignment;

public class ArrayOfIntegers {

	int[] arrInt = { -40, -5, 1, 3, 6, 7, 8, 20 };

	void findElementsWithSum15() {

		for (int i = 0, j = arrInt.length - 1; i < arrInt.length && j >= 0;) {

			if (arrInt[i] + arrInt[j] < 15) {
				i++;
			}

			else if (arrInt[i] + arrInt[j] > 15) {
				j--;
			}

			else if (arrInt[i] + arrInt[j] == 15) {
				System.out.println("Pair with sum 15 are: " + arrInt[i] + " and " + arrInt[j]);
				i++;
				j--;
			}

		}

	}

}
