package main.java.com.model;

public class U1 extends Rocket{

    U1() {
        cost = 100;
        weight = 10000;
        maxWeight = 18000;
        launchExplosion = 0.0;
        landingCrash = 0.0;
        currentWeight = weight;
    }

    @Override
    public boolean land() {
        var random = (Math.random() * 100 + 1);
        this.launchExplosion = (1.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight));
        return this.launchExplosion <= random;
    }

    @Override
    public boolean launch() {
        var random = (Math.random() * 100 + 1);
        this.launchExplosion = (5.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight));
        return this.launchExplosion <= random;
    }
}
