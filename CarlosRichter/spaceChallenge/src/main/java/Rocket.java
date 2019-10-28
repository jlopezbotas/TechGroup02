import java.util.ArrayList;

public class Rocket implements Spaceship {
     int rocketCost;
     int rocketWeight;
     int maxWeightWithCargo;
     double chanceOfLaunchExplosion;
     double chanceOfLandingCrash;
     public ArrayList<Item> itemList = new ArrayList<Item>();

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        if (item.getWeight()/1000+rocketWeight<=maxWeightWithCargo){
            return true;
        }
            else return false;
    }

    public void carry(Item item) {
        itemList.add(item);
        rocketWeight= item.getWeight()/1000+rocketWeight;
    }
    public ArrayList<Item> getItemList() {
        return itemList;
    }

}
