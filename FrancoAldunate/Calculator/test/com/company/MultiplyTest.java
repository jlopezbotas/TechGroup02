package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains Unit Tests for class Calculator multiplication operation.
 *
 * @author Franco Aldunate
 * @version 10/01/2019
 */
public class MultiplyTest {
    private Calculator calculator;

    /**
     * This method tests instancing of Calculator Class.
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * This method tests multiplication of two Double values.
     */
    @Test
    public void multiplicationOfTwoDoubleValues() {
        final double a = 3.5;
        final double b = 2.0;
        final double actualResult = calculator.multiply(a, b);
        final double expectedResult = 7.0;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests multiplication of Double and Zero values.
     */
    @Test
    public void multiplicationOfDoubleAnd0Is0() {
        final double a = 7.5;
        final double b = 0;
        final double actualResult = calculator.multiply(a, b);
        final double expectedResult = 0;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests multiplication of Double and negative Double values.
     */
    @Test
    public void multiplicationOfDoubleAndNegativeDoubleIsNegative() {
        final double a = 7.5;
        final double b = -7.25;
        final double actualResult = calculator.multiply(a, b);
        final double expectedResult = -54.375;
        assertEquals(expectedResult, actualResult, 0);
    }
}
