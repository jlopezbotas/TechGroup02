package main.java.com.model;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        Integer col;
        Integer row;

        while(!game.CheckForWin() && !game.CheckForDraw()) {
            System.out.println("Select a row: ");
            row = scanner.nextInt();
            while(row > 3 || row < 0) {
                System.out.println("Please select a correct row: ");
                row = scanner.nextInt();
            }
            System.out.println("Select a col: ");
            col = scanner.nextInt();
            while(col > 3 || col < 0) {
                System.out.println("Please select a correct row: ");
                col = scanner.nextInt();
            }
            game.PlaceMark(row, col);
            char[][] a = game.getBoard();
            game.PrintBoard(a);
            game.ChangePlayer();
        }

        if (game.CheckForWin()) {
            System.out.println("We have a winner! Congrats!");
            System.exit(0);
        } else if (game.CheckForDraw()) {
            System.out.println("Appears we have a draw!");
            System.exit(0);
        }
    }
}
