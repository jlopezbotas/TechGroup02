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
        List<U1> listU1 = simulation.loadU1(itemsList);
        int c = 1;
        for (U1 u1:listU1){
            List l = u1.getItemList();
            for (Object item:l){
                      System.out.println("rocket "+c+" tiene:"+((Item) item).getName()+" "+((Item) item).getWeight());
            }
            c++;
        }


    }

}



