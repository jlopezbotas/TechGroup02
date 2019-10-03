import org.junit.Test;

import static org.junit.Assert.*;


public class TestCalculator {
    private Calculator calculator = new Calculator();

    @Test
    public void sumTwoNumbers() {
        assertEquals("29.0", calculator.add(14, 15.0));
    }

    @Test
    public void subtractTest() {
        assertEquals("7.5", calculator.subtract(22.5, 15.0));
    }

    @Test
    public void multiplyTest() {
        assertEquals("30.0", calculator.multiply(2, 15.0));
    }

    @Test
    public void divisionTest() {
        assertEquals("2.5", calculator.divide(5, 2));
    }

    @Test
    public void divisionByZeroTest() {
        assertEquals("Cannot divide by zero", calculator.divide(22.5, 0));
    }
}