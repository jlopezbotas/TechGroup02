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
        Board game = new Board();
        Player player = new Player();
        do {
            game.printBoard();
            int row;
            int col;
            do {
                System.out.printf("Current player %s:%n", player.getCurrentPlayerMark());
                row = player.readPlayerMarkRow(scan);
                col = player.readPlayerMarkColumn(scan);
            } while (!player.placeMark(row, col, game.getBoard()));

            player.changePlayer();

        } while(!game.checkForWin(game.getBoard()) && !game.isBoardFull());
        game.printBoard();
        player.changePlayer();
        String finalResult = (game.isBoardFull() && !game.checkForWin(game.getBoard()))? "The game was a tie!":
                format("Player %s Wins!%n", player.getCurrentPlayerMark());
        System.out.println(finalResult);
    }
}
