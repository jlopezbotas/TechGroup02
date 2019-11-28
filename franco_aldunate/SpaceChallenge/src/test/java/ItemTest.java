import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class holds Item unit tests.
 *
 * @author Franco Aldunate
 * @version 29/10/2019
 */
public class ItemTest {
    private Item item;

    @BeforeEach
    public void setUp() {
        item = new Item("steel", 8000);
    }

    @Test
    public void getName() {
        final String actual = item.getName();
        assertEquals("steel", actual);
    }

    @Test
    public void getWeight() {
        final int actual = item.getWeight();
        assertEquals(8000, actual);
    }
}
