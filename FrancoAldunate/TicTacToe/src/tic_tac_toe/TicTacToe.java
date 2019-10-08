import java.util.Arrays;

/**
 * Created by Gloria a DIOS on 07/10/2019.
 */
public class TicTacToe {
    private static final String X_SYMBOL = "X";
    private static final String O_SYMBOL = "O";
    String playerSymbol;
    final String[][] board;

    /**
     * Constructor {@link TicTacToe} initializes default values.
     */
    public TicTacToe() {
        playerSymbol = X_SYMBOL;
        board = new String[][]{{"-", "-", "-"}, {"-", "-", "-",}, {"-", "-", "-"}};
    }

    /**
     * Constructor {@link TicTacToe} initializes default values.
     */
    public TicTacToe(final String[][] board) {
        playerSymbol = X_SYMBOL;
        this.board = board;
    }

    /**
     * Sets starting player.
     *
     * @param number is player value (1) or (2).
     * @return starting player symbol 1(X), 2(O) or default value 'X'.
     */
    public String setStartPlayer(final int number) {
        if (number > 0 && number <= 2) {
            return setPlayerSymbol(number);
        }
        return playerSymbol;
    }

    /**
     * Sets player symbol.
     *
     * @param number is player value (1) or (2).
     * @return player symbol 1(X) or 2(O).
     */
    private String setPlayerSymbol(final int number) {
        if (number == 1) {
            playerSymbol = X_SYMBOL;
            return playerSymbol;
        }
        playerSymbol = O_SYMBOL;
        return playerSymbol;
    }

    /**
     * Switches current player.
     *
     * @return switched player symbol for 'X' or 'O'.
     */
    public String switchPlayer() {
        if (playerSymbol.equals(X_SYMBOL)) {
            playerSymbol = O_SYMBOL;
        } else {
            playerSymbol = X_SYMBOL;
        }
        return playerSymbol;
    }

    /**
     * Makes selection on Tic Tac Toe board.
     *
     * @param position for target Tic Tac Toe board selection (1 to 9).
     * @return whether selection was successfully set or not.
     */
    public boolean makeSelection(final int position) {
        final int[] boardPosition;
        if (position > 0 && position <= 9) {
            boardPosition = getBoardPosition(position);
            final int x = boardPosition[0];
            final int y = boardPosition[1];
            if (board[x][y].equals("-")) {
                board[x][y] = playerSymbol;
                return true;
            }
        }
        return false;
    }

    /**
     * Gets board position int[x][y].
     *
     * @param position fon Tic Tac Toe board (1 to 9).
     * @return [x][y] equivalent position.
     */
    public int[] getBoardPosition(final int position) {
        int[] relPosition;
        switch (position) {
            case 1:
                relPosition = new int[]{0, 0};
                break;
            case 2:
                relPosition = new int[]{0, 1};
                break;
            case 3:
                relPosition = new int[]{0, 2};
                break;
            case 4:
                relPosition = new int[]{1, 0};
                break;
            case 5:
                relPosition = new int[]{1, 1};
                break;
            case 6:
                relPosition = new int[]{1, 2};
                break;
            case 7:
                relPosition = new int[]{2, 0};
                break;
            case 8:
                relPosition = new int[]{2, 1};
                break;
            case 9:
                relPosition = new int[]{2, 2};
                break;
            default:
                relPosition = null;
                break;
        }
        return relPosition;
    }

    /**
     * Validates if the game has a winner.
     *
     * @return whether the game has a winner or not.
     */
    public boolean hasWinner() {
        if (!hasRowWinner()) {
            if (!hasColumnWinner()) {
                return hasCrossedWinner();
            }
        }
        return true;
    }

    /**
     * Validates if the game has a row winner.
     *
     * @return whether the game has a row winner or not.
     */
    public boolean hasRowWinner() {
        for (int i = 0; i < 3; i++) {
            final String first = board[i][0];
            final String second = board[i][1];
            final String third = board[i][2];
            if (!first.equals("-") && first.equals(second) && second.equals(third)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Validates if the game has a column winner.
     *
     * @return whether the game has a column winner or not.
     */
    public boolean hasColumnWinner() {
        for (int i = 0; i < 3; i++) {
            final String first = board[0][i];
            final String second = board[1][i];
            final String third = board[2][i];
            if (!first.equals("-") && first.equals(second) && second.equals(third)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Validates if the game has a crossed winner.
     *
     * @return whether the game has a crossed winner or not.
     */
    public boolean hasCrossedWinner() {
        String first, second, third;
        first = board[0][0];
        second = board[1][1];
        third = board[2][2];
        if (!first.equals("-") && first.equals(second) && second.equals(third)) {
            return true;
        }
        first = board[0][2];
        third = board[2][0];
        return !first.equals("-") && first.equals(second) && second.equals(third);
    }

    /**
     * Verifies if the game is over.
     *
     * @return whether the game is over or not.
     */
    public boolean isGameOver() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Prints current board values.
     */
    public void printBoard() {
        Arrays.stream(board)
                .forEach(
                        (row) -> {
                            System.out.print("[");
                            Arrays.stream(row)
                                    .forEach((element) -> System.out.print(" " + element + " "));
                            System.out.println("]");
                        }
                );
    }
}
