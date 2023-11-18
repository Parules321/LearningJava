package forLoopAssignment;

public class WaterTank {
	/*
	 * There is a water tank of capacity 100 litres. Water is filled into it using
	 * bucket which have capacity of 10 litres. Write a program which fills the tank
	 * to its capacity using these buckets. Also include a mechanism in your program
	 * to stop the tank from over flowing.
	 */

	int tankFilledInLtrs = 0;

	void fillWaterTank() {
		for (int useBucket = 1; useBucket < 11; useBucket++) {

			tankFilledInLtrs += 10;
			System.out.println(
					"Tank is filled " + tankFilledInLtrs + " ltrs using 10 ltrs bucket " + useBucket + " times.");
			if (tankFilledInLtrs == 100) {
				System.out.println("Tank has reached full capacity of 100 ltrs. Please stop to avoid overflow.");
				break;
			}
		}

	}

}
