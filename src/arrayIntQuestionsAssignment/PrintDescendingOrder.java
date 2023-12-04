package arrayIntQuestionsAssignment;

import java.util.Scanner;

public class PrintDescendingOrder {

	int arr[] = new int[5];

	Scanner sc = new Scanner(System.in);

	void descendingOrder() {
		int temp = 0;

		System.out.println("Please type below any 5 integers for this array.Please press enter after each input. \n");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Numbers of the array in descending order are: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
