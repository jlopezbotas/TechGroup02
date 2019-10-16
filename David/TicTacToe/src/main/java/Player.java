import java.util.Scanner;

/**
 * Define the Tic-Tac-Toe player.
 */
class Player extends TicTacToeChecker {
    private char currentPlayerMark;

    /**
     * Constructor to initialize a player marker
     */
    Player(){
        currentPlayerMark = 'x';
    }
    /**
     * Get the current player mark
     * @return Player's Char mark
     */
    char getCurrentPlayerMark() {
        return currentPlayerMark;
    }

    /**
     * Change player turn
     */
    void changePlayer() {
        currentPlayerMark = (currentPlayerMark == 'x')? 'o' : 'x';
    }

    /**
     * Read player mark row
     */
    int readPlayerMarkRow(Scanner scan){
        System.out.println("Select a row [1-3]");
        return scan.nextInt()-1;
    }
    /**
     * Read player mark column
     */
    int readPlayerMarkColumn(Scanner scan){
        System.out.println("Select a column [1-3]");
        return scan.nextInt()-1;
    }
    /**
     * Place a mark on a given position
     * @param row Selected row
     * @param col Selected column
     * @return  true if the mark has taken effect
     */
    boolean placeMark(int row, int col, char[][] board) {
        if ((row >= 0 && row < 3) && (col >= 0 && col < 3) && (board[row][col] == '-')) {
            board[row][col] = currentPlayerMark;
            return true;
        }
        return false;
    }
}
