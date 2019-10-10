package abel.tic_tac_toe;

import java.util.Scanner;

public class TicTacToe {

    private static String[][] matrix = new String[3][3];

    public static void main(String[] args) {
        imp();
        setValue();
        imp();
    }

    public static void setValue() {
        Scanner reader = new Scanner(System.in);
        System.out.println("add row");
        int row = reader.nextInt();
        System.out.println("add column");
        int column = reader.nextInt();
        System.out.println(" set value  ");

        String value = reader.next();

        matrix[row][column] = value;


    }

    public static void imp() {
        for (int x = 0; x < matrix.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y]);
                if (y != matrix[x].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}