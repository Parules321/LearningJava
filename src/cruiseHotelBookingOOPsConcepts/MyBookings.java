package cruiseHotelBookingOOPsConcepts;

import java.util.Scanner;

public abstract class MyBookings {
	String booking;
	int noOfDays;
	double tax, totalPrice, adultDailyPrice, kidDailyPrice, adultMealPrice, kidMealPrice, dailyPrice;
	int noOfAdults, noOfKids, noOfRooms;
	double addOnCost;
	boolean isMealSelected;

	public abstract void displaySelectedDetails();

	public double getAddOnCost(Scanner sc) {
		return addOnCost;
	}

	public void setAddOnCost(double addOnCost) {
		this.addOnCost = addOnCost;
	}

	public abstract double getTax();

	public abstract void setTax(double tax);

	public abstract double calculateTotalPrice(Scanner sc);

	public abstract void displayCalculatedBill();
}
