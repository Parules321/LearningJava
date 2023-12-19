package javaOOPsAssignmentPart1;

public class UserAccountDetails {

	private String accountHolderName;
	private String accountNum;
	private double fundsAvailable;
	private int pin;
	private String password;

	public UserAccountDetails(String accountHolderName, String accountNum, double fundsAvailable, int pin,
			String password) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNum = accountNum;
		this.fundsAvailable = fundsAvailable;
		this.pin = pin;
		this.password = password;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public double getFundsAvailable() {
		return fundsAvailable;
	}

	public int getPin() {
		return pin;
	}

	public String getPassword() {
		return password;
	}

	public boolean validateUser(int pinByUser) {

		if (pinByUser == getPin()) {
			System.out.println("User validated successfully. Please proceed.");
			return true;
		} else {
			System.out.println("User Authentication Failed. Can not proceed ahead.");
			return false;
		}

	}

	public boolean validateUser(String passwordByUser) {

		if (passwordByUser.equals(getPassword())) {
			System.out.println("User validated successfully. Please proceed.");
			return true;
		} else {
			System.out.println("User Authentication Failed. Can not proceed ahead.");
			return false;
		}

	}
	
	
	public void setFundsAvailable (double amountWithdrawn, double amountDeposited) {
		
		if(amountWithdrawn>getFundsAvailable()) { this.fundsAvailable = getFundsAvailable()+ amountDeposited;}
		else {this.fundsAvailable = (getFundsAvailable() - amountWithdrawn) + amountDeposited;}	
			
		}
		
	

}