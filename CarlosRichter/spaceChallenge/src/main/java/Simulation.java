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
}
