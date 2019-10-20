import org.junit.jupiter.api.Test;
import jorge_flores.tic_tac_toe.model.TableTTT;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    private TableTTT tableTTT = new TableTTT();

    @Test
    public void testVerifyTicTacToe1() {
        String[][] table = new String[][]{{"X", "X", "X"}, {"O", "X", "O"}, {"7", "O", "O"}};
        tableTTT.setTable(table);
        assertEquals(true, tableTTT.verifyTicTacToe());
    }

    @Test
    public void testVerifyTicTacToe2() {
        String[][] table = {{"X", "0", "X"}, {"O", "X", "O"}, {"X", "O", "O"}};
        tableTTT.setTable(table);
        assertEquals(true, tableTTT.verifyTicTacToe());
    }

    @Test
    public void testVerifyTicTacToe3() {
        String[][] table = {{"O", "X", "X"}, {"O", "X", "O"}, {"7", "O", "X"}};
        tableTTT.setTable(table);
        assertEquals(false, tableTTT.verifyTicTacToe());
    }

    @Test
    public void testVerifyTicTacToe4() {
        String[][] table = {{"O", "O", "O"}, {"O", "X", "X"}, {"X", "O", "O"}};
        tableTTT.setTable(table);
        assertEquals(true, tableTTT.verifyTicTacToe());
    }

    @Test
    public void testVerifyTicTacToe5() {
        String[][] table = {{"X", "O", "X"}, {"O", "O", "O"}, {"7", "X", "O"}};
        tableTTT.setTable(table);
        assertEquals(true, tableTTT.verifyTicTacToe());
    }

    @Test
    public void testCleanAll() {
        final String[][] table = {{"X", "X", "X"}, {"O", "X", "O"}, {"7", "O", "O"}};
        final String[][] expected = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        tableTTT.setTable(table);
        tableTTT.cleanAll();
        assertArrayEquals(expected, tableTTT.getTable());
    }
}
