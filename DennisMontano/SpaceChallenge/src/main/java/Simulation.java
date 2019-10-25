import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

public class Simulation {

    public Simulation() {

    }

    public ArrayList<Item> loadItems(Scanner input) {
        ArrayList<Item> itemsList = new ArrayList<Item>();
        while(input.hasNextLine()) {
            String itemString = input.nextLine();
            String itemName = itemString.split("=")[0];
            float itemWeight = parseFloat(itemString.split("=")[1]);
            itemsList.add(new Item(itemName, itemWeight));
        }
        return itemsList;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> itemsList) {
        ArrayList<Rocket> u1List = new ArrayList<Rocket>();
        u1List.add(new U1());
        for(Item item : itemsList) {
            if(!u1List.get(u1List.size() - 1).canCarry(item)) {
                u1List.add(new U1());
            }
            u1List.get(u1List.size() - 1).carry(item);
        }
        return u1List;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> itemsList) {
        ArrayList<Rocket> u2List = new ArrayList<Rocket>();
        u2List.add(new U2());
        for(Item item : itemsList) {
            if(!u2List.get(u2List.size() - 1).canCarry(item)) {
                u2List.add(new U2());
            }
            u2List.get(u2List.size() - 1).carry(item);
        }
        return u2List;
    }

    public int runSimulation(ArrayList<Rocket> rocketsList) {
        int budget = 0;
        for(Rocket rocket : rocketsList) {
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
