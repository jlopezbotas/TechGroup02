package main.java.com.model;

public class Rocket implements SpaceShip {
    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected double launchExplosion;
    protected double landingCrash;
    protected int currentWeight;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return this.currentWeight + item.weight <= maxWeight;
    }

    @Override
    public int carry(Item item) {
        this.currentWeight += item.weight;
        return this.currentWeight;
    }
}
