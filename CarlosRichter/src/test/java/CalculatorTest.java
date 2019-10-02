import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void positivetestCalculate() {
        assertEquals("5.0",Calculator.calculate("3","2","+"));
        assertEquals("1.0",Calculator.calculate("3","2","-"));
        assertEquals("6.0",Calculator.calculate("3","2","x"));
        assertEquals("2.0",Calculator.calculate("4","2","/"));
        assertEquals("0.0",Calculator.calculate("0","0","x"));
        assertEquals("-2.0",Calculator.calculate("0","-2","+"));
        assertEquals("2.25",Calculator.calculate("9","4","/"));
    }
    @Test
    public void dotTest() {
        assertEquals(true,Calculator.existDot(".000000"));
        assertEquals(false,Calculator.existDot(""));
        assertEquals(false,Calculator.existDot("455"));
        assertEquals(true,Calculator.existDot("0.0.0.0.0.0.0.0"));

    }


}