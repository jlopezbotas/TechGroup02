import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class RectangleTest {

    @Test
    void print() {
        final Rectangle rectangle = new Rectangle("+", 4, 6);
        final String expected = "++++\n" +
                "++++\n" +
                "++++\n" +
                "++++\n" +
                "++++\n" +
                "++++\n";
        assertEquals(expected, rectangle.print());
    }
}