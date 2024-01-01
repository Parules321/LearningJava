package cruiseAssignment1;

import java.util.Scanner;

public class UserDetails {
	private String name;
	private String userName;
	private String phoneNo;
	private String emailId;
	private String password;

	public String getName(Scanner sc) {
		System.out
				.println("Welcome to Cruise Booking.\nPlease sign up to book a cruise.\nPlease enter your full name.");
		name = sc.nextLine();
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo(Scanner sc) {
		System.out.println("Enter your phone number.");
		phoneNo = sc.next();
		while (phoneNo.length() != 10 || !phoneNo.matches("\\d+")) {
			System.out.println("Please enter a valid 10 digit phone number without any spaces or any other character.");
			phoneNo = sc.next();
		}

		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId(Scanner sc) {
		System.out.println("Enter your email address.");
		emailId = sc.next();
		while (!(emailId.contains("@")) || !(emailId.contains(".")) || emailId.endsWith(".")) {
			System.out.println("Please enter valid email address.");
			emailId = sc.next();
		}
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName(Scanner sc) {
		System.out.println("Enter the username that you want to use.");
		sc.nextLine();
		userName = sc.nextLine();
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword(Scanner sc) {
		System.out.println(
				"Please create your password now. Password must have 8 or more characters and must have one or more of these special characters - !,@,#,$,%,^,& or *.");
		password = sc.next();
		while (password.length() < 8 || !(password.contains("!")) && !(password.contains("@"))
				&& !(password.contains("#")) && !(password.contains("$")) && !(password.contains("%"))
				&& !(password.contains("^")) && !(password.contains("&")) && !(password.contains("*"))) {
			System.out.println(
					"Password not created. Please create a password which is 8 or more characters with atleast one special character from !,@,#,$,%,^,& or *.");
			password = sc.next();
		}
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void logIn(Scanner sc) {
		System.out.println(
				"Thank your for registering! You can log in now using your username and password.\nPlease enter your username.");
		sc.nextLine();
		String userName = sc.nextLine();
		System.out.println("\nPlease enter password.");
		String password = sc.next();
		while (!(userName.equals(this.userName)) || !(password.equals(this.password))) {
			System.out.println("Incorrect details entered. "
					+ "\nIf you do not remember your user details, please enter your email address below on which we will email you your user details. "
					+ "\nOnce you log in with your details that we email to you, we recommend changing your username and password."
					+ "\nIf you remember your user details, please enter any alphabet and press enter");
			String emailIdForDetails = sc.next();
			if (emailIdForDetails.equals(this.emailId)) {
				System.out.println("User details emailed. Please check your email and try again.");
			}

			System.out.println("Please enter username.");
			sc.nextLine();
			userName = sc.nextLine();
			System.out.println("Please enter password.");
			password = sc.next();
		}

		if (userName.equals(this.userName) && password.equals(this.password)) {
			System.out.println("Login Successful!");
		}
	}

	public boolean isPassWordValidated(Scanner sc) {

		System.out.println(
				"Do you want to change your personal information? Press Y to change. Press any other alphabet to exit.");
		String changeInfo = sc.next();
		if (changeInfo.equalsIgnoreCase("Y")) {
			System.out.println("To change your your personal information, first enter your current password.");
			String passwordByUser = sc.next();
			for (int i = 0; i < 3; i++) {
				if (passwordByUser.equals(this.password)) {
					System.out.println("Password validated successfully.");
					break;
				} else if (i < 2) {
					System.out.println("Password incorrect. Please try again.Enter your password below.");
					passwordByUser = sc.next();
					;
				}

				else {
					System.out.println(
							"There are 3 unsuccessful attempts to validate password and hence we can not change any personal details at this time.");
					;
				}
			}

			if (passwordByUser.equals(this.password)) {
				return true;
			} else {
				System.out.println("Thank you for using our service!");
				return false;
			}
		}

		else {
			System.out.println("Thank you for using our service!");
			return false;
		}

	}

	public void changeInfo(boolean isPasswordValidated, Scanner sc) {
		if (isPasswordValidated) {
			String anyMoreChange = "";
			do {
				System.out.println(
						"Please enter 1, 2, 3 or 4 for the information you want to change. \n1 - User Name \n2 - Password \n3 - Email \n4 - Phone Number");
				String infoToBeChanged = sc.next();

				if (infoToBeChanged.equals("1")) {
					setUserName(getUserName(sc));
					System.out.println("User name changed successfully.");
				}

				else if (infoToBeChanged.equals("2")) {
					setPassword(getPassword(sc));
					System.out.println("Password changed successfully.");
				}

				else if (infoToBeChanged.equals("3")) {
					setEmailId(getEmailId(sc));
					System.out.println("Email address changed successfully.");
				}

				else if (infoToBeChanged.equals("4")) {
					setPhoneNo(getPhoneNo(sc));
					System.out.println("Phone number changed successfully.");
				}

				else {
					System.out.println("Invalid Input. This operation can not be performed.");

				}
				System.out.println(
						"Do you wish to change any other personal information? Please enter Y for Yes or enter any other input to exit.");
				anyMoreChange = sc.next();
			} while (anyMoreChange.equalsIgnoreCase("Y"));

			System.out.println("Thank you for using our service!");
		}
	}

}
