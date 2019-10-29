import java.util.Random;

/**
 * Define Rocket of type U2.
 */
public class U1 extends Rocket {
	private Random r = new Random();

	/**
	 * Constructor for U2.
	 */
	U1() {
	    cost = 100; //100 million
	    weight = 10000;
	    maxWeight = 18000;
	    launchExplosion = 0.0;
	    landingCrash = 0.0;
	    currentWeight = weight;
	}

	/**
	 * Calculate the success of landing by a given formula and random number.
	 * Chance of landing crash = 1% * (cargo carried / cargo limit)
	 * @return	true if there is no landing crash
	 */
	public boolean land() {
		int random = r.nextInt(100);
		this.landingCrash = 0.01 * ( this.currentWeight - this.weight) / (this.maxWeight - this.weight);
		return this.landingCrash <= random;
	}

	/**
	 * Calculate the success of launching by a given formula, random number and cargo carried.
	 * Chance of launch explosion = 5% * (cargo carried / cargo limit)
	 * @return	true if there is no launch explosion
	 */
	public boolean launch(int cargoCarried) {
		int random = r.nextInt(100);
		this.launchExplosion = 0.05 * ( this.currentWeight - this.weight) / (this.maxWeight - this.weight);
		return this.launchExplosion <= random;
	}
}
