package cruiseHotelBookingOOPsConcepts;

import java.util.Scanner;

public class BookingsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GuestDetails guest = new GuestDetails();
		MyBookings booking = null;
		boolean isExtraBooking = true;
		MyBookings[] bookings = new MyBookings[6];
		int n = 0;
		System.out.println("Welcome, Guest! Please sign up to book a service.");
		guest.registerUser(sc);
		while (isExtraBooking && n < 6) {
			boolean isService = false;
			while (!(isService)) {
				System.out.println("Which is the service you want to book - please enter either Hotel or Cruise.");
				String service = sc.nextLine();

				if (service.equalsIgnoreCase("hotel")) {
					isService = true;
					System.out.println("Please enter the room you want to select -"
							+ "\nDeluxe Suite: accommodates 2 adults and 2 children at the rate "
							+ "of $180/ night\nFamily Suite: accommodates 4 adults and" + " 4 children at $230/ night");
					String hotelSelected = sc.nextLine();
					while (!hotelSelected.equalsIgnoreCase("Deluxe Suite")
							&& !hotelSelected.equalsIgnoreCase("Family Suite")) {
						System.out.println("Please enter an option only from Deluxe Suite or Family Suite availabe.");
						hotelSelected = sc.nextLine();
					}
					booking = hotelSelected.equalsIgnoreCase("Deluxe Suite") ? new DeluxeHotel()
							: hotelSelected.equalsIgnoreCase("Family Suite") ? new FamilySuite() : null;
					bookings[n] = booking;
				}

				else if (service.equalsIgnoreCase("cruise")) {
					isService = true;
					boolean isSelectionConfirmed = false;
					while (!isSelectionConfirmed) {
						System.out.println(
								"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.- \nScenic Cruise \nSunset Cruise \nDiscovery Cruise \nMystery Cruise");
						String cruiseSelected = sc.nextLine();
						while (!cruiseSelected.equalsIgnoreCase("Scenic Cruise")
								&& !cruiseSelected.equalsIgnoreCase("Sunset Cruise")
								&& !cruiseSelected.equalsIgnoreCase("Discovery Cruise")
								&& !cruiseSelected.equalsIgnoreCase("Mystery Cruise")) {
							System.out.println("Please enter an option only from the 4 different packages availabe.");
							cruiseSelected = sc.nextLine();
						}
						booking = cruiseSelected.equalsIgnoreCase("Scenic Cruise") ? new Scenic()
								: cruiseSelected.equalsIgnoreCase("Mystery Cruise") ? new Mystery()
										: cruiseSelected.equalsIgnoreCase("Sunset Cruise") ? new Sunset()
												: cruiseSelected.equalsIgnoreCase("Discovery Cruise") ? new Discovery()
														: null;
						bookings[n] = booking;
						booking.displaySelectedDetails();
						String selectionConfirmation = sc.nextLine().trim();
						if (selectionConfirmation.equalsIgnoreCase("Y")) {
							isSelectionConfirmed = true;
						}
					}
				}
			}
			booking.calculateTotalPrice(sc);
			booking.displayCalculatedBill();
			System.out.println(
					"Do you want to book another Hotel Room or Cruise. Please enter Y for Yes or any other input for No ");
			String extraBooking = sc.nextLine().trim();
			if (!(extraBooking.equalsIgnoreCase("Y"))) {
				isExtraBooking = false;
			} else {
				n += 1;
			}
		}

		if (n == 6) {
			System.out.println("Our system shows you've already completed 6 separate bookings in this session."
					+ "\nIf you need to make another booking,  please start a separate session.\n");
		}
		System.out.println("\nThank you for booking with us. Here is a list of your recent bookings-\n");
		try {
			for (int i = 0; i < bookings.length; i++) {
				System.out.println(" -" + bookings[i].booking + " for " + bookings[i].noOfAdults + " adults "
						+ "and for " + bookings[i].noOfKids + " kids for " + bookings[i].noOfDays
						+ " days for total cost of " + bookings[i].totalPrice + " plus taxes.\n");
			}
		} catch (NullPointerException npe) {
			// TODO: handle exception
		}
		guest.changeInfo(guest.isPassWordValidated(sc), sc);
	}

}
