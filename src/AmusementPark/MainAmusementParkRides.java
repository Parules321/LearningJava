package AmusementPark;

import java.util.Scanner;

public class MainAmusementParkRides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmusementParkRides checkHeight = new AmusementParkRides();

		Scanner sc = new Scanner(System.in);// checked dynamically using console.
		System.out.println("Enter height.");
		checkHeight.height = sc.nextInt();// Values checked using boundary value analysis are height
											// -89,90,91,199,200,201 cms.
		checkHeight.allowRide();

		sc.close();

	}

}
