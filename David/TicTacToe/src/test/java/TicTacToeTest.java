import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    /**
     * Test to validate positive cases on add function.
     */
    private Board game = new Board();
    private Player player = new Player();
    private TicTacToeChecker checker = new TicTacToeChecker();


    @Test
    void testDefaultPlayerMark() {
        assertEquals('x', player.getCurrentPlayerMark());
    }

    @Test
    void testPlacePlayerMark() {
        player.placeMark(1,1,game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[1][1]);

        assertFalse(player.placeMark(9,7,game.getBoard()));
    }

    @Test
    void tesChangePlayerMark() {
        player.changePlayer();
        assertEquals('o', player.getCurrentPlayerMark());
        player.changePlayer();
        assertEquals('x', player.getCurrentPlayerMark());
    }

    @Test
    void testPlaceMark() {
        player.placeMark(0,0, game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[0][0]);
        player.placeMark(0,1, game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[0][1]);
        player.placeMark(0,2, game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[0][2]);
        player.placeMark(1,0, game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[1][0]);
        player.placeMark(1,1, game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[1][1]);
        player.placeMark(1,2, game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[1][2]);
        player.placeMark(2,0, game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[2][0]);
        player.placeMark(2,1, game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[2][1]);
        player.placeMark(2,2, game.getBoard());
        assertEquals(player.getCurrentPlayerMark(), game.getBoard()[2][2]);
    }
    @Test
    void testIsBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game.setBoard(i, j , 'x');
            }
        }
        assertTrue(game.isBoardFull());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game.setBoard(i, j , '-');
            }
        }
        assertFalse(game.isBoardFull());
    }
    @Test
    void testWinnerOnRowCol() {
        assertFalse(checker.checkForWin(game.getBoard()));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game.setBoard(i, j , 'x');
            }
            assertTrue(checker.checkForWin(game.getBoard()));
            game.setBoard(i, 0 , '-');
        }
        assertTrue(checker.checkForWin(game.getBoard()));
    }
}
