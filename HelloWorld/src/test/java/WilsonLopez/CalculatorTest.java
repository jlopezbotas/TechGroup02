package WilsonLopez;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @Test
    public void sum_sumTwoPositiveNumbers() {
        calculator = new Calculator();
        final int expected = 15;
        final int num1 = 8;
        final int num2 = 7;
        assertEquals(expected, calculator.sum(num1, num2));
    }

    @Test
    public void sum_sumTwoNegativeNumbers() {
        calculator = new Calculator();
        final int expected = -10;
        final int num1 = -4;
        final int num2 = -6;
        assertEquals(expected, calculator.sum(num1, num2));
    }

    @Test
    public void subtraction_subtractionBetweenTwoPositiveNumbers() {
        calculator = new Calculator();
        final int expected = 5;
        final int num1 = 12;
        final int num2 = 7;
        assertEquals(expected, calculator.subtraction(num1, num2));
    }

    @Test
    public void subtraction_subtractionBetweenNegativeNumber() {
        calculator = new Calculator();
        final int expected = 8;
        final int num1 = 4;
        final int num2 = -4;
        assertEquals(expected, calculator.subtraction(num1, num2));
    }

    @Test
    public void multiplication_test1() {
        calculator = new Calculator();
        final int expected = 12;
        final int num1 = 3;
        final int num2 = 4;
        assertEquals(expected, calculator.multiplication(num1, num2));
    }

    @Test
    public void multiplication_test2() {
        calculator = new Calculator();
        final int expected = -25;
        final int num1 = 5;
        final int num2 = -5;
        assertEquals(expected, calculator.multiplication(num1, num2));
    }

    @Test
    public void multiplication_test3() {
        calculator = new Calculator();
        final int expected = 25;
        final int num1 = -5;
        final int num2 = -5;
        assertEquals(expected, calculator.multiplication(num1, num2));
    }

    @Test
    public void multiplication_test4() {
        calculator = new Calculator();
        final int expected = 0;
        final int num1 = 0;
        final int num2 = 5;
        assertEquals(expected, calculator.multiplication(num1, num2));
    }

    @Test
    public void division_test1() {
        calculator = new Calculator();
        final int expected = 5;
        final int num1 = 25;
        final int num2 = 5;
        assertEquals(expected, calculator.division(num1, num2));


    }
}