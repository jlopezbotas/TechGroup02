package tictactoe_oop;


import enums.Seed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class holds Board unit tests.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
public class BoardTest {
    private Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    @Test
    public void init() {
        board.setSelection(1, Seed.CROSS);
        board.init();
        assertEquals(new Board(), board);
    }

    @Test
    public void setSelectionWithAvailablePositionReturnsTrue() {
        final boolean actual = board.setSelection(5, Seed.CROSS);
        assertTrue(actual);
    }

    @Test
    public void setSelectionWithInvalidPositionReturnsFalse() {
        final boolean actual = board.setSelection(0, Seed.CROSS);
        assertFalse(actual);
    }

    @Test
    public void setSelectionWithNotAvailablePositionReturnsFalse() {
        board.setSelection(3, Seed.CROSS);
        final boolean actual = board.setSelection(3, Seed.CROSS);
        assertFalse(actual);
    }

    @Test
    public void hasRowMatchReturnsTrue() {
        board.setSelection(1, Seed.CROSS);
        board.setSelection(2, Seed.CROSS);
        board.setSelection(3, Seed.CROSS);
        boolean actual = board.hasRowMatch();
        assertTrue(actual);
    }

    @Test
    public void hasRowMatchReturnsFalse() {
        board.setSelection(1, Seed.CROSS);
        boolean actual = board.hasRowMatch();
        assertFalse(actual);
    }

    @Test
    public void hasColumnMatchReturnsTrue() {
        board.setSelection(1, Seed.CROSS);
        board.setSelection(4, Seed.CROSS);
        board.setSelection(7, Seed.CROSS);
        boolean actual = board.hasColumnMatch();
        assertTrue(actual);
    }

    @Test
    public void hasColumnMatchMatchReturnsFalse() {
        board.setSelection(1, Seed.CROSS);
        boolean actual = board.hasColumnMatch();
        assertFalse(actual);
    }

    @Test
    public void hasDiagonalMatchFromTopLeftToBottomRightReturnsTrue() {
        board.setSelection(1, Seed.CROSS);
        board.setSelection(5, Seed.CROSS);
        board.setSelection(9, Seed.CROSS);
        boolean actual = board.hasDiagonalMatch();
        assertTrue(actual);
    }

    @Test
    public void hasDiagonalMatchFromBottomLeftToTopRightReturnsTrue() {
        board.setSelection(7, Seed.CROSS);
        board.setSelection(5, Seed.CROSS);
        board.setSelection(3, Seed.CROSS);
        boolean actual = board.hasDiagonalMatch();
        assertTrue(actual);
    }

    @Test
    public void hasDiagonalMatchReturnsFalse() {
        board.setSelection(7, Seed.CROSS);
        boolean actual = board.hasDiagonalMatch();
        assertFalse(actual);
    }

    @Test
    public void isFullReturnsTrue() {
        board.setSelection(1, Seed.CROSS);
        board.setSelection(2, Seed.CROSS);
        board.setSelection(4, Seed.CROSS);
        board.setSelection(8, Seed.CROSS);
        board.setSelection(9, Seed.CROSS);
        board.setSelection(3, Seed.NOUGHT);
        board.setSelection(5, Seed.NOUGHT);
        board.setSelection(6, Seed.NOUGHT);
        board.setSelection(7, Seed.NOUGHT);
        boolean actual = board.isFull();
        assertTrue(actual);

    }

    @Test
    public void isFullReturnsFalse() {
        board.setSelection(1, Seed.CROSS);
        boolean actual = board.isFull();
        assertFalse(actual);

    }
}
