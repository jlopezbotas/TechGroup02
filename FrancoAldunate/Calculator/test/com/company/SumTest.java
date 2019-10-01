package com.company;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains Unit Tests for class Calculator sum operation.
 *
 * @author Franco Aldunate
 * @version 10/01/2019
 */
public class SumTest {
    private Calculator calculator;

    /**
     * This method tests instancing of Calculator Class.
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * This method tests sum of Double MIN_VALUE and negative Double MAX_VALUE.
     */
    @Test
    public void sumOfDoubleMAX_VALUEAndNegativeDoubleMAX_VALUEIs0() {
        final double a = Double.MAX_VALUE;
        final double b = -Double.MAX_VALUE;
        final double actualResult = calculator.sum(a, b);
        final double expectedResult = 0;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests sum of double and negative double.
     */
    @Test
    public void sumOf11dot11AndNegative11dot12IsNegative0dot1() {
        final double actualResult = calculator.sum(11.11, -11.12);
        final double expectedResult = -0.1;
        assertEquals(expectedResult, actualResult, 0.1);
    }
}
