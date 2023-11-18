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

	double heightInCms;

	int peopleWaitingToBeAdmitted;
	int rider = 1;

	void rideCriteraAndCapacity() {

		System.out.println("Please type the number of people in line who are waiting to ride and press enter.");

		peopleWaitingToBeAdmitted = sc.nextInt();

		for (int entryDecision = 0; entryDecision < peopleWaitingToBeAdmitted; entryDecision++) {
			System.out.println(
					"Person in line - Please enter your height below in centimeters. Please type only the number and press enter.");

			heightInCms = sc.nextDouble();

			if (heightInCms > 90 && heightInCms < 200) {
				System.out.println("You meet the height criteria and are rider no. " + rider++);
				if (rider == 11) {
					System.out.println(
							"Sorry, next person in line. Maximum limit is reached and no more people are allowed as the ride can carry max 10 people.");
					break;
				}
			}

			else {
				System.out.println("You are not allowed to get on this ride as you do not meet the height criteria.");

			}
		}
	}
}
