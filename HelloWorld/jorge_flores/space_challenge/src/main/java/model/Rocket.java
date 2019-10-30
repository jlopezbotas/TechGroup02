package model;

import java.util.Random;

public class Rocket implements SpaceShip {
    public int rocketCost;
    public float rocketWeight;
    public float maxWeigth;
    public float currentWeight;
    public float launchExplosionChance;
    public float landingCrashChance;

    /**
     * Gets rocket cost.
     *
     * @return rocket cost value.
     */
    public int getRocketCost() {
        return this.rocketCost;
    }

    /**
     * Performs rocket launching.
     *
     * @return based in launch was successful or if the rocket has crashed.
     */
    public boolean launch() {
        return true;
    }

    /**
     * Performs rocket landing.
     *
     * @return based on the success of the landing.
     */
    public boolean land() {
        return true;
    }

    /**
     * Checks if rocket can carry target item.
     *
     * @param item to carry on rocket.
     * @return true if the rocket can carry target item or false if it will exceed the totalWeight limit.
     */
    public final boolean canCarry(final Item item) {
        return this.currentWeight + item.getWeight() <= this.maxWeigth;
    }

    /**
     * Performs carrying of object on rocket.
     *
     * @param item to carry on rocket.
     */
    public final void carry(final Item item) {
        this.currentWeight += item.getWeight();
    }
}
