import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class holds Rocket unit tests.
 *
 * @author Franco Aldunate
 * @version 29/10/2019
 */
public class RocketTest {
    Rocket rocket;

    @BeforeEach
    void setUp() {
        rocket = new Rocket();
    }

    @Test
    void getCost() {
        final int actual = rocket.getCost();
        assertEquals(0, actual);
    }

    @Test
    void getCostU1() {
        rocket = new U1();
        final int actual = rocket.getCost();
        assertEquals(100000000, actual);
    }

    @Test
    void getCostU2() {
        rocket = new U2();
        final int actual = rocket.getCost();
        assertEquals(120000000, actual);
    }

    @Test
    void performExplosionChanceU1() {
        rocket = new U1();
        final double actual = rocket.performExplosionChance(0.05);
        assertEquals(0.02777777777777778, actual);
    }

    @Test
    void performExplosionChanceU2() {
        rocket = new U2();
        final double actual = rocket.performExplosionChance(0.04);
        assertEquals(0.024827586206896554, actual);
    }

    @Test
    void launchU1() {
        rocket = new U1();
        final boolean actual = rocket.launch();
        assertTrue(actual);
    }

    @Test
    void landU1() {
        rocket = new U1();
        final boolean actual = rocket.land();
        assertTrue(actual);
    }

    @Test
    void launchU2() {
        rocket = new U2();
        final boolean actual = rocket.launch();
        assertTrue(actual);
    }

    @Test
    void landU2() {
        rocket = new U2();
        final boolean actual = rocket.land();
        assertTrue(actual);
    }

    @Test
    void canCarryReturnsTrue() {
        rocket = new U1();
        Item item = new Item("steel", 8000);
        final boolean actual = rocket.canCarry(item);
        assertTrue(actual);
    }

    @Test
    void canCarryReturnsFalse() {
        rocket = new U1();
        Item item = new Item("steel", 8000);
        rocket.carry(item);
        final boolean actual = rocket.canCarry(item);
        assertFalse(actual);
    }

    @Test
    void carry() {
        rocket = new U1();
        Item item = new Item("steel", 8000);
        rocket.carry(item);
        final double actual = rocket.getTotalWeight();
        assertEquals(18000, actual);
    }
}
