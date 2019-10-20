import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private static Calculator calculator = new Calculator();

    /**
     * Test to validate the addition.
     */
    @Test
    public void sumTwoNumbers() {
        final int number1 = -2;
        final int number2 = 22;
        final int expectedResult = 20;
        assertEquals(expectedResult, calculator.addition(number1, number2));
    }


    /**
     * Test to validate the subtraction.
     */
    @Test
    public void subtractionTwoNumbers() {
        final int number1 = 10;
        final int number2 = 1;
        final int expectedResult = 9;
        assertEquals(expectedResult, calculator.subtraction(number1, number2));
    }

    /**
     * Test to validate the multiplication.
     */
    @Test
    public void multiplicationTwoNumbers() {
        final int number1 = 5;
        final int number2 = 4;
        final int expectedResult = 20;
        assertEquals(expectedResult, calculator.multiplication(number1, number2));
    }

    /**
     * Test to validate the division.
     */
    @Test
    public void divideTwoNumbers() {
        final int number1 = 10;
        final int number2 = 2;
        final int expectedResult = 5;
        assertEquals(expectedResult, calculator.division(number1, number2));
    }

    /**
     * Test to validate the multiple numbers with different operators.
     */
    @Test
    public void operationWithNumbers() {
        final int[ ] numbers = { 1, 2, 3, 4};
        final char[ ] operations = { '+', '+', '*'};
        final int expectedResult = 24;
        assertEquals(expectedResult, calculator.resolveOperationsWithNNumbers(numbers, operations));
    }

    /**
     * Test to validate the multiple numbers with different operators.
     */
    @Test
    public void operationWithNumbers2() {
        final int[ ] numbers = { 1, 2, 3, 4, 5};
        final char[ ] operations = { '+', '+', '*', '-'};
        final int expectedResult = 19;
        assertEquals(expectedResult, calculator.resolveOperationsWithNNumbers(numbers, operations));
    }
}