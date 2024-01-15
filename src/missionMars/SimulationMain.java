package missionMars;

public class SimulationMain {

	public static void main(String[] args) {
		Simulation simulation = new Simulation();

		simulation.runSimulation(simulation.loadU1(simulation.loadItems()));
		simulation.runSimulation(simulation.loadU2(simulation.loadItems()));

	}

}
