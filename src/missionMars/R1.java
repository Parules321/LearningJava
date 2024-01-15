package missionMars;

public class R1 extends Rocket {

	public R1() {
		rocketName = "R1";
		rocketCost = 100000000;
		rocketWeight = 10000;
		initialRocketWeight = 10000;
		maxWeightWithCargo = 18000;
		explosionChance = 0.05 * (cargoCarried / cargoLimit);
		crashChance = 0.01 * (cargoCarried / cargoLimit);
	}

	@Override
	public boolean launchRocket() {
		double randomValue = Math.random();
		if (randomValue > crashChance) {
			System.out.println("Rocket R1 launch successful!");
			return true;
		}

		else {
			System.out.println("Rocket R1 launch failed!");
			return false;
		}
	}

	@Override
	public boolean landRocket() {
		double randomValue = Math.random();
		if (randomValue > explosionChance) {
			System.out.println("Rocket R1 landing successful!");
			return true;
		}

		else {
			System.out.println("Rocket R1 landing fail!");
			return false;
		}

	}

}
