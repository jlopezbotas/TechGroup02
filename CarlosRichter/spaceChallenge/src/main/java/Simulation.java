import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {
    public List<Item> loadItems(String fileName) {
       List list= new ArrayList();
        String basePath = "CarlosRichter\\spaceChallenge\\src\\main\\resources\\";
        String path = basePath + fileName;
        File file = new File(path);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            Item item = new Item();
            item.setName(line.split("=")[0]);
            item.setWeight(Integer.parseInt(line.split("=")[1]));
            list.add(item);
        }
        return list;
    }

    public List<U1> loadU1(List<Item> arrayList){
        List rocketList= new ArrayList();
        while (arrayList.size()>0){
            U1 u1 = new U1();
            for(Item item : arrayList){
                if(u1.canCarry(item)){
                u1.carry(item);
                }

            }
            rocketList.add(u1);
            for(Item item:u1.getItemList() ){
                arrayList.remove(item);
                }
            }
            return rocketList;
        }

    public List<U2> loadU2(List<Item> arrayList){
        List rocketList= new ArrayList();
        while (arrayList.size()>0){
            U2 u2 = new U2();
            for(Item item : arrayList){
                if(u2.canCarry(item)){
                    u2.carry(item);
                }

            }
            rocketList.add(u2);
            for(Item item:u2.getItemList() ){
                arrayList.remove(item);
            }
        }
        return rocketList;
    }


    public int runSimulation(ArrayList<Rocket> rocketArrayList){
        int budget=0;
        for (Rocket rocket:rocketArrayList){
            while(!rocket.launch() || !rocket.land()){
            budget = budget+rocket.rocketCost;
            }
            budget = budget+rocket.rocketCost;
        }
        return budget;
    }

}
