package arrayIntQuestionsAssignment;

import java.util.Scanner;

public class SmallestAndLargest {

	int arrayOfNumbers[] = new int[5];

	Scanner sc = new Scanner(System.in);

	void populateArray() {
		System.out.println("Please type any 5 integers for this array. Press enter after each input.");

		for (int i = 0; i < arrayOfNumbers.length; i++) {
			arrayOfNumbers[i] = sc.nextInt();
		}

	}

	void findSmallest() {

		int min = arrayOfNumbers[0];

		for (int i = 0; i < arrayOfNumbers.length; i++) {
			if (arrayOfNumbers[i] < min) {
				min = arrayOfNumbers[i];
			}
		}
		System.out.println("Smallest number in this array: " + min);

	}

	void findLargest() {
		int max = arrayOfNumbers[0];
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			if (arrayOfNumbers[i] > max) {
				max = arrayOfNumbers[i];
			}
		}
		System.out.println("Largest number in this array: " + max);
	}
}