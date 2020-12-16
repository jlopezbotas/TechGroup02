public interface SpaceShip {
	/**
	 * Indicates if launch is successful.
	 * @return True if it is successful
	 */
	boolean launch();

	/**
	 * Indicates if land is successful.
	 * @return True if it is successful
	 */
	boolean land();

	/**
	 * Verifies the item can be carried by the rocket without exceeding the max weight.
	 * @param item single item to load
	 * @return true if rocket is capable to carry the item
	 */
	boolean canCarry(Item item);


	/**
	 * Updates the current weight of the rocket.
	 * @param item single item to load
	 * @return current weight
	 */
	int carry(Item item);
}
