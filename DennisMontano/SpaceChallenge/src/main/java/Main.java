import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {
        Simulation simulation = new Simulation();
        File phase1 = new File(new File("phase-1.txt").getAbsolutePath());
        File phase2 = new File(new File("phase-2.txt").getAbsolutePath());
        Scanner scannerPhase1 = new Scanner(phase1);
        Scanner scannerPhase2 = new Scanner(phase2);
        ArrayList<Item> itemsListPhase1 = simulation.loadItems(scannerPhase1);
        ArrayList<Item> itemsListPhase2 = simulation.loadItems(scannerPhase2);
        ArrayList<Rocket> rocketsU1List = simulation.loadU1(itemsListPhase1);
        ArrayList<Rocket> rocketsU2List = simulation.loadU2(itemsListPhase2);
        int budgetU1 = simulation.runSimulation(rocketsU1List);
        int budgetU2 = simulation.runSimulation(rocketsU2List);
        System.out.println("budget U1: $" + budgetU1 + " millions");
        System.out.println("budget U2: $" + budgetU2 + " millions");
    }
}
