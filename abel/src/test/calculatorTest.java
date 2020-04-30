package test;

import main.calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest extends calculator {
    private calculator calculator;

    /**
     * define instance of calculator().
     */
    @Before
    public void before() {
        calculator = new calculator();
    }

    /**
     * test add between two numbers.
     */
    @Test
    public void testSum() {
        assertEquals(8, calculator.add(3, 5));
    }

    /**
     * test subtract between two numbers.
     */
    @Test
    public void testMinus() {
        assertEquals(2, calculator.subtrac(4, 2));
    }

    /**
     * test divide between two numbers.
     */
    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    /**
     * test multiply between two numbers.
     */
    @Test
    public void testMultiply() {
        assertEquals(18, calculator.multiply(6, 3));
    }

    /**
     * test zero divide.
     */
    @Test(expected = ArithmeticException.class)
    public void testDivideOnZero() {
        calculator.divide(6, 0);
    }
}
