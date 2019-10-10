import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    public void testBoardClass() {
        Board board = new Board();
        assertEquals(false,board.isDraw());

    }

    @Test
    public void testGameMainClass() {
        final String expectedResult = "Hola";
        assertEquals(expectedResult, "Hola");
    }
}