package javaOOPsAssignmentPart1;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		UserAccountDetails userAccount = new UserAccountDetails("Paula S", "564327890", 7000.87, 7654, "Java123");
		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();
		OnlineBanking online = new OnlineBanking();

		System.out.println(
				"Please select the banking service that you want to use. \nType 1 for ATM or 2 for Online Banking and press enter.");

		int bankingService = sc.nextInt();

		while (bankingService != 1 && bankingService != 2) {
			System.out.println("Invalid input. Please type either 1 for ATM or 2 for online banking.");
			bankingService = sc.nextInt();
		}

		if (bankingService == 1) {
			System.out.println("For accessing ATM services, please enter your pin and type enter.");
			int pinByUser = sc.nextInt();
			if (userAccount.validateUser(pinByUser)) {
				System.out.println(
						"Please type 1 for deposit and 2 for withdrawal. Please type only one number at a time and press enter.");
				int bankingOperation = sc.nextInt();
				while (bankingOperation != 1 && bankingOperation != 2) {
					System.out.println("Invalid input. Please type either 1 for deposit or 2 for withdrawal.");
					bankingOperation = sc.nextInt();
				}
				if (bankingOperation == 1) {
					System.out.println("Please enter the amount to be deposited");
					double amountToBeDeposited = sc.nextDouble();
					atm.depositMoney(amountToBeDeposited, userAccount.getFundsAvailable());

				}

				else {
					System.out.println("Please enter the amount you want to withdraw.");
					double amountToBeWithdrawn = sc.nextDouble();
					atm.withdrawMoney(amountToBeWithdrawn, userAccount.getFundsAvailable());

				}

			}

		}

		else {
			System.out.println("For accessing online banking services, please enter your password and type enter.");
			String passwordByUser = sc.next();
			if (userAccount.validateUser(passwordByUser)) {
				System.out.println(
						"Please type 1 for deposit and 2 for withdrawal. Please type only one number at a time and press enter.");
				int bankingOperation = sc.nextInt();
				while (bankingOperation != 1 && bankingOperation != 2) {
					System.out.println("Invalid input. Please type either 1 for deposit or 2 for withdrawal.");
					bankingOperation = sc.nextInt();
				}
				if (bankingOperation == 1) {
					System.out.println("Please enter the amount to be deposited");
					double amountToBeDeposited = sc.nextDouble();
					online.depositMoney(amountToBeDeposited, userAccount.getFundsAvailable());

				}

				else {
					System.out.println("Please enter the amount you want to withdraw.");
					double amountToBeWithdrawn = sc.nextDouble();
					online.withdrawMoney(amountToBeWithdrawn, userAccount.getFundsAvailable());

				}

			}

		}
		sc.close();

	}
}
