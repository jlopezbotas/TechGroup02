import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

public class TicTacToeTest {
    /**
     * Test to validate positive cases on add function.
     */
    private TicTacToe game = new TicTacToe();

    @Test
    public void testDefaultPlayerMark() {
        assertEquals('x', game.getCurrentPlayerMark());
    }

    @Test
    public void tesChangePlayerMark() {
        game.changePlayer();
        assertEquals('o', game.getCurrentPlayerMark());
        game.changePlayer();
        assertEquals('x', game.getCurrentPlayerMark());
    }

    @Test
    public void testPlaceMark() {
        game.placeMark(0,0);
        assertEquals(game.getCurrentPlayerMark(), game.getBoard()[0][0]);
        game.placeMark(0,1);
        assertEquals(game.getCurrentPlayerMark(), game.getBoard()[0][1]);
        game.placeMark(0,2);
        assertEquals(game.getCurrentPlayerMark(), game.getBoard()[0][2]);
        game.placeMark(1,0);
        assertEquals(game.getCurrentPlayerMark(), game.getBoard()[1][0]);
        game.placeMark(1,1);
        assertEquals(game.getCurrentPlayerMark(), game.getBoard()[1][1]);
        game.placeMark(1,2);
        assertEquals(game.getCurrentPlayerMark(), game.getBoard()[1][2]);
        game.placeMark(2,0);
        assertEquals(game.getCurrentPlayerMark(), game.getBoard()[2][0]);
        game.placeMark(2,1);
        assertEquals(game.getCurrentPlayerMark(), game.getBoard()[2][1]);
        game.placeMark(2,2);
        assertEquals(game.getCurrentPlayerMark(), game.getBoard()[2][2]);
    }
}
