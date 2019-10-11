package abel.tic_tac_toe;

import java.util.Scanner;

public class TicTacToe {

    private static String[][] matrix = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    private static Boolean win = false;

    public static void main(String[] args) {
        imp();
        while (!win) {
            setValue();
            imp();
            win = validator(matrix);
        }
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


    public static boolean validator(String[][] matrixTest) {
        if (matrixTest[1][1].equals(matrixTest[2][2]) & matrixTest[2][2].equals(matrixTest[0][0]) & !matrixTest[0][0].equals("-")) {
            System.out.println("WINNER");
            win = true;
        }
        if (matrixTest[0][2].equals(matrixTest[1][1]) & matrixTest[1][1].equals(matrixTest[2][0]) & !matrixTest[2][0].equals("-")) {
            System.out.println("WINNER");
            win = true;

        }
        if (matrixTest[0][0].equals(matrixTest[0][1]) & matrixTest[0][1].equals(matrixTest[0][2]) & !matrixTest[0][2].equals("-")) {
            System.out.println("WINNER");
            win = true;

        }
        if (matrixTest[1][0].equals(matrixTest[1][1]) & matrixTest[1][1].equals(matrixTest[1][2]) & !matrixTest[1][2].equals("-")) {
            System.out.println("WINNER");
            win = true;

        }
        if (matrixTest[2][0].equals(matrixTest[2][1]) & matrixTest[2][1].equals(matrixTest[2][2]) & !matrixTest[2][2].equals("-")) {
            System.out.println("WINNER");
            win = true;

        }
        if (matrixTest[0][0].equals(matrixTest[1][0]) & matrixTest[1][0].equals(matrixTest[2][0]) & !matrixTest[2][0].equals("-")) {
            System.out.println("WINNER");
            win = true;

        }
        if (matrixTest[0][1].equals(matrixTest[1][1]) & matrixTest[1][1].equals(matrixTest[2][1]) & !matrixTest[2][1].equals("-")) {
            System.out.println("WINNER");
            win = true;

        }
        if (matrixTest[0][2].equals(matrixTest[1][2]) & matrixTest[1][2].equals(matrixTest[2][2]) & !matrixTest[2][2].equals("-")) {
            System.out.println("WINNER");
            win = true;

        }
        System.out.print(win);
        return win;
    }
}
