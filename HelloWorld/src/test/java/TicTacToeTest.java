import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    public void testCleanDashboard() {
        TicTacToe tictactoe = new TicTacToe();
        assertTrue(tictactoe.getDashboard().isEmpty());
    }

    @Test
    public void testSingleRowWinnerDashboard() {
        TicTacToe tictactoe = new TicTacToe();

        tictactoe.getDashboard().fillField("X", new Position(0,0));
        tictactoe.getDashboard().fillField("X", new Position(1,0));
        tictactoe.getDashboard().fillField("X", new Position(2,0));
        assertTrue(tictactoe.getDashboard().haveAWinner("X"));
    }

    @Test
    public void testSingleColumnWinnerDashboard() {
        TicTacToe tictactoe = new TicTacToe();
        tictactoe.getDashboard().fillField("O", new Position(0,0));
        tictactoe.getDashboard().fillField("O", new Position(0,1));
        tictactoe.getDashboard().fillField("O", new Position(0,2));
        assertTrue(tictactoe.getDashboard().haveAWinner("O"));
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