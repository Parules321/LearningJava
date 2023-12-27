package cruiseAssignmentDec22;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cruise cruise = new Cruise();// creating reference variable of parent class that will be used
		// for upcasting such as cruise = new ScenicCruise();

		UserDetails userDetails = new UserDetails();

		System.out
				.println("Welcome to Cruise Booking.\nPlease sign up to book a cruise.\nPlease enter your full name.");
		String nameByUser = sc.nextLine();
		userDetails.setName(nameByUser);
		System.out.println("Enter your phone number.");
		String phoneNumberByUser = sc.next();
		while (phoneNumberByUser.length() != 10) {
			System.out.println("Please enter a valid 10 digit phone number without any spaces in between.");
			phoneNumberByUser = sc.next();
		}
		userDetails.setPhoneNumber(phoneNumberByUser);
		System.out.println("Enter your email address.");
		String emailIdByUser = sc.next();
		while (!(emailIdByUser.contains("@")) || !(emailIdByUser.contains(".")) || emailIdByUser.endsWith(".")) {
			System.out.println("Please enter valid email address.");
			emailIdByUser = sc.next();
		}
		userDetails.setEmailId(emailIdByUser);
		System.out.println("Enter the username that you want to use.");
		sc.nextLine();
		String userNameByUser = sc.nextLine();
		userDetails.setUserName(userNameByUser);
		System.out.println(
				"Please create your password now.Password must have 8 or more characters and must have one or more of these special characters - !,@,#,$,%,^,& or *.");
		String passWordByUser = sc.next();
		while (passWordByUser.length() < 8 || !(passWordByUser.contains("!")) && !(passWordByUser.contains("@"))
				&& !(passWordByUser.contains("#")) && !(passWordByUser.contains("$")) && !(passWordByUser.contains("%"))
				&& !(passWordByUser.contains("^")) && !(passWordByUser.contains("&"))
				&& !(passWordByUser.contains("*"))) {
			System.out.println(
					"Password not created. Please create a password which is 8 or more characters with atleast one special character from !,@,#,$,%,^,& or *.");
			passWordByUser = sc.next();
		}

		userDetails.setPassWord(passWordByUser);

		System.out.println(
				"Thank your for registering! You can log in now using your username and password.\nPlease enter your username.");
		sc.nextLine();
		String userNameToSignIn = sc.nextLine();
		System.out.println("\nPlease enter password.");
		String passWordToSignIn = sc.next();
		while (!(userNameToSignIn.equals(userDetails.getUserName()))
				|| !(passWordToSignIn.equals(userDetails.getPassWord()))) {
			System.out.println("Incorrect details entered. "
					+ "\nIf you do not remember your user details, please enter your email address below on which we will email you your user details. "
					+ "\nOnce you log in with your details that we email to you, we recommend changing your username and password."
					+ "\nIf you remember your user details, please enter any alphabet and press enter");
			String emailIdToRecoverUserDetails = sc.next();
			if (emailIdToRecoverUserDetails.equals(userDetails.getEmailId())) {
				System.out.println("User details emailed. Please check your email and try again.");
			}

			System.out.println("Please enter username.");
			sc.nextLine();
			userNameToSignIn = sc.nextLine();
			System.out.println("Please enter password.");
			passWordToSignIn = sc.next();
		}
		userDetails.logIn(userNameToSignIn, passWordToSignIn);

		String selectionConfirmation = "";

		while (!selectionConfirmation.equalsIgnoreCase("Y")) {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.- \nScenic Cruise \nSunset Cruise \nDiscovery Cruise \nMystery Cruise");
			sc.nextLine();
			String cruiseSelected = sc.nextLine();

			while (!cruiseSelected.equalsIgnoreCase("Scenic Cruise")
					&& !cruiseSelected.equalsIgnoreCase("Sunset Cruise")
					&& !cruiseSelected.equalsIgnoreCase("Discovery Cruise")
					&& !cruiseSelected.equalsIgnoreCase("Mystery Cruise")) {
				System.out.println("Please enter an option only from the 4 different packages availalbe.");
				cruiseSelected = sc.nextLine();
			}

			cruise = cruiseSelected.equalsIgnoreCase("Scenic Cruise") ? new ScenicCruise()
					: cruiseSelected.equalsIgnoreCase("Mystery Cruise") ? new MysteryCruise()
							: cruiseSelected.equalsIgnoreCase("Sunset Cruise") ? new SunsetCruise()
									: cruiseSelected.equalsIgnoreCase("Discovery Cruise") ? new DiscoveryCruise()
											: null;

			cruise.displaySelectedCruiseDetails();

			System.out.println(
					"Please press Y and enter if you want to continue with the selection or press any other alphabet to select another.");
			selectionConfirmation = sc.next();

		}

		System.out.println("Enter the number of adults (over 12 years).");

		int noOfAdults = sc.nextInt();

		cruise.setNumberOfAdults(noOfAdults);

		System.out.println("Enter the number of children");

		int noOfChildren = sc.nextInt();
		int noOfChildrenAboveFive = 0;
		int age;
		if (noOfChildren > 0) {
			for (int i = 1; i <= noOfChildren; i++) {
				System.out.println("Enter the age of Child " + i);
				age = sc.nextInt();
				if (age > 5 && age <= 12) {
					noOfChildrenAboveFive += 1;
				}

			}

		}

		cruise.setNumberOfChildrenAboveFive(noOfChildrenAboveFive);

		if (noOfAdults == 0 && noOfChildrenAboveFive == 0) {
			System.out.println(
					"Sorry, if there are no adults and no children over five years old, cruise booking is not allowed. Operation terminated.");

		}

		else {
			System.out.println("All our cruises have food service on board. "
					+ "\nDo you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?"
					+ "\nPlease enter Yes to prebook or enter any other input if you do not want to prebook.");

			String mealSelectionInputByUser = sc.next();

			cruise.setMealSelection(mealSelectionInputByUser);

			cruise.displayCalculatedBill();
		}

		System.out.println(
				"Do you want to change your personal information? Press Y to change. Press any other alphabet to exit.");
		String changePersonalInfo = sc.next();
		if (changePersonalInfo.equalsIgnoreCase("Y")) {
			System.out.println("To change your your personal information, first enter your current password.");
			String passwordToBeValidated = sc.next();

			for (int i = 0; i < 3; i++) {
				if (passwordToBeValidated.equals(userDetails.getPassWord())) {
					System.out.println("Password validated successfully.");
					break;
				} else if (i < 2) {
					System.out.println("Password incorrect. Please try again.Enter your password below.");
					passwordToBeValidated = sc.next();
				}

				else {
					System.out.println(
							"There are 3 unsuccessful attempts to validate password and hence we can not change any personal details at this time.");

				}
			}

			if (passwordToBeValidated.equals(userDetails.getPassWord())) {
				String anyOtherChangeNeeded = "";
				do {
					System.out.println(
							"Please enter 1, 2, 3 or 4 for the information you want to change. \n1 - User Name \n2 - Password \n3 - Email \n4 - Phone Number");
					int indexOfInfoToBeChanged = sc.nextInt();

					if (indexOfInfoToBeChanged == 1) {
						System.out.println("Please enter new user name.");
						sc.nextLine();
						String newUserName = sc.nextLine();
						userDetails.setUserName(newUserName);
						System.out.println("User name changed successfully.");
					}

					else if (indexOfInfoToBeChanged == 2) {
						System.out.println(
								"Please enter new password. Your new Password must have 8 or more characters and must have one or more of these special characters - !,@,#,$,%,^,& or *.");
						String newPassword = sc.next();
						while (newPassword.length() < 8 || !(newPassword.contains("!")) && !(newPassword.contains("@"))
								&& !(newPassword.contains("#")) && !(newPassword.contains("$"))
								&& !(newPassword.contains("%")) && !(newPassword.contains("^"))
								&& !(newPassword.contains("&")) && !(newPassword.contains("*")))

						{
							System.out.println(
									"Password not changed. Please create a new password which is 8 or more characters with atleast one special character from !,@,#,$,%,^,& or *.");
							newPassword = sc.next();
						}

						userDetails.setPassWord(newPassword);
						System.out.println("Password changed successfully.");
					} else if (indexOfInfoToBeChanged == 3) {
						System.out.println("Please enter new email address.");
						String newEmailId = sc.next();
						while (!(newEmailId.contains("@")) || !(newEmailId.contains(".")) || newEmailId.endsWith(".")) {
							System.out.println("Please enter valid email address.");
							newEmailId = sc.next();
						}

						userDetails.setEmailId(newEmailId);
						System.out.println("Email address changed successfully.");
					}

					else if (indexOfInfoToBeChanged == 4) {
						System.out.println("Please enter new phone number.");
						String newphoneNumber = sc.next();
						while (newphoneNumber.length() != 10) {
							System.out.println(
									"Please enter a valid 10 digit phone number without any spaces in between.");
							newphoneNumber = sc.next();
						}

						userDetails.setPhoneNumber(newphoneNumber);
						System.out.println("Phone number changed successfully.");
					}

					else {
						System.out.println("Invalid Input. Operation Terminated.");

					}
					System.out.println(
							"Do you wish to change any other personal information? Please enter Y for Yes or enter any other input to exit.");
					anyOtherChangeNeeded = sc.next();
				} while (anyOtherChangeNeeded.equalsIgnoreCase("Y"));
			}

			System.out.println("Thank you for using our service!");

		}
	}
}
