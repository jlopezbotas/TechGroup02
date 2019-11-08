package enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class holds Seed unit tests.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
class SeedTest {

    @Test
    void getValueReturnsEMPTY() {
        assertEquals("-", Seed.EMPTY.getValue());
    }

    @Test
    void getValueReturnsCROSS() {
        assertEquals("X", Seed.CROSS.getValue());
    }

    @Test
    void getValueReturnsNOUGHT() {
        assertEquals("O", Seed.NOUGHT.getValue());
    }
}