package test.java.com.model;

import main.java.com.model.Calculator;
import java.lang.Throwable;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void whenAdditionTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.Addition(2,3));
    }

    @Test
    public void whenSubtractionTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.Subtraction(3,2));
    }

    @Test
    public void whenMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.Multiply(3,2));
    }

    @Test
    public void whenDivideTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.Divide(4,2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.Divide(5, 0);
    }
}
