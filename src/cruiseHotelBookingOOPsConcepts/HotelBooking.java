package cruiseHotelBookingOOPsConcepts;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelBooking extends MyBookings {

	@Override
	public void displaySelectedDetails() {
		System.out.println("Please enter the room you want to select - Deluxe Suite or Family Suite"
				+ "\nDeluxe Suite: accommodates 2 adults and 2 children at the rate "
				+ "of $180/ night\nFamily Suite: accommodates 4 adults and" + " 4 children at $230/ night");
	}

	public boolean getMealSelection(Scanner sc) {
		System.out.println(
				"All rooms come with free breakfast.\nDo you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child?.\nPlease enter Y to prebook or enter any other input if you do not want to prebook.");

		String mealSelected = sc.nextLine().trim();

		if (mealSelected.equalsIgnoreCase("Y")) {
			return isMealSelected = true;
		} else {
			return isMealSelected = false;
		}
	}

	@Override
	public double getTax() {
		return 0.18;
	}

	@Override
	public void setTax(double tax) {
		super.tax = tax;
	}

	@Override
	public double calculateTotalPrice(Scanner sc) {

		if (getMealSelection(sc)) {
			totalPrice = (dailyPrice * noOfRooms * noOfDays) + +(adultMealPrice * noOfAdults * noOfDays)
					+ (kidMealPrice * noOfKids * noOfDays);
		} else {
			totalPrice = dailyPrice * noOfRooms * noOfDays;
		}
		return totalPrice;
	}

	@Override
	public void displayCalculatedBill() {
		setTax(getTax());
		System.out.println("The total amount you will be charged is:");
		System.out.println(booking + "\t\t@ " + noOfDays + " nights\t:\t\t$"
				+ new DecimalFormat("0.00").format(dailyPrice * noOfRooms * noOfDays));
		if (isMealSelected) {
			System.out.println("Lunch Pre-Booked Special Rate Adults	@ " + noOfAdults + "\t@\t$"
					+ new DecimalFormat("0.00").format(adultMealPrice * noOfAdults * noOfDays));
		}
		if (isMealSelected && noOfKids > 0) {
			System.out.println("Lunch Pre-Booked Special Rate Children	@ " + noOfKids + "\t@\t$"
					+ new DecimalFormat("0.00").format(kidMealPrice * noOfKids * noOfDays));
		}

		System.out.println("Total Price\t\t\t\t:\t\t$" + new DecimalFormat("0.00").format(totalPrice)
				+ "\nHST\t@18%\t\t\t\t:\t\t$" + new DecimalFormat("0.00").format(totalPrice * tax)
				+ "\nFinal Price\t\t\t\t:\t\t$" + new DecimalFormat("0.00").format((totalPrice + totalPrice * tax)));

	}

}
