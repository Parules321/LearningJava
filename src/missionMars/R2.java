package missionMars;

public class R2 extends Rocket {

	public R2() {
		rocketName = "R2";
		rocketCost = 120000000;
		rocketWeight = 18000;
		initialRocketWeight = 18000;
		maxWeightWithCargo = 29000;
		explosionChance = 0.04 * (cargoCarried / cargoLimit);
		crashChance = 0.08 * (cargoCarried / cargoLimit);
	}

	@Override
	public boolean launchRocket() {
		double randomValue = Math.random();
		if (randomValue > crashChance) {
			System.out.println("Rocket R2 launch successful!");
			return true;
		}

		else {
			System.out.println("Rocket R2 launch failed!");
			return false;
		}
	}

	@Override
	public boolean landRocket() {
		double randomValue = Math.random();
		if (randomValue > explosionChance) {
			System.out.println("Rocket R2 landing successful!");
			return true;
		}

		else {
			System.out.println("Rocket R2 landing fail!");
			return false;
		}

	}

}
