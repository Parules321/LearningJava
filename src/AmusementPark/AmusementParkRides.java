package AmusementPark;

public class AmusementParkRides {

	double height;

	void allowRide() {
		if (height >= 90 && height <= 200) {
			System.out.println("Allowed to ride");
		} else {
			System.out.println("Not allowed to ride due to height.");
		}
	}

}
