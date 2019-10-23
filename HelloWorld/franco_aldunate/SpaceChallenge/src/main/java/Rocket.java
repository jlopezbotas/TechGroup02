import java.util.Random;

/**
 * This class represents a Rocket.
 *
 * @author Franco Aldunate
 * @version 22/10/2019
 */
public class Rocket implements SpaceShip {
    protected static final Random RANDOM_NUMBER = new Random();
    protected int totalWeight;
    protected int totalItems;
    protected int maxCargo;
    protected double launchExplosionChance;
    protected double landExplosionChance;

    /**
     * Constructor {@link Rocket} initializes values.
     */
    public Rocket() {
        this.totalItems = 0;
    }

    /**
     * Gets rocket total weight.
     *
     * @return rocket total weight value.
     */
    public int getTotalWeight() {
        return totalWeight;
    }

    /**
     * Gets rocket max cargo.
     *
     * @return rocket max cargo value.
     */
    public int getMaxCargo() {
        return maxCargo;
    }

    /**
     * Performs explosion chance calculation given alpha.
     *
     * @param alpha value to use in calculation.
     * @return explosion chance.
     */
    protected double performExplosionChance(final double alpha) {
        return alpha * (getTotalWeight() / getMaxCargo());
    }

    /**
     * Performs rocket launching.
     *
     * @return true or false indicating if the launch was successful or if the rocket has crashed.
     */
    public boolean launch() {
        return false;
    }

    /**
     * Performs rocket landing.
     *
     * @return true or false based on the success of the landing.
     */
    public boolean land() {
        return false;
    }

    /**
     * Checks if rocket can carry target item.
     *
     * @param item to carry on rocket.
     * @return true if the rocket can carry target item or false if it will exceed the totalWeight limit.
     */
    public final boolean canCarry(final Item item) {
        int auxWeight = this.totalWeight;
        auxWeight += item.getWeight();
        return auxWeight <= this.maxCargo;
    }

    /**
     * Performs carrying of object on rocket.
     *
     * @param item to carry on rocket.
     */
    public final void carry(final Item item) {
        this.totalWeight += item.getWeight();
        this.totalItems += 1;
    }
}
