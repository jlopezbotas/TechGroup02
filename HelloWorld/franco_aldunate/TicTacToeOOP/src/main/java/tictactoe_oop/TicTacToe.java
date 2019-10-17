package tictactoe_oop;

import enums.Seed;

/**
 * This class represents a TicTacToe game.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
public class TicTacToe {
    private Seed currentSeed;
    private final Board board;

    /**
     * Constructor {@link TicTacToe} initializes default values.
     */
    public TicTacToe() {
        board = new Board();
        currentSeed = Seed.CROSS;
    }

    /**
     * Gets current Seed.
     *
     * @return current Seed.
     */
    public Seed getCurrentSeed() {
        return currentSeed;
    }

    /**
     * Switches current Seed.
     */
    public void switchPlayer() {
        if (currentSeed.equals(Seed.CROSS)) {
            currentSeed = Seed.NOUGHT;
        } else {
            currentSeed = Seed.CROSS;
        }
    }

    /**
     * Makes a selection on TicTacToe board.
     *
     * @param position to mark on TicTacToe board.
     * @return whether the selection on TicTacToe board was successfully made or not.
     */
    public boolean makeSelection(int position) {
        return board.setSelection(position, currentSeed);
    }

    /**
     * Validates if the game has a winner.
     *
     * @return whether the game has a winner or not.
     */
    public boolean hasWinner() {
        if (!board.hasRowMatch()) {
            if (!board.hasColumnMatch()) {
                return board.hasDiagonalMatch();
            }
        }
        return true;
    }

    /**
     * Verifies if no more selections to perform are left.
     *
     * @return whether no more selections to perform are left.
     */
    public boolean isGameOver() {
        return board.isFull();
    }

    /**
     * Initializes TicTacToe game.
     */
    public void initGame() {
        board.init();
    }

    /**
     * Prints TicTacToe board.
     */
    public void printBoard() {
        board.print();
    }
}
