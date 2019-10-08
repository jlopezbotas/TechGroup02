import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToe ticTacToe;
        final Scanner scannerInput = new Scanner(System.in);
        boolean isActive = true;
        System.out.println("Initializing Tic Tac Toe game...");

        while (isActive) {
            ticTacToe = new TicTacToe();
            System.out.print("Chose player to start: 1(X) 2(O_SYMBOL): ");
            int option = scannerInput.nextInt();
            String symbol = ticTacToe.setStartPlayer(option);
            while (!ticTacToe.hasWinner() && !ticTacToe.isGameOver()) {
                System.out.println("Board: ");
                ticTacToe.printBoard();
                System.out.print(String.format("Positions:\n{1,2,3}\n{4,5,6}\n{7,8,9}\nSelect a position for '%s': ", symbol));
                int position = scannerInput.nextInt();
                boolean result = ticTacToe.makeSelection(position);
                if (result) {
                    symbol = ticTacToe.switchPlayer();
                } else {
                    System.out.println(String.format("Position '%s' is not available!", position));
                }
            }
            if (ticTacToe.isGameOver()) {
                System.out.println("Board: ");
                ticTacToe.printBoard();
                System.out.println("Game over, No player wins!");
            } else {
                symbol = ticTacToe.switchPlayer();
                System.out.println(String.format("Player '%s' wins!!!", symbol));
                System.out.println("Board: ");
                ticTacToe.printBoard();
            }
            System.out.print("Continue? Y/N: ");
            final String selection = scannerInput.next();
            if (selection.equalsIgnoreCase("N")) {
                isActive = false;
            }
        }
    }
}
