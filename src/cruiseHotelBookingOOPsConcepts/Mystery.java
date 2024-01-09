package cruiseHotelBookingOOPsConcepts;

import java.util.Scanner;

public class Mystery extends CruiseBooking {

	public Mystery() {
		super.booking = getBooking();
		super.noOfDays = getNoOfDays();
		super.adultDailyPrice = getAdultDailyPrice();
		super.kidDailyPrice = getKidDailyPrice();
		super.adultMealPrice = getAdultMealPrice();
		super.kidMealPrice = getKidMealPrice();

	}

	public String getBooking() {
		booking = "Mystery Cruise";
		return booking;
	}

	public int getNoOfDays() {
		noOfDays = 2;
		return noOfDays;
	}

	public double getAdultDailyPrice() {
		adultDailyPrice = 45.99;
		return adultDailyPrice;
	}

	public double getKidDailyPrice() {
		kidDailyPrice = 12.99;
		return kidDailyPrice;
	}

	public double getAdultMealPrice() {
		adultMealPrice = 20.99;
		return adultMealPrice;
	}

	public double getKidMealPrice() {
		kidMealPrice = 4.99;
		return kidMealPrice;
	}

//	public void setNoOfPersons(int noOfPersons) {
//		this.noOfPersons = noOfPersons;
//	}

//	public void setNoOfAddonCost(int addOnCost) {
//		addOnCost = addOnCost;
//	}

	@Override
	public double getAddOnCost(Scanner sc) {
		System.out.println(
				"Do you want to pre-book our Casino at one time entry fee of $20 per person.\nEntry is allowed only for those above 18 years old with valid ID card.\nPlease enter Y to prebook or enter any other input if you do not want to prebook.");
		double casinoFee = 20.00;
		String addOnRequired = sc.nextLine().trim();
		if (addOnRequired.equalsIgnoreCase("Y")) {
			System.out.println("Please select number of persons.");
			int noOfPeople = Integer.parseInt(sc.nextLine().trim());
			while (noOfPeople > noOfAdults) {
				System.out.println(
						"Numbers of persons can not be more than total number of adults. Please select number of persons again.");
				noOfPeople = Integer.parseInt(sc.nextLine().trim());
			}
			addOnCost = noOfPeople * casinoFee;
			return addOnCost;
		} else {
			return addOnCost = 0;
		}
	}

	@Override
	public void setAddOnCost(double addOnCost) {
		super.addOnCost = addOnCost;

	}
}
