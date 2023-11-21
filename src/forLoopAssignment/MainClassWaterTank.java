package forLoopAssignment;

public class MainClassWaterTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaterTank waterTank = new WaterTank();

		waterTank.tankCapacityInLtrs = 100;
		waterTank.bucketCapacityInLtrs = 10;
		waterTank.breakPointInLtrs = 90;

		waterTank.calculateWaterLevel();

	}

}
