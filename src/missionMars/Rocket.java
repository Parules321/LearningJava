package missionMars;

import java.util.ArrayList;

public class Rocket implements SpaceShip {

	protected String rocketName;
	protected int rocketCostInMillion;
	protected int rocketWeight;
	protected int maxWeightWithCargo;
	protected int cargoCarried;
	protected int cargoLimit;
	protected double launchExplosionChance;
	protected double landingCrashChance;
	protected int weightWithCargo;

	public int getCargoLimit() {
		cargoLimit = maxWeightWithCargo - rocketWeight;
		return cargoLimit;
	}

	public int getWeightWithCargo() {
		this.weightWithCargo = this.rocketWeight + cargoCarried;
		return weightWithCargo;
	}

	public int getCargoCarried(Item item) {
		cargoCarried += item.getWeight();
		return cargoCarried;
	}

	@Override // setting weight here so separate setter method not needed
	public void carry(int weightWithCargo) {
		this.weightWithCargo = weightWithCargo;
	}

	@Override
	public boolean canCarry(int cargoCarried) {
		if (cargoCarried <= this.cargoLimit) {
			return true;
		} else {
			return false;
		}
	}

	public double getExplosionChance() {
		return launchExplosionChance;
	}

	public double getCrashChance() {
		return landingCrashChance;
	}

	@Override
	public boolean launchRocket(double explosionChance) {
		return true;
	}

	@Override
	public boolean landRocket(double crashChance) {
		return true;
	}

}
