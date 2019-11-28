package utils;

import org.junit.jupiter.api.Test;
import tictactoe_oop.BoardCell;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class holds BoardCell utility class unit tests.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
class BoardCellUtilsTest {

    @Test
    public void getBoardCellForPositionOne() {
        final BoardCell actual = BoardCellUtils.getBoardCell(1);
        assertEquals(new BoardCell(0, 0), actual);
    }

    @Test
    public void getBoardCellForPositionTwo() {
        final BoardCell actual = BoardCellUtils.getBoardCell(2);
        assertEquals(new BoardCell(0, 1), actual);
    }

    @Test
    public void getBoardCellForPositionThree() {
        final BoardCell actual = BoardCellUtils.getBoardCell(3);
        assertEquals(new BoardCell(0, 2), actual);
    }

    @Test
    public void getBoardCellForPositionFour() {
        final BoardCell actual = BoardCellUtils.getBoardCell(4);
        assertEquals(new BoardCell(1, 0), actual);
    }

    @Test
    public void getBoardCellForPositionFive() {
        final BoardCell actual = BoardCellUtils.getBoardCell(5);
        assertEquals(new BoardCell(1, 1), actual);
    }

    @Test
    public void getBoardCellForPositionSix() {
        final BoardCell actual = BoardCellUtils.getBoardCell(6);
        assertEquals(new BoardCell(1, 2), actual);
    }

    @Test
    public void getBoardCellForPositionSeven() {
        final BoardCell actual = BoardCellUtils.getBoardCell(7);
        assertEquals(new BoardCell(2, 0), actual);
    }

    @Test
    public void getBoardCellForPositionEight() {
        final BoardCell actual = BoardCellUtils.getBoardCell(8);
        assertEquals(new BoardCell(2, 1), actual);
    }

    @Test
    public void getBoardCellForPositionNine() {
        final BoardCell actual = BoardCellUtils.getBoardCell(9);
        assertEquals(new BoardCell(2, 2), actual);
    }

    @Test
    public void getBoardCellForInvalidPosition() {
        final BoardCell actual = BoardCellUtils.getBoardCell(0);
        assertEquals(null, actual);
    }
}