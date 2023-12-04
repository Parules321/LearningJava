package arrayIntQuestionsAssignment;

public class MaxNumInArray {

	double[] arrayOfNumbers = { 50, 45.5, 32.9, 111, 90, 75, 3 };

	void findMaxNum() {

		double max = arrayOfNumbers[0];

		for (int i = 0; i < arrayOfNumbers.length; i++) {
			if (arrayOfNumbers[i] > max) {
				max = arrayOfNumbers[i];
			}
		}

		System.out.println("Maximum number in the array is: " + max);

	}
}
