/**
 * Define the Tic-Tac-Toe checker.
 */
class TicTacToeChecker {

    /**
     * Constructor to initialize a new game session
     */
    TicTacToeChecker() {
    }

    /**
     * Check whether the conditions to declare a winner has been met or not
      * @return true if there is a win, false otherwise.
     */
    boolean checkForWin(char[][] board) {
        return (checkRowsForWin(board) || checkColumnsForWin(board) || checkDiagonalsForWin(board));
    }

    /**
     * Check for winner on rows
     * @return true if there is a winner on some row
     */
    private boolean checkRowsForWin(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) return true;
        }
        return false;
    }

    /**
     * Check for winner on columns
     * @return true if there is a winner on some columns
     */
    private boolean checkColumnsForWin(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check for winner on diagonal
     * @return true if there is a winner on some diagonal
     */
    private boolean checkDiagonalsForWin(char[][] board) {
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





}