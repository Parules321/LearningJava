package missionMars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import collections.Student;

public class Simulation {
	ArrayList<Item> items = new ArrayList<>();
	Rocket rocket1 = new R1();
	Rocket rocket2 = new R2();
	// int totalCargo;

	public ArrayList<Item> loadItems() {
		Scanner sc = null;
		File file = new File("C:\\JavaPractice\\ItemsToCarry.txt");
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] itemDetails;
		while (sc.hasNextLine()) {
			String itemLine = sc.nextLine();
			itemDetails = itemLine.split("=");
			items.add(new Item(itemDetails[0], Integer.parseInt(itemDetails[1])));
		}
		return items;
	}

	public ArrayList<ArrayList<Item>> loadU1(ArrayList<Item> items) {
		ArrayList<ArrayList<Item>> r1s = new ArrayList<>();
		int i = 0; // index counter i
		for (Item item : items) {
			rocket1.carry(item);
			r1s.add(i, items);
			// Not able to do this. Not understanding the proper way to add few elements
			// from object arraylist as one element to other array list.
			if (!rocket1.canCarry(item)) {
				i += 1;
			}
			;
		}

		return r1s;
	}

	public ArrayList<ArrayList<Item>> loadU2(ArrayList<Item> items) {
		ArrayList<ArrayList<Item>> r2s = new ArrayList<>();
		int i = 0; // index counter i
		for (Item item : items) {
			rocket2.carry(item);
			r2s.add(i, items);
			// Not able to do this. Not understanding the proper way to add few elements
			// from object arraylist as one element to other array list.
			if (!rocket2.canCarry(item)) {
				i += 1;
			}
			;
		}

		return r2s;
	}

	public void runSimulation(ArrayList<ArrayList<Item>> listOfRockets) {
		double costOfAllRockets;
		for (ArrayList<Item> rocket : listOfRockets) {
			if (listOfRockets == loadU1(loadItems())) {
				while (!rocket1.launchRocket() || !rocket1.landRocket()) {
					System.out.println("Sending " + rocket1.rocketName + " again.");
					rocket1.rocketCost += rocket1.rocketCost;
					if (rocket1.launchRocket() && rocket1.landRocket()) {
						System.out.println("Rocket Launch and Land Successful!");
					}
				}
			}

			else if (listOfRockets == loadU2(loadItems())) {
				while (!rocket2.launchRocket() || !rocket2.landRocket()) {
					System.out.println("Sending " + rocket2.rocketName + " again.");
					rocket2.rocketCost += rocket2.rocketCost;
					if (rocket2.launchRocket() && rocket2.landRocket()) {
						System.out.println("Rocket Launch and Land Successful!");
					}
				}
			}
		}

		if (listOfRockets == loadU1(loadItems())) {
			costOfAllRockets = rocket1.rocketCost;
			System.out.println("Total cost for " + rocket1.rocketName + " fleet: ${" + costOfAllRockets + "}");
		} else {
			costOfAllRockets = rocket1.rocketCost;
			System.out.println("Total cost for " + rocket2.rocketName + " fleet: ${" + costOfAllRockets + "}");
		}

	}
}