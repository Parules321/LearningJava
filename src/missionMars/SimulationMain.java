package missionMars;

public class SimulationMain {

	public static void main(String[] args) {
		Simulation simulation = new Simulation();

		simulation.runSimulation(simulation.loadU1(simulation.loadItems()));
		double costFirstFleet = simulation.totalRocketCost;
		System.out
				.println("\n-------------------------------------------------------------\nTotal cost for R1 fleet: ${"
						+ costFirstFleet + "million}\n-------------------------------------------------------------\n");
		simulation.runSimulation(simulation.loadU2(simulation.loadItems()));
		double costSecondFleet = simulation.totalRocketCost - costFirstFleet;
		System.out
				.println("\n-------------------------------------------------------------\nTotal cost for R2 fleet: ${"
						+ costSecondFleet
						+ "million}\n-------------------------------------------------------------\n");

	}

}
