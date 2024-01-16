package missionMars;

public interface SpaceShip {

	boolean launchRocket(double explosionChance);

	boolean landRocket(double crashChance);

	void carry(int weight);

	boolean canCarry(int cargoCarried);

}
