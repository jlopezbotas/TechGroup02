package denis_camacho;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    private Calculator operation;

    @Before
    public void before() {
        operation = new Calculator();
    }

    @Test
    public void testSum() {
        final double expected = 6;
        assertEquals(expected, operation.sum(4, 2), 0);
    }

    @Test
    public void testSubtraction() {
        final double expected = 2;
        assertEquals(expected, operation.subtraction(4, 2), 0);
    }

    @Test
    public void testSubtractionNegative() {
        final double expected = -2;
        assertEquals(expected, operation.subtraction(2, 4), 0);
    }

    @Test
    public void testSubtractionZero() {
        final double expected = 0;
        assertEquals(expected, operation.subtraction(2, 2), 0);
    }

    @Test
    public void testDivision() {
        final double expected = 2;
        assertEquals(expected, operation.division(4, 2), 0);
    }

    @Test
    public void testDivisionNegative() {
        final double expected = -2;
        assertEquals(expected, operation.division(-4, 2), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testZeroDivision() {
        operation.division(4, 0);
    }

    @Test
    public void testMultiplication() {
        final double expected = 8;
        assertEquals(expected, operation.multiplication(4, 2), 0);
    }

    @Test
    public void testMultiplicationNegative() {
        final double expected = -8;
        assertEquals(expected, operation.multiplication(4, -2), 0);
    }

    @Test
    public void testMultiplicationZero() {
        final double expected = 0;
        assertEquals(expected, operation.multiplication(4, 0), 0);
    }

}
