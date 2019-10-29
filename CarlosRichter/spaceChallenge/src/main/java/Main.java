import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args){
        int U1WINS= 0;
        int U2WINS= 0;

        for(int counter=1; counter<=100;counter++) {
            Simulation simulation = new Simulation();
            System.out.println("------Simulation for U1------------");
            List Phase1 = simulation.loadItems("phase-1.txt");
            List Phase2 = simulation.loadItems("phase-2.txt");
            ArrayList<Rocket> listRoketsU1Phase1 = (ArrayList<Rocket>) simulation.loadU1(Phase1);
            ArrayList<Rocket> listRoketsU1Phase2 = (ArrayList<Rocket>) simulation.loadU1(Phase2);
            int budgetU1Phase1 = simulation.runSimulation(listRoketsU1Phase1);
            int budgetU1Phase2 = simulation.runSimulation(listRoketsU1Phase2);
            int totalU1 = budgetU1Phase1 + budgetU1Phase2;
            System.out.println("the total budget for U1 is: " + totalU1);
            System.out.println("------Simulation for U2------------");
            List Phase1U2 = simulation.loadItems("phase-1.txt");
            List Phase2U2 = simulation.loadItems("phase-2.txt");
            ArrayList<Rocket> listRoketsU2Phase1 = (ArrayList<Rocket>) simulation.loadU1(Phase1U2);
            ArrayList<Rocket> listRoketsU2Phase2 = (ArrayList<Rocket>) simulation.loadU1(Phase2U2);
            int budgetU2Phase1 = simulation.runSimulation(listRoketsU2Phase1);
            int budgetU2Phase2 = simulation.runSimulation(listRoketsU2Phase2);
            int totalU2 = budgetU2Phase1 + budgetU2Phase2;
            System.out.println("the total budget for U2 is: " + totalU2);
            if(totalU1<totalU2) {U1WINS = U1WINS+1;}
            else if (totalU1>totalU2) {U2WINS = U2WINS+1;}
            }
        System.out.println("U1 wins: " +U1WINS+ " TIMES");
        System.out.println("U2 wins: " +U2WINS+ " TIMES");
        }
    }

