public class Rocket implements Spaceship {
    protected int rocketCost;
    protected int rocketWeight;
    protected int maxWeightWithCargo;
    protected double chanceOfLaunchExplosion;
    protected double chanceOfLandingCrash;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return false;
    }

    public void carry(Item item) {

    }
}
