package cruiseAssignmentDec22;

import java.text.DecimalFormat;

public class Cruise {

	String nameOfCruise;
	int numberOfDays;
	double adultSelectedCruisePricePerDay;
	double childAboveFiveSelectedCruisePricePerDay;
	double dailyMealPriceForAdult = 20.99;
	double dailyMealPriceForChildAboveFive = 4.99;
	int numberOfAdults;
	int numberOfChildrenAboveFive;
	String mealSelection;
	double totalBill;

	public Cruise(String nameOfCruise, int numberOfDays, double adultSelectedCruisePricePerDay,
			double childAboveFiveSelectedCruisePricePerDay) {
		this.nameOfCruise = nameOfCruise;
		this.numberOfDays = numberOfDays;
		this.adultSelectedCruisePricePerDay = adultSelectedCruisePricePerDay;
		this.childAboveFiveSelectedCruisePricePerDay = childAboveFiveSelectedCruisePricePerDay;
	}

	public Cruise() {
	};// overloading constructor to create reference variable of parent class in main
	// class for upcasting later

	public void displaySelectedCruiseDetails() {
		System.out.println("The cruise that you have selected is " + nameOfCruise + " which is a " + numberOfDays
				+ " day cruise \nPrice for Adults(greater than 12)\t: " + adultSelectedCruisePricePerDay
				+ " per day\nPrice for kids above 5\t\t\t: " + childAboveFiveSelectedCruisePricePerDay + " per day");

	}

	public void setNumberOfAdults(int numberOfAdultsByUser) {
		this.numberOfAdults = numberOfAdultsByUser;
	}

	public void setNumberOfChildrenAboveFive(int numberOfChildrenAboveFiveByUser) {
		this.numberOfChildrenAboveFive = numberOfChildrenAboveFiveByUser;
	}

	public void setMealSelection(String mealSelectionDone) {
		this.mealSelection = mealSelectionDone;
	}

	public double getTotalBill() {
		if (mealSelection.equalsIgnoreCase("Yes")) {
			totalBill = adultSelectedCruisePricePerDay * numberOfAdults * numberOfDays
					+ childAboveFiveSelectedCruisePricePerDay * numberOfChildrenAboveFive * numberOfDays
					+ dailyMealPriceForAdult * numberOfAdults * numberOfDays
					+ dailyMealPriceForChildAboveFive * numberOfChildrenAboveFive * numberOfDays;
		} else {
			totalBill = adultSelectedCruisePricePerDay * numberOfAdults * numberOfDays
					+ childAboveFiveSelectedCruisePricePerDay * numberOfChildrenAboveFive * numberOfDays;
		}
		return totalBill;
	}

	public void displayCalculatedBill() {
		System.out.println("Your Package includes:");
		if (numberOfAdults > 0) {
			System.out.println(nameOfCruise + " Adults\t\t\t@\t" + numberOfAdults + "\t:$"
					+ new DecimalFormat("0.00").format(adultSelectedCruisePricePerDay * numberOfAdults * numberOfDays));
			if (mealSelection.equalsIgnoreCase("Yes")) {
				System.out.println("Buffet Special Price Adults" + "\t\t@\t" + numberOfAdults + "\t:$"
						+ new DecimalFormat("0.00").format(dailyMealPriceForAdult * numberOfAdults * numberOfDays));
			}

		}
		if (numberOfChildrenAboveFive > 0) {
			System.out.println(nameOfCruise + " Children above 5\t\t@\t" + numberOfChildrenAboveFive + "\t:$"
					+ new DecimalFormat("0.00").format(
							childAboveFiveSelectedCruisePricePerDay * numberOfChildrenAboveFive * numberOfDays));
			if (mealSelection.equalsIgnoreCase("Yes")) {
				System.out.println("Buffet Special Price Children above 5" + "\t@\t" + numberOfChildrenAboveFive
						+ "\t:$" + new DecimalFormat("0.00")
								.format(dailyMealPriceForChildAboveFive * numberOfChildrenAboveFive * numberOfDays));
			}
		}

		System.out.println("Total Price\t\t\t\t\t\t:$" + new DecimalFormat("0.00").format(getTotalBill())
				+ "\nHST\t@15%\t\t\t\t\t\t:$" + new DecimalFormat("0.00").format(getTotalBill() * 0.15)
				+ "\nFinal Price\t\t\t\t\t\t:$"
				+ new DecimalFormat("0.00").format((getTotalBill() + getTotalBill() * 0.15)));

	}

}
