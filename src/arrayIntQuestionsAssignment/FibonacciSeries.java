package arrayIntQuestionsAssignment;

import java.util.Scanner;

public class FibonacciSeries {
	Scanner sc = new Scanner(System.in);

	void printFibonacciSeries() {

		System.out.println("Please enter the desired number up to which the fibonaci series is to be printed");

		int number = sc.nextInt();
		System.out.println("The fibonacci series up to this number is as below:");

		int a = 0, b = 1;

		for (int i = 0; a <= number; i++) {
			System.out.print(a + ", "); // fibonacci series 0 1 1 2 3 5 8 13

			int sum = a + b; // 1,2, 3,5, 8,13
			a = b; // 1, 1, 2, 3, 5, 8
			b = sum; // 1, 2, 3, 5, 8

		}

	}

}
