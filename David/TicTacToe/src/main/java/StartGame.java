import java.util.Scanner;
import static java.lang.String.format;

/**
 * Main class to start the game.
 */
public class StartGame {

    /**
     * Index method of  program
     * @param args arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.initializeBoard();
        System.out.println("Welcome to Classic games");
        System.out.println("< Tic-Tac-Toe »");

        do {
            System.out.println("Current board layout:");
            game.printBoard();
            int row;
            int col;
            do {
                System.out.printf("Current player %s:%n", game.getCurrentPlayerMark());
                System.out.println("Select a row [1-3]");
                row = scan.nextInt()-1;
                System.out.println("Select a column [1-3]");
                col = scan.nextInt()-1;
            } while (!game.placeMark(row, col));

            game.changePlayer();

        } while(!game.checkForWin() && !game.isBoardFull());
        System.out.println("Current board layout:");
        game.printBoard();
        game.changePlayer();
        String finalResult = (game.isBoardFull() && !game.checkForWin())? "The game was a tie!":
                format("Player %s Wins!%n", game.getCurrentPlayerMark());
        System.out.println(finalResult);
    }
}
