package arrayIntQuestionsAssignment;

import java.util.Scanner;

public class MultipleDuplicates {

	Scanner sc = new Scanner(System.in);

	void findDuplicateNos() {
		boolean doesDuplicateExist = false;

		System.out.println(
				"Please type below the number of elements that you want to include in this array and press enter.");

		int arrayLength = sc.nextInt();
		System.out.println("Thankyou. Now please enter all the " + arrayLength
				+ " numbers to include in this array including any duplicate numbers. Please type enter after each input");
		double arrayInput[] = new double[arrayLength];
		for (int i = 0; i < arrayInput.length; i++) {
			arrayInput[i] = sc.nextDouble();
		}

		for (int i = 0; i < arrayInput.length; i++) {
			for (int j = i + 1; j < arrayInput.length; j++) {
				if (i != j && arrayInput[i] == arrayInput[j]) {
					doesDuplicateExist = true;
					System.out.println(
							"Duplicate number: " + arrayInput[i] + " found at index " + i + " and at index " + j);

				}
			}
		}

		if (doesDuplicateExist = false) {
			System.out.println("No duplicate numbers are present in this array.");
		}

	}

}
