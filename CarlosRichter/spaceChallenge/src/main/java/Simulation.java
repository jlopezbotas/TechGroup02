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
//                arrayList.remove(item);
            }

        }
            rocketList.add(u1);
        for(Item item:u1.getItemList() ){
            arrayList.remove(item);
        }
        }
        return rocketList;
    }

}
