package arrayIntQuestionsAssignment;

public class SecondHighestNumber {

	double[] arrayOfNumbers = { 23, 45.5, 32, 107.2, 90, 107.2, 2 };

	void findSecondLargest() {

		double max = arrayOfNumbers[0];
		double secondLargest = 0;
		int indexOfMax = 0;

		for (int i = 0; i < arrayOfNumbers.length; i++) {
			if (arrayOfNumbers[i] > max) {
				secondLargest = max;
				max = arrayOfNumbers[i];
				indexOfMax = i;
			}
		}

		for (int j = arrayOfNumbers.length - 1; j > indexOfMax; j--) {
			if (arrayOfNumbers[j] > secondLargest && arrayOfNumbers[j] < max) {

				secondLargest = arrayOfNumbers[j];
			}
		}

		System.out.println("Second largest number in the array: " + secondLargest);

	}
}
