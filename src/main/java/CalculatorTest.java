package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        final int number1 = -10;
        final int number2 = 20;
        final int expectedResult = 10;
        assertEquals(expectedResult, Calculator.sum(number1, number2));
    }

    @Test
    void subtraction() {
        final int number1 = 5;
        final int number2 = 3;
        final int expectedResult = 2;
        assertEquals(expectedResult, Calculator.subtraction(number1, number2));
    }

    @Test
    void multiplication() {
        final int number1 = 7;
        final int number2 = 8;
        final int expectedResult = 56;
        assertEquals(expectedResult, Calculator.multiplication(number1, number2));
    }

    @Test
    void division() {
    }
}