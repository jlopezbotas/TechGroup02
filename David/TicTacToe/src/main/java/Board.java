/**
 * Define the Tic-Tac-Toe Board.
 */
class Board extends TicTacToeChecker {
    private char[][] board;

    /**
     * Constructor to initialize a new game session
     */
    Board(){
        super();
        board = new char[3][3];
        this.initializeBoard();
        System.out.println("Welcome to Classic games");
        System.out.println("< Tic-Tac-Toe »");
    }

    /**
     * Initialize a new empty board
     */
    private void initializeBoard() {
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
        System.out.println("Current board layout:");
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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }

        return true;
    }
    /**
     * Return the marked value on position
     * @return Board
     */
    char[][] getBoard(){
        return board;
    }
}
