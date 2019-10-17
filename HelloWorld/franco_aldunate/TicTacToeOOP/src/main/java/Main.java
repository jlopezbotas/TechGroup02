import tictactoe_oop.TicTacToe;

import java.util.Scanner;

/**
 * This class executes TicTacToe Game.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
public class Main {
    public static void main(String[] args) {
        final TicTacToe ticTacToe = new TicTacToe();
        final Scanner scannerInput = new Scanner(System.in);
        boolean isActive = true;
        System.out.println("Initializing Tic Tac Toe OOP game...");

        while (isActive) {
            ticTacToe.initGame();
            while (!ticTacToe.hasWinner() && !ticTacToe.isGameOver()) {
                System.out.println("Board: ");
                ticTacToe.printBoard();
                System.out.print(String.format("Positions:\n{1,2,3}\n{4,5,6}\n{7,8,9}\nSelect a position for '%s': ",
                        ticTacToe.getCurrentSeed().getValue()));
                int position = scannerInput.nextInt();
                boolean result = ticTacToe.makeSelection(position);
                if (result) {
                    ticTacToe.switchPlayer();
                } else {
                    System.out.println(String.format("XYPosition '%s' is not available!", position));
                }
            }
            if (ticTacToe.isGameOver()) {
                System.out.println("Board: ");
                ticTacToe.printBoard();
                System.out.println("Game over, No player wins!");
            } else {
                ticTacToe.switchPlayer();
                System.out.println(String.format("Player '%s' wins!!!", ticTacToe.getCurrentSeed().getValue()));
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
