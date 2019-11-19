import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RhombusTest {
  @Test
  public void print() {
    final Rhombus rhombus = new Rhombus("%", 11);
    final String expected = "     %\n" +
            "    %%%\n" +
            "   %%%%%\n" +
            "  %%%%%%%\n" +
            " %%%%%%%%%\n" +
            "%%%%%%%%%%%\n" +
            " %%%%%%%%%\n" +
            "  %%%%%%%\n" +
            "   %%%%%\n" +
            "    %%%\n" +
            "     %\n";
    assertEquals(expected, rhombus.print());
  }

}