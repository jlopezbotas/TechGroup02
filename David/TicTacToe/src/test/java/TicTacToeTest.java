import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TicTacToeTest {
    /**
     * Test to validate positive cases on add function.
     */
    private Board game = new Board();
    private Player player = new Player();


    @Test
    void testDefaultPlayerMark() {
        assertEquals('x', player.getCurrentPlayerMark());
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
}
