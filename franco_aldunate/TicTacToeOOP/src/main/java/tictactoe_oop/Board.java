package tictactoe_oop;

import enums.Seed;
import utils.BoardCellUtils;

import java.util.Arrays;

/**
 * This class models a 3x3 TicTacToe tictactoe_oop.Board.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
public class Board {
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private BoardCell[][] boardCells;

    /**
     * Constructor {@link Board} initializes default boardCells.
     */
    public Board() {
        boardCells = new BoardCell[ROWS][COLS];
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                boardCells[row][col] = new BoardCell(row, col);
            }
        }
    }

    /**
     * Gets the BoardCell array.
     *
     * @return the BoardCell array.
     */
    public BoardCell[][] getBoardCells() {
        return boardCells;
    }

    /**
     * Resets all cell symbols to default.
     */
    public void init() {
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                boardCells[row][col].clear();
            }
        }
    }

    /**
     * Sets selection on board.
     *
     * @param position for target board selection (1 to 9).
     * @param content  to set on target board position.
     * @return whether selection was successfully set or not.
     */
    public boolean setSelection(final int position, final Seed content) {
        if (position > 0 && position <= 9) {
            final BoardCell boardCell = BoardCellUtils.getBoardCell(position);
            final int row = boardCell.getRow();
            final int col = boardCell.getCol();
            final Seed cellContent = boardCells[row][col].getContent();
            if (cellContent.equals(Seed.EMPTY)) {
                boardCells[row][col].setRowCol(row, col);
                boardCells[row][col].setContent(content);
                return true;
            }
        }
        return false;
    }

    /**
     * Validates if the board has a row with same symbol repeated.
     *
     * @return whether the board has a row with same symbol repeated.
     */
    public boolean hasRowMatch() {
        for (int i = 0; i < 3; i++) {
            final Seed first = boardCells[i][0].getContent();
            final Seed second = boardCells[i][1].getContent();
            final Seed third = boardCells[i][2].getContent();
            if (!first.equals(Seed.EMPTY) && first.equals(second) && second.equals(third)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Validates if the board has a column with same symbol repeated.
     *
     * @return whether the board has a column with same symbol repeated.
     */
    public boolean hasColumnMatch() {
        for (int i = 0; i < 3; i++) {
            final Seed first = boardCells[0][i].getContent();
            final Seed second = boardCells[1][i].getContent();
            final Seed third = boardCells[2][i].getContent();
            if (!first.equals(Seed.EMPTY) && first.equals(second) && second.equals(third)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Validates if the board has a diagonal with boardCells with same symbol repeated.
     *
     * @return whether the board has a diagonal with boardCells with same symbol repeated.
     */
    public boolean hasDiagonalMatch() {
        Seed first, second, third;
        first = boardCells[0][0].getContent();
        second = boardCells[1][1].getContent();
        third = boardCells[2][2].getContent();
        if (!first.equals(Seed.EMPTY) && first.equals(second) && second.equals(third)) {
            return true;
        }
        first = boardCells[0][2].getContent();
        third = boardCells[2][0].getContent();
        return !first.equals(Seed.EMPTY) && first.equals(second) && second.equals(third);
    }

    /**
     * Verifies if the board is full.
     *
     * @return whether the board is full or not.
     */
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (boardCells[i][j].getContent().equals(Seed.EMPTY)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Prints current board values in matrix format.
     */
    public void print() {
        System.out.println("------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
                System.out.print(boardCells[i][j].getContent().getValue() + " | ");
            System.out.println();
            System.out.println("------------");
        }
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Board))
            return false;
        if (obj == this)
            return true;
        return Arrays.deepEquals(boardCells, ((Board) obj).getBoardCells());
    }
}
