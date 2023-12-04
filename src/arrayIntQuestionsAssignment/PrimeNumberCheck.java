package arrayIntQuestionsAssignment;

import java.util.Scanner;

public class PrimeNumberCheck {

	boolean isNumberPrime = true;
	Scanner sc = new Scanner(System.in);

	void primeNumberCheck() {

		System.out.println("Please type below the number to check if its prime or not. \n");

		int num = sc.nextInt();

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isNumberPrime = false;
				System.out.println(num + " is not prime");
				break;
			}
		}

		if (isNumberPrime && num > 1) {
			System.out.println(num + " is a prime number.");
		} else if (num == 1 || num == 0) {
			System.out.println("Number is neither prime nor composite.");
		}
	}

}
