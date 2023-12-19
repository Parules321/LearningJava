package javaOOPsAssignmentPart1;

public class BankOperations {
	
	public double balance;
	

	public void setBalance(double fundsAvailable, double amountWithdrawn, double amountDeposited) {
		if (amountWithdrawn > fundsAvailable) {
			balance = fundsAvailable + amountDeposited; 
		} else {
			balance = (fundsAvailable - amountWithdrawn) + amountDeposited;
		}
		
	}

	public double withdrawMoney(double amountToBeWithdrawn, double fundsAvailable) {
		if (amountToBeWithdrawn > fundsAvailable) {
			System.out.println("Sorry. Amount to be withdrawn can not be more than your account balance.");
		} else {System.out.println("Withdrawal successful.");}
		return amountToBeWithdrawn;
	}

	public double depositMoney(double amountToBeDeposited) {System.out.println("Deposit successful");
		return amountToBeDeposited;

	}

}
