package tictactoe_oop;

import enums.Seed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class holds TicTacToe unit tests.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
public class TicTacToeTest {
    private TicTacToe ticTacToe;

    @BeforeEach
    public void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void getCurrentSeed() {
        final Seed actualSeed = ticTacToe.getCurrentSeed();
        final Seed expectedSeed = Seed.CROSS;
        assertEquals(expectedSeed, actualSeed);
    }

    @Test
    public void getBoard() {
        final Board actual = ticTacToe.getBoard();
        assertEquals(new TicTacToe().getBoard(), actual);
    }

    @Test
    public void switchPlayerSetsNOUGHT() {
        ticTacToe.switchPlayer();
        final Seed actual = ticTacToe.getCurrentSeed();
        assertEquals(Seed.NOUGHT, actual);
    }

    @Test
    public void switchPlayerSetsCROSS() {
        ticTacToe.switchPlayer();
        ticTacToe.switchPlayer();
        final Seed actual = ticTacToe.getCurrentSeed();
        assertEquals(Seed.CROSS, actual);
    }

    @Test
    public void makeSelectionReturnsTrue() {
        final boolean actual = ticTacToe.makeSelection(3);
        assertTrue(actual);
    }

    @Test
    public void makeSelectionReturnsFalse() {
        final boolean actual = ticTacToe.makeSelection(10);
        assertFalse(actual);
    }

    @Test
    public void hasWinnerOnRowReturnsTrue() {
        ticTacToe.makeSelection(1);
        ticTacToe.makeSelection(2);
        ticTacToe.makeSelection(3);
        final boolean actual = ticTacToe.hasWinner();
        assertTrue(actual);
    }

    @Test
    public void hasWinnerOnColReturnsTrue() {
        ticTacToe.makeSelection(1);
        ticTacToe.makeSelection(4);
        ticTacToe.makeSelection(7);
        final boolean actual = ticTacToe.hasWinner();
        assertTrue(actual);
    }

    @Test
    public void hasWinnerOnDiagonalReturnsTrue() {
        ticTacToe.makeSelection(1);
        ticTacToe.makeSelection(5);
        ticTacToe.makeSelection(9);
        final boolean actual = ticTacToe.hasWinner();
        assertTrue(actual);
    }

    @Test
    public void hasWinnerReturnsFalse() {
        ticTacToe.makeSelection(1);
        ticTacToe.makeSelection(5);
        ticTacToe.makeSelection(8);
        final boolean actual = ticTacToe.hasWinner();
        assertFalse(actual);
    }

    @Test
    public void isGameOverReturnsTrue() {
        ticTacToe.makeSelection(1);
        ticTacToe.makeSelection(2);
        ticTacToe.makeSelection(4);
        ticTacToe.makeSelection(8);
        ticTacToe.makeSelection(9);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.makeSelection(5);
        ticTacToe.makeSelection(6);
        ticTacToe.makeSelection(7);
        final boolean actual = ticTacToe.isGameOver();
        assertTrue(actual);
    }

    @Test
    public void isGameOverReturnsFalse() {
        ticTacToe.makeSelection(1);
        final boolean actual = ticTacToe.isGameOver();
        assertFalse(actual);
    }


    @Test
    public void initGame() {
        ticTacToe.makeSelection(1);
        ticTacToe.initGame();
        assertEquals(new TicTacToe(), ticTacToe);
    }
}