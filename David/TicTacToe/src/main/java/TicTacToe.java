/**
 * Define the Tic-Tac-Toe game.
 */
class TicTacToe {

    private char[][] board;
    private char currentPlayerMark;

    /**
     * Constructor to initialize a new game session
     */
    TicTacToe() {
        board = new char[3][3];
        currentPlayerMark = 'x';
        initializeBoard();
    }

    /**
     * Get the current player mark
     * @return Player's Char mark
     */
    char getCurrentPlayerMark() {
        return currentPlayerMark;
    }

    /**
     * Initialize a new empty board
     */
    void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    /**
     * Print a current board game.
     */
    void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s | ", board[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Check to see if all possible moves have been done
     * @return true once the board is full and end the game
     */
    boolean isBoardFull() {
        boolean isFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') isFull = false;
            }
        }

        return isFull;
    }

    /**
     * Check whether the conditions to declare a winner has been met or not
      * @return true if there is a win, false otherwise.
     */
    boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    /**
     * Check for winner on rows
     * @return true if there is a winner on some row
     */
    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) return true;
        }
        return false;
    }

    /**
     * Check for winner on columns
     * @return true if there is a winner on some columns
     */
    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check for winner on diagonal
     * @return true if there is a winner on some diagonal
     */
    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2])) ||
                (checkRowCol(board[0][2], board[1][1], board[2][0])));
    }

    /**
     * Check if there is a line of three marks
     * @param c1 First mark
     * @param c2 second mark
     * @param c3 third mark
     * @return true if all three marks are equal and differ from '-'
     */
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    /**
     * Change player turn
     */
    void changePlayer() {
        currentPlayerMark = (currentPlayerMark == 'x')? 'o' : 'x';
    }

    /**
     * Place a mark on a given position
     * @param row Selected row
     * @param col Selected column
     * @return  true if the mark has taken effect
     */
    boolean placeMark(int row, int col) {
        if ((row >= 0 && row < 3) && (col >= 0 && col < 3) && (board[row][col] == '-')) {
            board[row][col] = currentPlayerMark;
            return true;
        }
        return false;
    }

    /**
     * Return the marked value on position
     * @return Board
     */
    char[][] getBoard(){
        return board;
    }
}