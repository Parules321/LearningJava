package forLoopAssignment;

import java.util.Scanner;

public class AmusementPark {

	/*
	 * In Amusement park, a ride can carry max 10 people. Write a code to help the
	 * operator from overfilling the ride i.e more than 10 people should not be
	 * allowed to get on the ride. Also ensure that the people getting on the ride
	 * meets the height criteria , Height of person should be greater than 90 cm but
	 * less than 200 cm.
	 */

	Scanner sc = new Scanner(System.in);

	double minHeightInCms;
	double maxHeightInCms;
	double actualHeight;
	int rideCapacity;
	int noOfPeopleOnTheRide;

	void runTheRide() {
		while (noOfPeopleOnTheRide < rideCapacity) {
			System.out.println("Please type your height in cms and press enter. Only numbers should be typed.");
			
			actualHeight = sc.nextDouble();
			
			if(!(actualHeight>minHeightInCms && actualHeight<maxHeightInCms)) {System.out.println("Not allowed to ride due to height"); continue;}
			
			else {System.out.println("Allowed as Height is within the range and ride capacity not reached yet."); noOfPeopleOnTheRide++;}

		}
		
		System.out.println("No more people allowed as maximum capacity of the ride reached.");

	}
}
