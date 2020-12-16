import model.Item;
import model.Rocket;
import model.U1;
import model.U2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RocketTest {
    private Rocket rocket;

    @BeforeEach
    void setUp() {
        rocket = new Rocket();
    }

    @Test
    void getCost() {
        final int actual = rocket.getRocketCost();
        assertEquals(0, actual);
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
}
