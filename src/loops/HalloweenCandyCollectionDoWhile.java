package loops;

import java.util.Scanner;

public class HalloweenCandyCollectionDoWhile {

	int noOfChocolates;
	boolean isSnowingHeavily;
	Scanner sc = new Scanner(System.in);

	void trickAndTreating() {
		do {
			System.out.println("Go to houses");
			System.out.println("Trick or Treat");
			System.out.println("Is it snowing");
			isSnowingHeavily = sc.nextBoolean();
			if (isSnowingHeavily) {
				System.out.println(
						"Its snowing heavily so no more chocolates will be collected. Please return to your house.");
				break;
			}
			noOfChocolates++;
			System.out.println("Total Chocolates: " + noOfChocolates);
		} while (noOfChocolates < 10);

	}
}
