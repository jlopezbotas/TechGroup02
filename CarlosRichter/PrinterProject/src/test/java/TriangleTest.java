import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void print() {
        final Triangle triangle = new Triangle("%", 5);
        final String expected = "    %\n" +
                "   %%%\n" +
                "  %%%%%\n" +
                " %%%%%%%\n" +
                "%%%%%%%%%\n";
        assertEquals(expected, triangle.print());
    }
}