/**
 * This class represents contract that defines rockets behavior.
 *
 * @author Franco Aldunate
 * @version 22/10/2019
 */
public interface SpaceShip {
    /**
     * Performs rocket launching.
     *
     * @return true or false indicating if the launch was successful or if the rocket has crashed.
     */
    public boolean launch();

    /**
     * Performs rocket landing.
     *
     * @return true or false based on the success of the landing.
     */
    public boolean land();

    /**
     * Checks if rocket can carry target item.
     *
     * @param item to carry on rocket.
     * @return true if the rocket can carry target item or false if it will exceed the totalWeight limit.
     */
    public boolean canCarry(final Item item);

    /**
     * Performs carrying of object on rocket.
     *
     * @param item to carry on rocket.
     */
    public void carry(final Item item);
}
