import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
//        U1 u1 = new U1();
//        u1.rocketCost = 1;
        Simulation simulation = new Simulation();
        List itemsList= simulation.loadItems("phase-1.txt");
        for (Object item:itemsList){
      //      System.out.println(((Item) item).getName());
        }
        ArrayList<Rocket> listU1 = (ArrayList<Rocket>) simulation.loadU1(itemsList);

        int c = 1;
        for (Rocket u1:listU1){
            List l = u1.getItemList();
            for (Object item:l){
                      System.out.println("rocket "+c+" tiene:"+((Item) item).getName()+" "+((Item) item).getWeight());
            }
            c++;
        }

        int budget = simulation.runSimulation(listU1);
        System.out.println("el costo es   "+budget);
//
//        System.out.println("-----------------------------------------");
//        List itemsList2= simulation.loadItems("phase-1.txt");
//        List<U2> listU2 = simulation.loadU2(itemsList2);
//        int c2 = 1;
//        for (U2 u2:listU2){
//            List u2ItemList = u2.getItemList();
//            for (Object item:u2ItemList){
//                System.out.println("rocket "+c2+" tiene:"+((Item) item).getName()+" "+((Item) item).getWeight());
//            }
//            c2++;
//        }
//
    }

}



