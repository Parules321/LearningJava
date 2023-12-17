package javaOOPsAssignmentPart1;

public class BankOperations {

	public double withdrawMoney(double amountToBeWithdrawn, double balance) {
		if (amountToBeWithdrawn > balance) {
			System.out.println(
					"Sorry. Amount to be withdrawn can not be more than your account balance. Operation Terminated.");
		}

		else {
			balance -= amountToBeWithdrawn;
			System.out.println("Withdrawal successful. Your new balance is: " + balance);
		}
		return balance;

	}

	public double depositMoney(double amountToBeDeposited, double balance) {
		balance += amountToBeDeposited;
		System.out.println("Deposit Successful. Your new balance is: " + balance);
		return balance;

	}

}
