/**
 * Define Rocket object
 */
public class Rocket implements SpaceShip {
	    int cost;
	    int weight;
	    int maxWeight;
	    double launchExplosion;
	    double landingCrash;
	    int currentWeight;

		/**
		 * To be implemented
		 * @return boolean true by default
		 */
		public boolean launch() {
			return true;
		}

		/**
		 * To be implemented
		 * @return boolean true by default
		 */
		public boolean land() {
			return true;
		}

		/**
		 * Update the current weight as it is being loaded.
		 * @param item current Item being loaded
		 * @return current weight
		 */
		public int carry(Item item) {
	        this.currentWeight += item.weight;
	        return this.currentWeight;
		}

		/**
		 * Check that loading items not passed maxweight.
		 * @param item current Item being loaded
		 * @return true if it is within its boundary
		 */
		public boolean canCarry(Item item) {
	        return this.currentWeight + item.weight <= maxWeight;

		}
	}