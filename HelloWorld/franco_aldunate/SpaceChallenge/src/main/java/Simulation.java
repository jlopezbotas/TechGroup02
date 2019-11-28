import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * This class represents a Rocket launching simulation.
 *
 * @author Franco Aldunate
 * @version 22/10/2019
 */
public class Simulation {
    private File phase1 = new File("src\\main\\resources\\phase-1.txt");
    private File phase2 = new File("src\\main\\resources\\phase-2.txt");

    /**
     * Loads all items from a text file.
     *
     * @param phase is the target file.
     * @return an ArrayList of Items.
     */
    private ArrayList<Item> loadItems(final int phase) {
        ArrayList<Item> items = new ArrayList<Item>();
        switch (phase) {
            case 1:
                items = loadItemsFromFile(phase1);
                break;
            case 2:
                items = loadItemsFromFile(phase2);
                break;
        }
        return items;
    }

    /**
     * Loads items given a file.
     *
     * @param file target to read.
     * @return an ArrayList of Items.
     */
    private ArrayList<Item> loadItemsFromFile(final File file) {
        final ArrayList<Item> items = new ArrayList<Item>();
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                final String line = fileScanner.nextLine();
                final String[] values = line.split("=");
                final String name = values[0];
                final int weight = Integer.parseInt(values[1]);
                final Item item = new Item(name, weight);
                items.add(item);
            }
        } catch (FileNotFoundException e) {
            System.out.println(String.format("Error on loading file %s", file));
            e.printStackTrace();
        }
        return items;
    }

    /**
     * Loads an item into a rocket.
     *
     * @param rocket target object to use.
     * @param item   to load.
     * @return true or false based on the success of item loading.
     */
    private boolean loadRocket(final Rocket rocket, final Item item) {
        boolean flag = false;
        if (rocket.canCarry(item)) {
            rocket.carry(item);
            flag = true;
        }
        return flag;
    }

    /**
     * Loads items to rocket of prototype type U1.
     *
     * @return a list of rocket of prototype type U1.
     */
    public ArrayList<Rocket> loadU1(final int phase) {
        final ArrayList<Item> items = loadItems(phase);
        if (items.size() == 0) {
            return null;
        }

        final ArrayList<Rocket> rockets = new ArrayList<Rocket>();
        boolean flag = true;
        boolean isLoaded;
        Rocket rocket = new U1();
        while (flag) {
            Iterator iterator = items.iterator();
            while (iterator.hasNext()) {
                final Item item = (Item) iterator.next();
                isLoaded = loadRocket(rocket, item);
                if (isLoaded) {
                    iterator.remove();
                } else {
                    rockets.add(rocket);
                    rocket = new U1();
                    break;
                }
                if (items.size() == 0) {
                    rockets.add(rocket);
                    flag = false;
                }
            }
        }
        return rockets;
    }

    /**
     * Loads items to rocket of prototype type U1.
     *
     * @return a list of rocket of prototype type U1.
     */
    public ArrayList<Rocket> loadU2(final int phase) {
        final ArrayList<Item> items = loadItems(phase);
        if (items.size() == 0) {
            return null;
        }

        final ArrayList<Rocket> rockets = new ArrayList<Rocket>();
        boolean flag = true;
        boolean isLoaded;
        Rocket rocket = new U2();
        while (flag) {
            Iterator iterator = items.iterator();
            while (iterator.hasNext()) {
                final Item item = (Item) iterator.next();
                isLoaded = loadRocket(rocket, item);
                if (isLoaded) {
                    iterator.remove();
                } else {
                    rockets.add(rocket);
                    rocket = new U2();
                    break;
                }
                if (items.size() == 0) {
                    rockets.add(rocket);
                    flag = false;
                }
            }
        }
        return rockets;
    }

    /**
     * Runs simulation of launching and landing rockets.
     *
     * @param rockets is a list of Rockets (any type).
     * @return sum of cost of all rockets launched.
     */
    public int runSimulation(final ArrayList<Rocket> rockets) {
        int totalBudget = 0;
        for (Rocket rocket : rockets) {
            totalBudget += rocket.getCost();
            if (!rocket.launch() || !rocket.land()) {
                totalBudget += rocket.getCost();
                rocket.launch();
            }
        }
        return totalBudget;
    }
}
