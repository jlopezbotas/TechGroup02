import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class holds Calculator Sum unit tests.
 *
 * @author Franco Aldunate
 * @version 19/10/2019
 */
public class SumTest {
    private Calculator calculator;

    /**
     * This method tests instancing of Calculator Class.
     */
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * This method tests sum of Double MIN_VALUE and negative Double MAX_VALUE.
     */
    @Test
    public void sumOfDoubleMAX_VALUEAndNegativeDoubleMAX_VALUEIs0() {
        final double a = Double.MAX_VALUE;
        final double b = -Double.MAX_VALUE;
        final double actualResult = calculator.sum(a, b);
        final double expectedResult = 0.0;
        assertEquals(expectedResult, actualResult, 0.1);
    }

    /**
     * This method tests sum of double and negative double.
     */
    @Test
    public void sumOf11dot11AndNegative11dot12IsNegative0dot1() {
        final double actualResult = calculator.sum(11.11, -11.12);
        final double expectedResult = -0.1;
        assertEquals(expectedResult, actualResult, 0.1);
    }

    /**
     * This method tests sum of two positive double values.
     */
    @Test
    public void sumOf11dot11And11dot12Is22dot23() {
        final double actualResult = calculator.sum(11.11, 11.12);
        final double expectedResult = 22.23;
        assertEquals(expectedResult, actualResult, 0.1);
    }
}
