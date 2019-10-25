public class Rocket implements  SpaceShip {

    public int rocketCost;
    public float rocketWeight;
    public float maxWeigth;
    public float currentWeight;
    public float launchExplosionChance;
    public float landingCrashChance;

    public Rocket(){

    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return this.currentWeight + item.getWeight() <= this.maxWeigth;
    }

    public void carry(Item item) {
        this.currentWeight += item.getWeight();
    }

    public int getRocketCost() {
        return this.rocketCost;
    }
}
