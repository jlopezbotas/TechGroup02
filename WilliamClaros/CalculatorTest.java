import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class that contains all the Unit Test of the Calculator class.
 *
 * @author William Claros
 * @version 10/01/2019
 */
public class CalculatorTest {

    private static Calculator calculator;

    /**
     * Method to initialize my object.
     */
    @Before
    public void initialization() {
        calculator = new Calculator();
    }

    /**
     * Test to validate the correctness of the sum method.
     */
    @Test
    public void sumTest1Correct() {
        final int number1 = 9;
        final int number2 = 13;
        final int expectedResult = 22;
        assertEquals(expectedResult, calculator.sum(number1, number2));
    }

    /**
     * Test to validate the correctness of the sum method.
     */
    @Test
    public void sumTest2Incorrect() {
        final int number1 = 100;
        final int number2 = 51;
        final int expectedErrorResult = 1546;
        assertFalse(expectedErrorResult == calculator.sum(number1, number2));
    }

    /**
     * Test to validate the correctness of the subtraction method.
     */
    @Test
    public void subtractionTest1Correct() {
        final int number1 = 29;
        final int number2 = 19;
        final int expectedResult = 10;
        assertEquals(expectedResult, calculator.subtraction(number1, number2));
    }

    /**
     * Test to validate the correctness of the subtraction method.
     */
    @Test
    public void subtractionTest2Incorrect() {
        final int number1 = 29;
        final int number2 = 19;
        final int expectedErrorResult = 15;
        assertFalse(expectedErrorResult == calculator.subtraction(number1, number2));
    }

    /**
     * Test to validate the correctness of the multiplication method.
     */
    @Test
    public void multiplicationTest1Correct() {
        final int number1 = 29;
        final int number2 = 19;
        final int expectedResult = 551;
        assertEquals(expectedResult, calculator.multiplication(number1, number2));
    }

    /**
     * Test to validate the correctness of the multiplication method.
     */
    @Test
    public void multiplicationTest2Incorrect() {
        final int number1 = 8;
        final int number2 = 2;
        final int expectedErrorResult = 20;
        assertFalse(expectedErrorResult == calculator.multiplication(number1, number2));
    }

    /**
     * Test to validate the correctness of the divide method.
     */
    @Test
    public void divideTest1Correct() {
        final int number1 = 48;
        final int number2 = 24;
        final int expectedResult = 2;
        assertEquals(expectedResult, calculator.divide(number1, number2));
    }

    /**
     * Test to validate the correctness of the divide method.
     */
    @Test
    public void divideTest2Incorrect() {
        final int number1 = 8;
        final int number2 = 2;
        final int expectedErrorResult = 6;
        assertFalse(expectedErrorResult == calculator.divide(number1, number2));
    }

    /**
     * Test to validate the correctness of the divide method.
     */
    @Test
    public void divideTest3Incorrect() {
        final int number1 = 15;
        final int number2 = 0;
        final int expectedErrorResult = 15;
        assertFalse(expectedErrorResult == calculator.divide(number1, number2));
    }
}
