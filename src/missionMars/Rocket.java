package missionMars;

import java.util.ArrayList;

public class Rocket implements SpaceShip {

	public String rocketName;
	public long rocketCost;
	public int initialRocketWeight;
	public int rocketWeight;
	public int maxWeightWithCargo;
	public int cargoLimit;
	public int weightWithCargo;
	public int cargoCarried = rocketWeight - initialRocketWeight;
	public double explosionChance;
	public double crashChance;

	ArrayList<Item> items = new ArrayList<>();

	@Override
	public boolean launchRocket() {
		return true;
	}

	@Override
	public boolean landRocket() {
		return true;
	}

	@Override
	public void carry(Item item) {
		this.rocketWeight += item.getWeight();
	}

	public int getRocketWeight() {
		return this.rocketWeight;
	}

	@Override
	public boolean canCarry(Item item) {
		return (this.rocketWeight + item.getWeight()) <= this.maxWeightWithCargo;
	}

}
