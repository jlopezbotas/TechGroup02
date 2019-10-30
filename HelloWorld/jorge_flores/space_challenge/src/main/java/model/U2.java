package model;

public class U2 extends Rocket {
    private static final int COST = 120000000;
    private static final int WEIGHT = 18000;
    private static final int MAX_CARGO = 29000;

    /**
     * Constructor
     */
    public U2() {
        this.cost = COST;
        this.totalWeight = WEIGHT;
        this.maxCargo = MAX_CARGO;
    }

    /**
     * Performs rocket launching.
     *
     * @return state the launch.
     */
    @Override
    public boolean launch() {
        final double rand = RANDOM_NUMBER.nextDouble();
        this.launchExplosionChance = performExplosionChance(0.04);
        return !(this.launchExplosionChance >= rand);
    }

    /**
     * Performs rocket landing.
     *
     * @return state based on the success of the landing.
     */
    @Override
    public boolean land() {
        final double rand = RANDOM_NUMBER.nextDouble();
        this.landExplosionChance = performExplosionChance(0.08);
        return !(this.launchExplosionChance >= rand);
    }
}
