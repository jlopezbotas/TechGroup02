import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Load items and run simulation.
 */
class Simulation {

	/**
	 * Default constructor.
	 */
	Simulation() {
	}

	/**
	 * Read the input data from the text file.
	 * @param fileName path
	 * @return Array list of items
	 * @throws FileNotFoundException if the file is not found on given path
	 */
	ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		ArrayList<Item> items = new ArrayList<Item>();

		while(scan.hasNextLine()){
			String line = scan.nextLine();
			String[] oneItem = line.split("=");
			items.add(new Item(oneItem[0], Integer.parseInt(oneItem[1])));
		}
		scan.close();
		// To print out px.text
		System.out.println(fileName + " contains " + items.size() + " items");
		for (Item i : items) {
			System.out.println(i.name + ": " + i.weight);
		}

		return items;
	}

	/**
	 * From the array list of items start to create U1 rockets
	 * @param items Array list of items
	 * @return the ArrayList of those U1 rockets that are fully loaded.
	 */
	ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> fleet = new ArrayList<Rocket>();
		Rocket r = new U1();

		int itemCounter = 1;
		int rocketCounter = 1;

		System.out.println("\nU1 Rocket weight = " + r.weight + "; maxWeight = " + r.maxWeight);

		for (Item i : items) {

			while (!r.canCarry(i)) {
				System.out.println(" Adding next Item " + itemCounter + ": " + i.name + " = " + i.weight
						+ " failed -> No." + rocketCounter + " U1 full");

				rocketCounter++;
				fleet.add(r);
				r = new U1();
			}
			r.carry(i);

			System.out.println("Item " + itemCounter + ": " + i.name + " = " + i.weight + "; Rocket weight = "
					+ r.currentWeight + "; Item added");

			itemCounter++;
		}
		fleet.add(r);
		System.out.println("U1 fleet contains " + fleet.size() + " rockets");
		return fleet;
	}


	/**
	 * From the array list of items start to create U2 rockets
	 * @param items Array list of items
	 * @return the ArrayList of those U1 rockets that are fully loaded.
	 */
	ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		ArrayList<Rocket> fleet = new ArrayList<Rocket>();
		Rocket r = new U2();

		int itemCounter = 1;
		int rocketCounter = 1;

		System.out.println("U2 Rocket weight = " + r.weight + "; maxWeight = " + r.maxWeight);

		for (Item i : items) {

			while (!r.canCarry(i)) {
				System.out.println(" Adding next Item " + itemCounter + ": " + i.name + " = " + i.weight
						+ " failed -> No." + rocketCounter + " U2 full");
				rocketCounter++;
				fleet.add(r);
				r = new U2();
			}
			r.carry(i);
			System.out.println("Item " + itemCounter + ": " + i.name + " = " + i.weight + "; Rocket weight = "
					+ r.currentWeight + "; Item added");
			itemCounter++;
		}
		fleet.add(r);
		System.out.println("U2 fleet contains " + fleet.size() + " rockets\n");
		return fleet;
	}

	/**
	 * Run the simulation for the given rocket list
	 * @param list Rocket list
	 * @return Budget as total cost
	 */
	int runSimulation(ArrayList<Rocket> list) {
		int num = 0; //failed trials of launch/land
		int indexSuccess = 1;
		for (Rocket r : list) {

			while (!r.launch()) {
				r.launch();
				num++;
				System.out.println("Extra trials: " + num);
			}
			System.out.println("No." + indexSuccess + " rocket launched");

			while (!r.land()) {
				r.land();
				num++;
				System.out.println("Extra trials: " + num);
			}
			System.out.println("No." + indexSuccess + " rocket landed\n");
			indexSuccess++;
		}
		int budget = list.get(0).cost * (list.size() + num);
		System.out.println(list.size() + " rockets and " + num + " extra trials = "
				+ (list.size() + num) + " in total");
		return budget;
	}
}
