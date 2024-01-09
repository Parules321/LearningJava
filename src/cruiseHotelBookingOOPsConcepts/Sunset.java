package cruiseHotelBookingOOPsConcepts;

import java.util.Scanner;

public class Sunset extends CruiseBooking {
	public Sunset() {
		super.booking = getBooking();
		super.noOfDays = getNoOfDays();
		super.adultDailyPrice = getAdultDailyPrice();
		super.kidDailyPrice = getKidDailyPrice();
		super.adultMealPrice = getAdultMealPrice();
		super.kidMealPrice = getKidMealPrice();
	}

	public String getBooking() {
		booking = "Sunset Cruise";
		return booking;
	}

	public int getNoOfDays() {
		noOfDays = 1;
		return noOfDays;
	}

	public double getAdultDailyPrice() {
		adultDailyPrice = 52.99;
		return adultDailyPrice;
	}

	public double getKidDailyPrice() {
		kidDailyPrice = 15.99;
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

	public double getAddOnCost(Scanner sc) {
		System.out.println(
				"Do you want to pre-book special Candle Light Dinner at the cost of $45 per person.\nPlease enter Y to prebook or enter any other input if you do not want to prebook.");
		double dinnerCost = 45.00;
		String addOnRequired = sc.nextLine().trim();
		if (addOnRequired.equalsIgnoreCase("Y")) {
			System.out.println(
					"Please select number of persons. Kids under five can accompany you for free, please do not include them here");
			int noOfPeople = Integer.parseInt(sc.nextLine().trim());
			while (noOfPeople > noOfAdults + noOfKids) {
				System.out.println(
						"Numbers of persons can not be more than total of number of adults and no of kids above five. Please select number of persons again.");
				noOfPeople = Integer.parseInt(sc.nextLine().trim());
			}
			addOnCost = noOfPeople * dinnerCost;
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
