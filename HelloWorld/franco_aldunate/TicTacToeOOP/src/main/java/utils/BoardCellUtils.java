package utils;

import tictactoe_oop.BoardCell;

/**
 * This is a BoardCell utility class.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
public final class BoardCellUtils {

    /**
     * Constructor of {@link BoardCellUtils}
     */
    private BoardCellUtils() {
    }

    /**
     * Gets BoardCell with row and col values set given position (1-9).
     *
     * @param position given (1-9).
     * @return BoardCell with row and col values set given position (1-9).
     */
    public static BoardCell getBoardCell(final int position) {
        BoardCell boardCell = null;
        switch (position) {
            case 1:
                boardCell = new BoardCell(0, 0);
                break;
            case 2:
                boardCell = new BoardCell(0, 1);
                break;
            case 3:
                boardCell = new BoardCell(0, 2);
                break;
            case 4:
                boardCell = new BoardCell(1, 0);
                break;
            case 5:
                boardCell = new BoardCell(1, 1);
                break;
            case 6:
                boardCell = new BoardCell(1, 2);
                break;
            case 7:
                boardCell = new BoardCell(2, 0);
                break;
            case 8:
                boardCell = new BoardCell(2, 1);
                break;
            case 9:
                boardCell = new BoardCell(2, 2);
                break;
            default:
                break;
        }
        return boardCell;
    }
}
