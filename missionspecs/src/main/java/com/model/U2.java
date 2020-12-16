package main.java.com.model;

public class U2 extends Rocket{

    U2() {
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
        launchExplosion = 0.0;
        landingCrash = 0.0;
        currentWeight = weight;
    }

    @Override
    public boolean land() {
        var random = (Math.random() * 100 + 1);
        this.launchExplosion = (8.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight));
        return this.launchExplosion <= random;
    }

    @Override
    public boolean launch() {
        var random = (Math.random() * 100 + 1);
        this.launchExplosion = (4.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight));
        return this.launchExplosion <= random;
    }
}
