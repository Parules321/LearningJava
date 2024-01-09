package cruiseHotelBookingOOPsConcepts;

import java.util.Scanner;

public abstract class MyBookings {
	public String booking;
	public int noOfDays;
	public double tax, totalPrice, adultDailyPrice, kidDailyPrice, adultMealPrice, kidMealPrice, dailyPrice;
	public int noOfAdults, noOfKids, noOfRooms;
	public double addOnCost;
	public boolean isMealSelected;

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
