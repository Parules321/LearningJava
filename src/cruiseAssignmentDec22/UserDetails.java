package cruiseAssignmentDec22;

public class UserDetails {

	private String name;
	private String userName;
	private String phoneNumber;
	private String emailId;
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void logIn(String logInUserName, String logInPassword) {
		if (logInUserName.equals(getUserName()) && logInPassword.equals(getPassWord())) {
			System.out.println("Login Successful!");
		}
	}

}
