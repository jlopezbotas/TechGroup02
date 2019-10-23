/**
 * This class represents a Rocket of prototype type U2.
 *
 * @author Franco Aldunate
 * @version 22/10/2019
 */
public class U2 extends Rocket {

    /**
     * Constructor {@link U2} initializes values.
     */
    public U2() {
        this.totalWeight = 18000;
        this.maxCargo = 29000;
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
