package missionMars;

public class R2 extends Rocket {

	public R2() {
		rocketName = "R2";
		rocketCostInMillion = 120;
		rocketWeight = 18000;
		maxWeightWithCargo = 29000;
		cargoLimit = getCargoLimit();
	}

	@Override
	public double getExplosionChance() {
		launchExplosionChance = 0.04 * (cargoCarried / cargoLimit);
		return launchExplosionChance;
	}

	@Override
	public double getCrashChance() {
		landingCrashChance = 0.08 * (cargoCarried / cargoLimit);
		return landingCrashChance;
	}

	@Override
	public boolean launchRocket(double explosionChance) {
		double randomValue = Math.random();
		if (randomValue > launchExplosionChance) {
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
