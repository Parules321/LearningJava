package loops;

import java.util.Scanner;

public class HalloweenCandyCollectionWhileExample {

	int noOfChocolates;
	boolean mamaCalledMeBack;
	Scanner sc = new Scanner(System.in);

	void trickAndTreat() {

		while (noOfChocolates < 11) {

			if (mamaCalledMeBack) {
				System.out.println("Tough luck son. Mama wants u back so no more chocolates for you.");
				break;
			}
			System.out.println("Total Chocolates: " + noOfChocolates);
			noOfChocolates++;

			if (noOfChocolates != 11) {
				System.out.println("Go to houses.");

				System.out.println("Trick or Treat");
				System.out.println("Did mama call you back yet?");
				mamaCalledMeBack = sc.nextBoolean();

			} else {
				System.out.println("Stop collecting chocolates and return to your house.");

			}
		}
	}
}
