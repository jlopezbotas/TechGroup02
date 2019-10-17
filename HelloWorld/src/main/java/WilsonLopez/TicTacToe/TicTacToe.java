package WilsonLopez.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    static Scanner board = new Scanner(System.in);

    public static void main(String[] args) {
        play();

    }

    public static void play() {
        char player1 = 'X';
        char player2 = 'O';
        char empty = '-';

        boolean turn = true;

        char tablero[][] = new char[3][3];

        fillMatrix(tablero, empty);
        int row;
        int column;

        Scanner board = new Scanner(System.in);

        while(endGame(tablero)) {
            showCurrentTurn(turn);
            showTablero(tablero);

            row = takeInteger("Insert row");
            column = takeInteger("Insert column");





            turn = !turn;
        }


    }

    public static void showCurrentTurn(boolean turno) {
        if (turno) {
            System.out.println("Turn of player 1");
        } else {
            System.out.println("Turn of player 2");
        }
    }

    public static int takeInteger(String message) {
        System.out.println(message);
        int num = board.nextInt();
        return num;
    }

    public static void fillMatrix(char[][] matrix, char symbol) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = symbol;
            }
        }
    }

    public static boolean validatePosition(char[][] tablero, int row, int column) {
        if (row >= 0 && row < tablero.length && column >= 0 && column < tablero.length){
            return true;
        }
        return false;
    }

    public static boolean endGame(char[][] matrix) {

    }

    public static void showTablero(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
