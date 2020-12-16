import java.util.Random;

/**
 * Define Rocket of type U2.
 */
public class U2 extends Rocket {
	private Random r = new Random();

	/**
	 * Constructor for U2.
	 */
	U2() {
		cost = 120;
		weight = 18000;
		maxWeight = 29000;
		launchExplosion = 0.0;
		landingCrash = 0.0;
		currentWeight = weight;
	}

	/**
	 * Calculate the success of landing by a given formula and random number.
	 * Chance of landing crash = 8% * (cargo carried / cargo limit)
	 * @return	true if there is no landing crash
	 */
	public boolean land() {
		int random = r.nextInt(100);
		this.launchExplosion = 0.08 * ( this.currentWeight - this.weight) / (this.maxWeight - this.weight);
		return this.launchExplosion <= random;
	}

	/**
	 * Calculate the success of launching by a given formula, random number and cargo carried.
	 * Chance of launch explosion = 4% * (cargo carried / cargo limit)
	 * @return	true if there is no launch explosion
	 */
	public boolean launch(int cargoCarried) {
		int random = r.nextInt(100);
		this.landingCrash = 0.04 * ( this.currentWeight - this.weight) / (this.maxWeight - this.weight);
		return this.landingCrash <= random;
	}

}
