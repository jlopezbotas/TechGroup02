import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    public void testHelloInSpanish() {
        final String expectedResult = "Hola";
        assertEquals(expectedResult, Hello.getSpanish());
    }
}