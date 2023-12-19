package javaOOPsAssignmentPart1;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		UserAccountDetails userAccount = new UserAccountDetails("Paula S", "564327890", 7000.87, 7654, "Java123");
		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();
		OnlineBanking online = new OnlineBanking();
		double amountToBeDeposited = 0, amountToBeWithdrawn = 0;
		boolean isAnyOtherTransactionNeeded = true;

		while (isAnyOtherTransactionNeeded) {
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
						amountToBeDeposited = sc.nextDouble();
						atm.depositMoney(amountToBeDeposited);

					}

					else {
						System.out.println("Please enter the amount you want to withdraw.");
						amountToBeWithdrawn = sc.nextDouble();
						atm.withdrawMoney(amountToBeWithdrawn, userAccount.getFundsAvailable());
					}
					// atm.setBalance(userAccount.getFundsAvailable(), amountToBeWithdrawn,
					// amountToBeDeposited);

					// userAccount.setFundsAvailable(amountToBeWithdrawn, amountToBeDeposited);
					// System.out.println("Your balance is " + atm.balance);
					// System.out.println("Your balance is " + userAccount.getFundsAvailable());
				}
			}

			if (bankingService == 2) {
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
						amountToBeDeposited = sc.nextDouble();
						online.depositMoney(amountToBeDeposited);

					}

					else {
						System.out.println("Please enter the amount you want to withdraw.");
						amountToBeWithdrawn = sc.nextDouble();
						online.withdrawMoney(amountToBeWithdrawn, userAccount.getFundsAvailable());

					}
					// online.setBalance(userAccount.getFundsAvailable(), amountToBeWithdrawn,
					// amountToBeDeposited);
					// System.out.println("Your balance is " + online.balance);
					// userAccount.setFundsAvailable(amountToBeWithdrawn, amountToBeDeposited);
					// System.out.println("Your balance is " + userAccount.getFundsAvailable());

				}

			}
			userAccount.setFundsAvailable(amountToBeWithdrawn, amountToBeDeposited);
			System.out.println("Your balance is " + userAccount.getFundsAvailable());
			System.out.println("Do you want to do any other transaction? Please type true or false.");
			isAnyOtherTransactionNeeded = sc.nextBoolean();

		}
		if(!isAnyOtherTransactionNeeded) {System.out.println("Thanks for using our services. Operation Terminated.");}

		sc.close();
	}

}
