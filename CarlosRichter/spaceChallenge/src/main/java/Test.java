import java.util.List;

public class Test {
    public static void main(String[] args){
        U1 u1 = new U1();
        u1.rocketCost = 1;
        Simulation simulation = new Simulation();
        List l= simulation.loadItems("phase-1.txt");
        for (Object item:l){
            System.out.println(((Item) item).getName());
        }
    }

}



