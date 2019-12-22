import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTests {
    /**
     * Test to validate positive cases on add function.
     */
    @Test
    void testPositiveAdd() {
        assertEquals(3, BasicCalculator.add(1,2));
        assertEquals(3, BasicCalculator.add(2,1));
        assertEquals(-1, BasicCalculator.add(-2,1));
        assertEquals(1, BasicCalculator.add(2,-1));
        assertEquals(-3, BasicCalculator.add(-2,-1));
    }
    /**
     * Test to validate negative cases on add function.
     */
    @Test
    void testBoundaryAdd() {
        assertEquals(-2147483648, BasicCalculator.add(1,2147483647));
        assertEquals(-2147483648, BasicCalculator.add(2147483647,1));
    }
    /**
     * Test to validate positive cases on subtract function.
     */
    @Test
    void testPositiveSubtract() {
        assertEquals(-1, BasicCalculator.subtract(1,2));
        assertEquals(1, BasicCalculator.subtract(2,1));
        assertEquals(-3, BasicCalculator.subtract(-2,1));
        assertEquals(3, BasicCalculator.subtract(2,-1));
        assertEquals(-1, BasicCalculator.subtract(-2,-1));
    }
    /**
     * Test to validate negative cases on subtract function.
     */
    @Test
    void testNegativeSubtract() {
        assertEquals(-1, BasicCalculator.subtract(1,2));
    }
    /**
     * Test to validate positive cases on subtract function.
     */
    @Test
    void testPositiveMultiply() {
        assertEquals(2, BasicCalculator.multiplicate(1,2));
        assertEquals(2, BasicCalculator.multiplicate(2,1));
        assertEquals(-2, BasicCalculator.multiplicate(-2,1));
        assertEquals(-2, BasicCalculator.multiplicate(2,-1));
        assertEquals(2, BasicCalculator.multiplicate(-2,-1));
        assertEquals(0, BasicCalculator.multiplicate(-2,0));
        assertEquals(0, BasicCalculator.multiplicate(0,-2));
        assertEquals(0, BasicCalculator.multiplicate(0,0));
    }
    /**
     * Test to validate negative cases on subtract function.
     */
    @Test
    void testNegativeMultiply() {
        assertEquals(2, BasicCalculator.multiplicate(1,2));
    }    /**
     * Test to validate positive cases on subtract function.
     */
    @Test
    void testPositiveDivide() {
        assertEquals(2, BasicCalculator.divide(4,2), 0.0f);
        assertEquals(0.5, BasicCalculator.divide(1,2), 0.0f);
    }
    /**
     * Test to validate negative cases on subtract function.
     */
    @Test
    void testNegativeDivide() {
        assertEquals(2, BasicCalculator.divide(4,2), 0.0f);
    }

}