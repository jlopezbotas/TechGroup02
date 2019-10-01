package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains Unit Tests for class Calculator subtraction operation.
 *
 * @author Franco Aldunate
 * @version 10/01/2019
 */
public class SubTest {
    private Calculator calculator;

    /**
     * This method tests instancing of Calculator Class.
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * This method tests subtraction of negative Double MAX_VALUE and Double MAX_VALUE.
     */
    @Test
    public void subtractionOfNegativeDoubleMAX_VALUEAndDoubleMAX_VALUEIs0() {
        final double a = -Double.MAX_VALUE;
        final double b = -Double.MAX_VALUE;
        final double actualResult = calculator.sub(a, b);
        final double expectedResult = 0.0;
        assertEquals(expectedResult, actualResult, 0.1);
    }

    /**
     * This method tests subtraction of double and negative double.
     */
    @Test
    public void subtractionOf11dot11AndNegative11dot12Is22dot22() {
        final double actualResult = calculator.sub(11.11, -11.12);
        final double expectedResult = 22.22;
        assertEquals(expectedResult, actualResult, 0.1);
    }

    /**
     * This method tests subtraction of two positive double values.
     */
    @Test
    public void subtractionOf7Dot7And70IsNegative62dot3() {
        final double actualResult = calculator.sub(7.7, 70);
        final double expectedResult = -62.3;
        assertEquals(expectedResult, actualResult, 0.1);
    }
}
