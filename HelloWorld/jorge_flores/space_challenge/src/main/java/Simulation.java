import model.Item;
import model.Rocket;
import model.U1;
import model.U2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

public class Simulation {

    /**
     * Loads all items from a text file.
     *
     * @param input is the source file.
     * @return an ArrayList of Items.
     */
    public ArrayList<Item> loadItems(final Scanner input) {
        ArrayList<Item> itemsList = new ArrayList<Item>();
        while(input.hasNextLine()) {
            String itemString = input.nextLine();
            String itemName = itemString.split("=")[0];
            float itemWeight = parseFloat(itemString.split("=")[1]);
            itemsList.add(new Item(itemName, itemWeight));
        }
        return itemsList;
    }

    /**
     * Loads items to rocket of prototype type U1.
     *
     * @return a list of rocket of prototype type U1.
     */
    public ArrayList<Rocket> loadU1(final ArrayList<Item> phase) {
        ArrayList<Rocket> u1List = new ArrayList<Rocket>();
        u1List.add(new U1());
        for(Item item : phase) {
            if(!u1List.get(u1List.size() - 1).canCarry(item)) {
                u1List.add(new U1());
            }
            u1List.get(u1List.size() - 1).carry(item);
        }
        return u1List;
    }

    /**
     * Loads items to rocket of prototype type U2.
     *
     * @return a list of rocket of prototype type U2.
     */
    public ArrayList<Rocket> loadU2(final ArrayList<Item> phase) {
        ArrayList<Rocket> u2List = new ArrayList<Rocket>();
        u2List.add(new U2());
        for(Item item : phase) {
            if(!u2List.get(u2List.size() - 1).canCarry(item)) {
                u2List.add(new U2());
            }
            u2List.get(u2List.size() - 1).carry(item);
        }
        return u2List;
    }

    /**
     * Runs simulation of launching and landing rockets.
     *
     * @param rockets is a list of Rockets (any type).
     * @return sum of cost of all rockets launched.
     */
    public int runSimulation(final ArrayList<Rocket> rockets) {
        int budget = 0;
        for(Rocket rocket : rockets) {
            boolean launchStatus, landStatus;
            do {
                launchStatus = rocket.launch();
                landStatus = rocket.land();
                budget = budget + rocket.getRocketCost();
            } while(!launchStatus || !landStatus);
        }
        return budget;
    }
}
