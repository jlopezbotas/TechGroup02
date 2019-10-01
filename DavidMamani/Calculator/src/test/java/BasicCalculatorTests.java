package test.java;
import main.java.BasicCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

public class BasicCalculatorTests {
    /**
     * Test to validate positive cases on add function.
     */
    @Test
    public void testPositiveAdd() {
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
    public void testNegativeAdd() {
        assertEquals(0, BasicCalculator.add(2,'a'));
        assertEquals(0, BasicCalculator.add('a',2));
        assertEquals(0, BasicCalculator.add('a','b'));
    }
    /**
     * Test to validate positive cases on subtract function.
     */
    @Test
    public void testPositiveSubtract() {
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
    public void testNegativeSubtract() {
        assertEquals(-1, BasicCalculator.subtract(1,2));
    }
    /**
     * Test to validate positive cases on subtract function.
     */
    @Test
    public void testPositiveMultiply() {
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
    public void testNegativeMultiply() {
        assertEquals(2, BasicCalculator.multiplicate(1,2));
    }    /**
     * Test to validate positive cases on subtract function.
     */
    @Test
    public void testPositiveDivide() {
        assertEquals(2, BasicCalculator.divide(4,2), 0.0f);
        assertEquals(0.5, BasicCalculator.divide(1,2), 0.0f);
    }
    /**
     * Test to validate negative cases on subtract function.
     */
    @Test
    public void testNegativeDivide() {
        assertEquals(2, BasicCalculator.divide(4,2), 0.0f);
    }

}