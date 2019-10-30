package main.java.com.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {



    public ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        ArrayList<Item> items = new ArrayList<>();

        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String[] item = line.split("=");
            var name = item[0];
            var weight = Integer.valueOf(item[1]);
            items.add(new Item(name, weight));
        }

        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {

        Rocket u1 = new U1();
        ArrayList<Rocket> u1Rockets = new ArrayList<>();

        System.out.println("\nU1 Rocket weight = " + u1.weight + "; maxWeight = " + u1.maxWeight);

        for (Item item : items) {
            while (!u1.canCarry(item)) {
                u1Rockets.add(u1);
                u1 = new U1();
            }

            u1.carry(item);
        }

        u1Rockets.add(u1);
        System.out.println("U1 contains " + u1Rockets.size() + " rockets");

        return u1Rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        Rocket u2 = new U2();
        ArrayList<Rocket> u2Rockets = new ArrayList<>();

        System.out.println("U2 Rocket weight = " + u2.weight + "; maxWeight = " + u2.maxWeight);

        for (Item item : items) {
            while (!u2.canCarry(item)) {
                u2Rockets.add(u2);
                u2 = new U2();
            }

            u2.carry(item);
        }

        u2Rockets.add(u2);
        System.out.println("U2 contains " + u2Rockets.size() + " rockets\n");

        return u2Rockets;
    }

    public int runSimulation(ArrayList<Rocket> rockets) {
        int trials = 0;

        for (Rocket rocket : rockets) {

            while (!rocket.launch()) {
                rocket.launch();
                trials++;
            }

            while (!rocket.land()) {
                rocket.land();
                trials++;
            }
        }

        int budget = rockets.get(0).cost * (rockets.size() + trials);

        System.out.println(rockets.size() + " rockets and " + trials + " extra trials = " + (rockets.size() + trials) + " in total");

        return budget;
    }
}
