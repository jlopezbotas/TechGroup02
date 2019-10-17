import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void testCleanDashboard() {
        TicTacToe tictactoe = new TicTacToe();
        assertTrue(tictactoe.getDashboard().isEmpty());
    }

    @Test
    void testSingleRowWinnerDashboard() {
        TicTacToe tictactoe = new TicTacToe();

        tictactoe.getDashboard().fillField("X", new Position(0,0));
        tictactoe.getDashboard().fillField("X", new Position(1,0));
        tictactoe.getDashboard().fillField("X", new Position(2,0));
        assertEquals("X",tictactoe.getDashboard().haveAWinner());
    }

    @Test
    void testSingleColumnWinnerDashboard() {
        TicTacToe tictactoe = new TicTacToe();
        tictactoe.getDashboard().fillField("O", new Position(0,0));
        tictactoe.getDashboard().fillField("O", new Position(0,1));
        tictactoe.getDashboard().fillField("O", new Position(0,2));
        assertEquals("O", tictactoe.getDashboard().haveAWinner());
    }

    @Test
    void testSingleDiagonalWinnerDashboard() {
        TicTacToe tictactoe = new TicTacToe();
        tictactoe.getDashboard().fillField("I", new Position(0,2));
        tictactoe.getDashboard().fillField("I", new Position(1,1));
        tictactoe.getDashboard().fillField("I", new Position(2,0));
        assertEquals("I", tictactoe.getDashboard().haveAWinner());
    }

    @Test
    public void testNoEmptyCellDashboard() {
        TicTacToe tictactoe = new TicTacToe();
        try {
            tictactoe.getDashboard().fillField("X", new Position(1,1));
            tictactoe.getDashboard().fillField("X", new Position(1,1));
        } catch (Exception e) {
            assertEquals("DDD",e.getMessage());
        }
        fail("No error overwritting the field");
    }
}