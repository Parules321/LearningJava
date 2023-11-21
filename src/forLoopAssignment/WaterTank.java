package forLoopAssignment;

public class WaterTank {
	/*
	 * There is a water tank of capacity 100 litres. Water is filled into it using
	 * bucket which have capacity of 10 litres. Write a program which fills the tank
	 * to its capacity using these buckets. Also include a mechanism in your program
	 * to stop the tank from over flowing.
	 */

	int tankFilledInLtrs;
	int tankCapacityInLtrs;
	int bucketCapacityInLtrs;
	int breakPointInLtrs;

	void calculateWaterLevel() {

		for (tankFilledInLtrs = 0; tankFilledInLtrs <= breakPointInLtrs; tankFilledInLtrs += bucketCapacityInLtrs) {

			System.out.println("The water in tank now is " + tankFilledInLtrs + "ltrs.");

			if (tankFilledInLtrs == breakPointInLtrs) {
				System.out.println("Stop filling now to avoid overflow");
				break;
			}
		}
	}

}
