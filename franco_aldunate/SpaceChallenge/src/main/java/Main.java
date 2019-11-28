import java.util.ArrayList;

/**
 * This class executes Space Challenge Simulation.
 *
 * @author Franco Aldunate
 * @version 22/10/2019
 */
public class Main {
    public static void main(String[] args) {
        final Simulation simulation = new Simulation();
        int u1TotalBudget = 0;
        int u2TotalBudget = 0;

        System.out.println("---------- Phase 1 ----------");
        System.out.println("Rocket U1 simulation");
        final ArrayList<Rocket> u1RocketsPhase1 = simulation.loadU1(1);
        final int totalBudgetPhase1U1 = simulation.runSimulation(u1RocketsPhase1);
        System.out.println("Total Budget:" + totalBudgetPhase1U1);
        u1TotalBudget += totalBudgetPhase1U1;


        System.out.println("Rocket U2 simulation");
        final ArrayList<Rocket> u2RocketsPhase1 = simulation.loadU2(1);
        final int totalBudgetPhase1U2 = simulation.runSimulation(u2RocketsPhase1);
        System.out.println("Total Budget:" + totalBudgetPhase1U2);
        u2TotalBudget += totalBudgetPhase1U2;

        System.out.println("\n---------- Phase 2 ----------");
        System.out.println("Rocket U1 simulation");
        final ArrayList<Rocket> u1RocketsPhase2 = simulation.loadU1(2);
        final int totalBudgetPhase2U1 = simulation.runSimulation(u1RocketsPhase2);
        System.out.println("Total Budget:" + totalBudgetPhase2U1);
        u1TotalBudget += totalBudgetPhase2U1;

        System.out.println("Rocket U2 simulation");
        final ArrayList<Rocket> u2RocketsPhase2 = simulation.loadU2(2);
        final int totalBudgetPhase2U2 = simulation.runSimulation(u2RocketsPhase2);
        System.out.println("Total Budget:" + totalBudgetPhase2U2);
        u2TotalBudget += totalBudgetPhase2U2;

        System.out.println("\nResults of simulation of Phases 1 and 2");
        if (u1TotalBudget > u2TotalBudget) {
            System.out.println("U-2 costs less than U-1");
        } else {
            System.out.println("U-1 costs less than U-2");
        }
    }
}
