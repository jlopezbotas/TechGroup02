package tictactoe_oop;

import enums.Seed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class holds BoardCell unit tests.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
public class BoardCellTest {
    private BoardCell boardCell;

    @BeforeEach
    public void setUp() {
        boardCell = new BoardCell();
    }

    @Test
    public void testGetRow() {
        boardCell.setRowCol(1, 0);
        final int expectedResult = 1;
        final int actualResult = boardCell.getRow();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetCol() {
        boardCell.setRowCol(0, 2);
        final int expectedResult = 2;
        final int actualResult = boardCell.getCol();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetContent() {
        boardCell.setContent(Seed.CROSS);
        final Seed expectedResult = Seed.CROSS;
        final Seed actualResult = boardCell.getContent();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetRowCol() {
        boardCell.setRowCol(2, 2);
        assertEquals(new BoardCell(2, 2), boardCell);
    }

    @Test
    public void testSetContent() {
        boardCell.setContent(Seed.NOUGHT);
        assertEquals(Seed.NOUGHT, boardCell.getContent());
    }

    @Test
    public void testClear() {
        boardCell.setContent(Seed.NOUGHT);
        boardCell.clear();
        assertEquals(Seed.EMPTY, boardCell.getContent());
    }
}
