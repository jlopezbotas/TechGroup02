import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class holds Calculator Division unit tests.
 *
 * @author Franco Aldunate
 * @version 19/10/2019
 */
public class DivideTest {
    private Calculator calculator;

    /**
     * This method tests instancing of Calculator Class.
     */
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * This method tests division of two Double values.
     */
    @Test
    public void divisionOfTwoDoubleValues() {
        final double a = 4.5;
        final double b = 2.5;
        final double actualResult = calculator.divide(a, b);
        final double expectedResult = 1.8;
        assertEquals(expectedResult, actualResult, 0.1);
    }

    /**
     * This method tests division of two Double values.
     */
    @Test
    public void divisionOf3And2Is1Dot5() {
        final double a = 3;
        final double b = 2;
        final double actualResult = calculator.divide(a, b);
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0.1);
    }

    /**
     * This method tests division of Double and negative Double values.
     */
    @Test
    public void divisionOfDoubleAndNegativeDoubleIsNegative() {
        final double a = 10.5;
        final double b = -2.0;
        final double actualResult = calculator.divide(a, b);
        final double expectedResult = -5.25;
        assertEquals(expectedResult, actualResult, 0.1);
    }

    /**
     * This method tests division of Double and Zero values.
     */
    @Test()
    public void divisionOfDoubleAndZeroThrowsException() {
        final double a = 7.5;
        final double b = 0;
        final double actualResult = calculator.divide(a, b);
        final double expectedResult = 0;
        assertEquals(expectedResult, actualResult, 0.1);
    }
}
