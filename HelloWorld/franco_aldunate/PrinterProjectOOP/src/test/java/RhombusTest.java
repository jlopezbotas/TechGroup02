import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class holds Rhombus unit tests.
 *
 * @author Franco Aldunate
 * @version 16/11/2019
 */
public class RhombusTest {
    private Rhombus rhombus;

    @BeforeEach
    void setUp() {
        rhombus = new Rhombus('+');
    }

    @Test
    void setHeightReturnsTrue() {
        assertTrue(rhombus.setHeight(5));
    }

    @Test
    void setHeightReturnsFalse() {
        assertFalse(rhombus.setHeight(2));
    }
}
