package missionMars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import collections.Student;

public class Simulation {
	long totalRocketCost;

	public ArrayList<Item> loadItems() {
		ArrayList<Item> items = new ArrayList<>();
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

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		Rocket rocket = new R1();
		rockets.add(rocket);
		for (Item item : items) {
			if (rocket.canCarry(rocket.getCargoCarried(item))) {
				rocket.carry(rocket.getWeightWithCargo());
			} else {
				rocket = new R1();
				rockets.add(rocket);
				if (rocket.canCarry(rocket.getCargoCarried(item))) {
					rocket.carry(rocket.getWeightWithCargo());
				}
			}
		}
		return rockets;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		Rocket rocket = new R2();
		rockets.add(rocket);
		for (Item item : items) {
			if (rocket.canCarry(rocket.getCargoCarried(item))) {
				rocket.carry(rocket.getWeightWithCargo());
			} else {
				rocket = new R2();
				rockets.add(rocket);
				if (rocket.canCarry(rocket.getCargoCarried(item))) {
					rocket.carry(rocket.getWeightWithCargo());
				}
			}
		}
		return rockets;
	}

	public void runSimulation(ArrayList<Rocket> rockets) {

		for (Rocket rocket : rockets) {
			if (rocket.launchRocket(rocket.getExplosionChance()) && rocket.landRocket(rocket.getCrashChance())) {
				System.out
						.println("Congratulations! Rocket" + rocket.rocketName + " launched and landed successfully!");
				totalRocketCost += rocket.rocketCostInMillion;
			}
			while (!rocket.launchRocket(rocket.getExplosionChance()) || !rocket.landRocket(rocket.getCrashChance())) {
				if (!rocket.launchRocket(rocket.getExplosionChance())) {
					System.out.println("Sending " + rocket.rocketName + " again as launch unsuccessful.");
					totalRocketCost += rocket.rocketCostInMillion;
				} else {
					System.out.println("Sending " + rocket.rocketName + " again as landing unsuccessful.");
					totalRocketCost += rocket.rocketCostInMillion;
				}

			}
		}

	}
}
