import static org.junit.Assert.*;

public class BasicCalculatorTest {

    BasicCalculator basicCalculator;

    @org.junit.Before
    public void setUp(){
        basicCalculator = new BasicCalculator();
    }

    @org.junit.Test
    public void add_addTwoNumbers() {
        int expected = 13;
        int num1=5;
        int num2=8;
        assertEquals(expected, basicCalculator.add(num1, num2));
    }

    @org.junit.Test
    public void substract_substractTwoNumbers() {
        int expected = 19;
        int num1=26;
        int num2=7;
        assertEquals(expected, basicCalculator.substract(num1, num2));
    }

    @org.junit.Test
    public void multiply_multiplyTwoNumbers() {
        int expected = 72;
        int num1=9;
        int num2=8;
        assertEquals(expected, basicCalculator.multiply(num1, num2));
    }

    @org.junit.Test
    public void divide_divideTwoNumbers() {
        double expected = 9.0;
        int num1=27;
        int num2=3;
        assertEquals(expected, basicCalculator.divide(num1, num2), 0.1);
    }

    @org.junit.Test
    public void divide_divideByZero() {
        double expected = Double.POSITIVE_INFINITY;
        int num1=27;
        int num2=0;
        assertEquals(expected, basicCalculator.divide(num1, num2), 0.1);
    }
}