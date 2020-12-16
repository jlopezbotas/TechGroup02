import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceChallengeTest {
    /**
     * Test to validate set item attributes.
     */
    @Test
    void testItem() {
        Item i = new Item("tools", 100);
        assertEquals("tools", i.name);
        assertEquals(100, i.weight);
    }

    /**
     * Test to U1 rocket
     */
    @Test
    void testU1Rocket() {
        U1 rocketUnit = new U1();
        assertEquals(100, rocketUnit.cost);
        assertEquals(10000, rocketUnit.weight);
        assertEquals(18000, rocketUnit.maxWeight);
        assertEquals(0.0, rocketUnit.launchExplosion);
        assertEquals(0.0, rocketUnit.landingCrash);
        assertEquals(rocketUnit.weight, rocketUnit.currentWeight);
    }


    /**
     * Test to U2 rocket
     */
    @Test
    void testU2Rocket() {
        U2 rocketUnit = new U2();
        assertEquals(120, rocketUnit.cost);
        assertEquals(18000, rocketUnit.weight);
        assertEquals(29000, rocketUnit.maxWeight);
        assertEquals(0.0, rocketUnit.launchExplosion);
        assertEquals(0.0, rocketUnit.landingCrash);
        assertEquals(rocketUnit.weight, rocketUnit.currentWeight);
    }
}
