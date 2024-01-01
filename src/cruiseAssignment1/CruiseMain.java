package cruiseAssignment1;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) {
		UserDetails userInfo = new UserDetails();
		Scanner sc = new Scanner(System.in);
		Cruise cruise = new Cruise();
		String selectionConfirmation = "";
		ScenicCruise scenicCruise = null;
		SunsetCruise sunsetCruise = null;
		MysteryCruise mysteryCruise = null;
		DiscoveryCruise discoveryCruise = null;

		userInfo.setName(userInfo.getName(sc));
		userInfo.setPhoneNo(userInfo.getPhoneNo(sc));
		userInfo.setEmailId(userInfo.getEmailId(sc));
		userInfo.setUserName(userInfo.getUserName(sc));
		userInfo.setPassword(userInfo.getPassword(sc));
		userInfo.logIn(sc);

		do {
			cruise.setCruiseSelected(cruise.getCruiseSelected(sc));
			cruise = cruise.cruiseSelected.equalsIgnoreCase("Scenic Cruise") ? new ScenicCruise()
					: cruise.cruiseSelected.equalsIgnoreCase("Mystery Cruise") ? new MysteryCruise()
							: cruise.cruiseSelected.equalsIgnoreCase("Sunset Cruise") ? new SunsetCruise()
									: cruise.cruiseSelected.equalsIgnoreCase("Discovery Cruise") ? new DiscoveryCruise()
											: null;
			// instanceof keyword to check if object is of the correct reference type and
			// avoid classcast e.
			if (cruise instanceof ScenicCruise) {
				scenicCruise = (ScenicCruise) cruise;
				scenicCruise.displaySelectedCruiseDetails(scenicCruise.cruiseName, scenicCruise.noOfDays,
						scenicCruise.dailyFareAdult, scenicCruise.dailyFareKid);

			} else if (cruise instanceof SunsetCruise) {
				sunsetCruise = (SunsetCruise) cruise;
				sunsetCruise.displaySelectedCruiseDetails(sunsetCruise.cruiseName, sunsetCruise.noOfDays,
						sunsetCruise.dailyFareAdult, sunsetCruise.dailyFareKid);
			} else if (cruise instanceof MysteryCruise) {
				mysteryCruise = (MysteryCruise) cruise;
				mysteryCruise.displaySelectedCruiseDetails(mysteryCruise.cruiseName, mysteryCruise.noOfDays,
						mysteryCruise.dailyFareAdult, mysteryCruise.dailyFareKid);
			} else if (cruise instanceof DiscoveryCruise) {
				discoveryCruise = (DiscoveryCruise) cruise;
				discoveryCruise.displaySelectedCruiseDetails(discoveryCruise.cruiseName, discoveryCruise.noOfDays,
						discoveryCruise.dailyFareAdult, discoveryCruise.dailyFareKid);
			}
			selectionConfirmation = sc.nextLine();
		}

		while (!selectionConfirmation.equalsIgnoreCase("Y"));

		if (cruise instanceof ScenicCruise) {
			scenicCruise.getNoOfAdults(sc);
			scenicCruise.getNoOfKidsOverFive(scenicCruise.getNoOfKids(sc), sc);
			scenicCruise.getIsMealSelected(scenicCruise.getIsSeparateBooking(sc), sc);
			scenicCruise.getTotalBill(scenicCruise.dailyFareAdult, scenicCruise.noOfDays, scenicCruise.dailyFareKid,
					scenicCruise.dailyMealCostAdult, scenicCruise.dailyMealCostKid);
			scenicCruise.displayCalculatedBill(scenicCruise.cruiseName, scenicCruise.dailyFareAdult,
					scenicCruise.noOfDays, scenicCruise.dailyFareKid, scenicCruise.dailyMealCostAdult,
					scenicCruise.dailyMealCostKid);
		}

		else if (cruise instanceof SunsetCruise) {
			sunsetCruise.getNoOfAdults(sc);
			sunsetCruise.getNoOfKidsOverFive(sunsetCruise.getNoOfKids(sc), sc);
			sunsetCruise.getIsMealSelected(sunsetCruise.getIsSeparateBooking(sc), sc);
			sunsetCruise.getTotalBill(sunsetCruise.dailyFareAdult, sunsetCruise.noOfDays, sunsetCruise.dailyFareKid,
					sunsetCruise.dailyMealCostAdult, sunsetCruise.dailyMealCostKid);
			sunsetCruise.displayCalculatedBill(sunsetCruise.cruiseName, sunsetCruise.dailyFareAdult,
					sunsetCruise.noOfDays, sunsetCruise.dailyFareKid, sunsetCruise.dailyMealCostAdult,
					sunsetCruise.dailyMealCostKid);
		}

		else if (cruise instanceof MysteryCruise) {
			mysteryCruise.getNoOfAdults(sc);
			mysteryCruise.getNoOfKidsOverFive(mysteryCruise.getNoOfKids(sc), sc);
			mysteryCruise.getIsMealSelected(mysteryCruise.getIsSeparateBooking(sc), sc);
			mysteryCruise.getTotalBill(mysteryCruise.dailyFareAdult, mysteryCruise.noOfDays, mysteryCruise.dailyFareKid,
					mysteryCruise.dailyMealCostAdult, mysteryCruise.dailyMealCostKid);
			mysteryCruise.displayCalculatedBill(mysteryCruise.cruiseName, mysteryCruise.dailyFareAdult,
					mysteryCruise.noOfDays, mysteryCruise.dailyFareKid, mysteryCruise.dailyMealCostAdult,
					mysteryCruise.dailyMealCostKid);
		}

		else if (cruise instanceof DiscoveryCruise) {
			discoveryCruise.getNoOfAdults(sc);
			discoveryCruise.getNoOfKidsOverFive(discoveryCruise.getNoOfKids(sc), sc);
			discoveryCruise.getIsMealSelected(discoveryCruise.getIsSeparateBooking(sc), sc);
			discoveryCruise.getTotalBill(discoveryCruise.dailyFareAdult, discoveryCruise.noOfDays,
					discoveryCruise.dailyFareKid, discoveryCruise.dailyMealCostAdult, discoveryCruise.dailyMealCostKid);
			discoveryCruise.displayCalculatedBill(discoveryCruise.cruiseName, discoveryCruise.dailyFareAdult,
					discoveryCruise.noOfDays, discoveryCruise.dailyFareKid, discoveryCruise.dailyMealCostAdult,
					discoveryCruise.dailyMealCostKid);
		}

		userInfo.changeInfo(userInfo.isPassWordValidated(sc), sc);

	}
}
