package missionMars;

public interface SpaceShip {

	boolean launchRocket();

	boolean landRocket();

	void carry(Item item);

	boolean canCarry(Item item);

}
