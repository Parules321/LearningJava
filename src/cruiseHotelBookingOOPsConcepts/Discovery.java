package cruiseHotelBookingOOPsConcepts;

import java.util.Scanner;

public class Discovery extends CruiseBooking {

	public Discovery() {
		super.booking = getBooking();
		super.noOfDays = getNoOfDays();
		super.adultDailyPrice = getAdultDailyPrice();
		super.kidDailyPrice = getKidDailyPrice();
		super.adultMealPrice = getAdultMealPrice();
		super.kidMealPrice = getKidMealPrice();

	}

	public String getBooking() {
		booking = "Discovery Cruise";
		return booking;
	}

	public int getNoOfDays() {
		noOfDays = 4;
		return noOfDays;
	}

	public double getAdultDailyPrice() {
		adultDailyPrice = 39.99;
		return adultDailyPrice;
	}

	public double getKidDailyPrice() {
		kidDailyPrice = 9.99;
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

	@Override
	public double getAddOnCost(Scanner sc) {
		System.out.println(
				"Do you want to pre-book our Adventure Games at one time entry fee of $50 per person.\nPlease enter Y to prebook or enter any other input if you do not want to prebook.");
		double gameFee = 50.00;
		String addOnRequired = sc.nextLine().trim();
		if (addOnRequired.equalsIgnoreCase("Y")) {
			System.out.println(
					"Please select number of persons.Kids under five can accompany you for free but are not allowed to play adventure games.");
			int noOfPeople = Integer.parseInt(sc.nextLine().trim());
			while (noOfPeople > noOfAdults + noOfKids) {
				System.out.println(
						"Numbers of persons can not be more than total of number of adults and no of kids above five. Please select number of persons again.");
				noOfPeople = Integer.parseInt(sc.nextLine().trim());
			}
			addOnCost = noOfPeople * gameFee;
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
