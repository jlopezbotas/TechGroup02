/**
 * This class represents a Rocket of prototype type U2.
 *
 * @author Franco Aldunate
 * @version 22/10/2019
 */
public class U2 extends Rocket {
    private static final int COST = 120000000;
    private static final int WEIGHT = 18000;
    private static final int MAX_CARGO = 29000;

    /**
     * Constructor {@link U2} initializes values.
     */
    public U2() {
        this.cost = COST;
        this.totalWeight = WEIGHT;
        this.maxCargo = MAX_CARGO;
    }

    /**
     * Performs rocket launching.
     *
     * @return true or false indicating if the launch was successful or if the rocket has crashed.
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
     * @return true or false based on the success of the landing.
     */
    @Override
    public boolean land() {
        final double rand = RANDOM_NUMBER.nextDouble();
        this.landExplosionChance = performExplosionChance(0.08);
        return !(this.launchExplosionChance >= rand);
    }
}
