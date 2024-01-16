package missionMars;

public class R1 extends Rocket {

	public R1() {
		rocketName = "R1";
		rocketCostInMillion = 100;
		rocketWeight = 10000;
		maxWeightWithCargo = 18000;
		cargoLimit = getCargoLimit();
	}

	@Override
	public double getExplosionChance() {
		launchExplosionChance = 0.05 * (cargoCarried / cargoLimit);
		return launchExplosionChance;
	}

	@Override
	public double getCrashChance() {
		landingCrashChance = 0.01 * (cargoCarried / cargoLimit);
		return landingCrashChance;
	}

	@Override
	public boolean launchRocket(double explosionChance) {
		double randomValue = Math.random();
		if (randomValue > explosionChance) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean landRocket(double crashChance) {
		double randomValue = Math.random();
		if (randomValue > crashChance) {
			return true;
		} else {
			return false;
		}
	}

}
