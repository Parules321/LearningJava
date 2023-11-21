package userPwrdMatch;

import java.util.Scanner;

public class UserPwrdMatch {

	/*
	 * Write a program which takes user name and password from user via console and
	 * compares it with a user name and password saved in your class. Saved user id
	 * - pivotAdmin and password - Admin123 If the user name and password entered by
	 * user matches with the one saved in your class, then print “You are logged in
	 * to the application” other wise print “Incorrect User id or password. Try
	 * again”. Also, a user gets 3 chances enter the correct user name and password.
	 * If the user enters incorrect user name or password 3rd time then print
	 * “Account locked”.
	 */
	Scanner sc = new Scanner(System.in);

	String expectedUserId = "pivotAdmin";
	String expectedPassword = "Admin123";
	String actualUserId, actualPswrd;

	void checkUserIdAndPswrdMatch() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Please type user name and press enter.");
			String actualUserId = sc.next();
			System.out.println("Please type password and press enter.");
			String actualPswrd = sc.next();

			if (actualUserId.equals(expectedUserId) && actualPswrd.equals(expectedPassword)) {
				System.out.println("You are logged into the application");
				break;
			} else {
				if (i != 2) {
					System.out.println("Incorrect User id or password. Try again.");
				} else {
					System.out.println("Account locked.");
				}

			}

		}
	}
}
