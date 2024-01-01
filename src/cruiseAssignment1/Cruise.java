package cruiseAssignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cruise {

	String cruiseSelected;
	int noOfAdults, noOfKids, noOfKidsOverFive;
	boolean isSeparateBooking, isMealSelected;
	double totalBill;

	public String getCruiseSelected(Scanner sc) {
		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.- \nScenic Cruise \nSunset Cruise \nDiscovery Cruise \nMystery Cruise");
		sc.nextLine();
		String cruiseSelected = sc.nextLine();

		while (!cruiseSelected.equalsIgnoreCase("Scenic Cruise") && !cruiseSelected.equalsIgnoreCase("Sunset Cruise")
				&& !cruiseSelected.equalsIgnoreCase("Discovery Cruise")
				&& !cruiseSelected.equalsIgnoreCase("Mystery Cruise")) {
			System.out.println("Please enter an option only from the 4 different packages availabe.");
			cruiseSelected = sc.nextLine();
		}
		return cruiseSelected;
	}

	public void setCruiseSelected(String cruiseSelected) {
		this.cruiseSelected = cruiseSelected;
	}

	public void displaySelectedCruiseDetails(String cruiseName, int noOfDays, double adultPricePerDay,
			double kidPricePerDay) {
		System.out.println("The cruise that you have selected is " + cruiseName + " which is a " + noOfDays
				+ " day cruise \nPrice for Adults(greater than 12)\t: " + adultPricePerDay
				+ " per day\nPrice for kids above 5\t\t\t: " + kidPricePerDay + " per day"
				+ "\nPlease press Y and enter if you want to continue with the selection or press any other alphabet to select another.");

	}

	public int getNoOfAdults(Scanner sc) {
		System.out.println("Enter the number of adults (over 12 years).");
		noOfAdults = sc.nextInt();
		return noOfAdults;

	}

	public int getNoOfKids(Scanner sc) {
		System.out.println("Enter the number of children");
		noOfKids = sc.nextInt();
		return noOfKids;
	}

	public int getNoOfKidsOverFive(int noOfKids, Scanner sc) {
		int age;
		if (noOfKids > 0) {
			for (int i = 1; i <= noOfKids; i++) {
				System.out.println("Enter the age of Child " + i);
				age = sc.nextInt();
				if (age > 12) {
					System.out.println("Sorry age of kid can not be greater than 12. We have removed child " + i
							+ " from the booking for kids. You may make a separate booking for this adult after you complete the present booking.");
					;
				} else if (age > 5 && age <= 12) {
					noOfKidsOverFive += 1;
				}
			}
		}
		return noOfKidsOverFive;
	}

	public boolean getIsSeparateBooking(Scanner sc) {
		String separateBookingForAdult = "";
		if (noOfAdults == 0 && noOfKids == 0) {
			System.out.println("Sorry, no bookings can be made when the passenger is 0.");
		}

		else if (noOfAdults == 0) {
			System.out.println(
					"Sorry, if there are no adults, cruise booking can not be made. If you've already booked separate tickets for adults, please enter Yes to confirm and proceed.");
			separateBookingForAdult = sc.next();
		}

		if (separateBookingForAdult.equalsIgnoreCase("Yes")) {
			return isSeparateBooking = true;
		}

		else {
			return false;
		}

	}

	public boolean getIsMealSelected(boolean isSeparateBooking, Scanner sc) {

		String mealSelection = null;
		if (noOfAdults > 0 || isSeparateBooking) {
			System.out.println("All our cruises have food service on board. "
					+ "\nDo you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids above 5 years?"
					+ "\nPlease enter Yes to prebook or enter any other input if you do not want to prebook.");
			mealSelection = sc.next();
		}

		if (mealSelection.equalsIgnoreCase("Yes")) {
			return isMealSelected = true;
		} else {
			return false;
		}
	}

	public double getTotalBill(double adultDailyFare, int noOfDays, double childDailyFare, double adultMealCost,
			double kidMealCost) {
		if (isMealSelected) {
			totalBill = adultDailyFare * noOfAdults * noOfDays + childDailyFare * noOfKidsOverFive * noOfDays
					+ adultMealCost * noOfAdults * noOfDays + kidMealCost * noOfKidsOverFive * noOfDays;
		} else {
			totalBill = adultDailyFare * noOfAdults * noOfDays + childDailyFare * noOfKidsOverFive * noOfDays;
		}
		return totalBill;
	}

	public void displayCalculatedBill(String cruiseName, double adultDailyFare, int noOfDays, double childDailyFare,
			double adultMealCost, double kidMealCost) {
		System.out.println("Your Package includes:");
		if (noOfAdults > 0) {
			System.out.println(cruiseName + " Adults\t\t\t@\t" + noOfAdults + "\t:$"
					+ new DecimalFormat("0.00").format(adultDailyFare * noOfAdults * noOfDays));
			if (isMealSelected) {
				System.out.println("Buffet Special Price Adults" + "\t\t@\t" + noOfAdults + "\t:$"
						+ new DecimalFormat("0.00").format(adultMealCost * noOfAdults * noOfDays));
			}

		}
		if (noOfKidsOverFive > 0) {
			System.out.println(cruiseName + " Children above 5\t\t@\t" + noOfKidsOverFive + "\t:$"
					+ new DecimalFormat("0.00").format(childDailyFare * noOfKidsOverFive * noOfDays));
			if (isMealSelected) {
				System.out.println("Buffet Special Price Children above 5" + "\t@\t" + noOfKidsOverFive + "\t:$"
						+ new DecimalFormat("0.00").format(kidMealCost * noOfKidsOverFive * noOfDays));
			}
		}

		System.out.println("Total Price\t\t\t\t\t\t:$" + new DecimalFormat("0.00").format(totalBill)
				+ "\nHST\t@15%\t\t\t\t\t\t:$" + new DecimalFormat("0.00").format(totalBill * 0.15)
				+ "\nFinal Price\t\t\t\t\t\t:$" + new DecimalFormat("0.00").format((totalBill + totalBill * 0.15)));

	}

}
