/**
 * This class represents a Rocket of prototype type U1.
 *
 * @author Franco Aldunate
 * @version 22/10/2019
 */
public class U1 extends Rocket {

    /**
     * Constructor {@link U1} initializes values.
     */
    public U1() {
        this.totalWeight = 10000;
        this.maxCargo = 18000;
    }

    /**
     * Performs rocket launching.
     *
     * @return true or false indicating if the launch was successful or if the rocket has crashed.
     */
    @Override
    public boolean launch() {
        final double rand = RANDOM_NUMBER.nextDouble();
        this.launchExplosionChance = performExplosionChance(0.05);
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
        this.landExplosionChance = performExplosionChance(0.01);
        return !(this.launchExplosionChance >= rand);
    }
}
