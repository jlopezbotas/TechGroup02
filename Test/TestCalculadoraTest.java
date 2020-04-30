import org.junit.Test;

import static org.junit.Assert.*;

public class TestSumaTest {

    @Test
    public void sumaTest() {
        double val1 = 12;
        double val2 = 7;
        double resultado = new Suma(val1,val2).getResultado();
        assertEquals(19, resultado ,0);
    }
    @Test
    public void RestaTest() {
        double val1 = 15;
        double val2 = 6;
        double resultado = new Resta(val1,val2).getResultado();
        assertEquals(9, resultado ,0);
    }
    @Test
    public void MultiplicacionTest() {
        double val1 = 4;
        double val2 = 9;
        double resultado = new Multiplicacion(val1,val2).getResultado();
        assertEquals(36, resultado ,0);
    }
    @Test
    public void DivisionTest() {
        double val1 = 50;
        double val2 = 5;
        double resultado = new Division(val1,val2).getResultado();
        assertEquals(10, resultado ,0);
    }
}