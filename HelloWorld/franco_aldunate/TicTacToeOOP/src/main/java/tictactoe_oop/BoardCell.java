package tictactoe_oop;

import enums.Seed;

/**
 * This class models TicTacToe board Cell.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
public class BoardCell {
    private int row, col;
    private Seed content;

    /**
     * Initializes {@link BoardCell} values.
     *
     * @param row value of BoardCell.
     * @param col value of BoardCell.
     */
    public BoardCell(final int row, final int col) {
        this.row = row;
        this.col = col;
        clear();
    }

    /**
     * Gets BoardCell row value.
     *
     * @return BoardCell row value.
     */
    public int getRow() {
        return row;
    }

    /**
     * Gets BoardCell col value.
     *
     * @return BoardCell col value.
     */
    public int getCol() {
        return col;
    }

    /**
     * Gets BoardCell content value.
     *
     * @return BoardCell content value.
     */
    public Seed getContent() {
        return content;
    }

    /**
     * Sets BoardCell row and col values.
     *
     * @param row BoardCell row value.
     * @param col BoardCell col value.
     */
    public void setRowCol(final int row, final int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Sets BoardCell content value.
     *
     * @param content given value.
     */
    public void setContent(final Seed content) {
        this.content = content;
    }

    /**
     * sets BoardCell content value to EMPTY.
     */
    public void clear() {
        content = Seed.EMPTY;
    }
}
