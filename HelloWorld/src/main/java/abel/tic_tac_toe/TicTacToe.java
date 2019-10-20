package abel.tic_tac_toe;

import java.util.Scanner;

public class TicTacToe {

    private static String[][] matrix = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    private static Boolean win = false;

    public static void main(String[] args) {
        String playerX = "X";
        String playerY = "Y";
        String turn = "X";
        int cont = 0;
        imp(matrix);
        while (!win) {
            if (turn.equals("X")) {
                setValue(playerX);
                turn = "Y";
            } else {
                setValue(playerY);
                turn = "X";
            }
            if (cont == 8) {
                System.out.print("finished");
                break;

            } else cont++;

            imp(matrix);
            win = validator(matrix);

            if (win) {
                System.out.println("YOU WINNER PLAYER " + turn);
            }
        }
    }

    private static void setValue(String player) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Turn of player : " + player);
        Boolean fly = true;
        int row = 0;
        int column = 0;
        while (fly) {
            System.out.println("Add Row (0,1,2)" );
            row = reader.nextInt();
            System.out.println("Add Column (0,1,2)");
            column = reader.nextInt();
            fly = validateDataExistence(row, column);
            if (fly) {
            }
            System.out.println("Please select an other position !! ");


        }
        matrix[row][column] = player;

    }

    private static void imp(String[][] matrixPrint) {
        for (String[] strings : matrixPrint) {
            System.out.print("|");
            int y = 0;
            while (y < strings.length) {
                System.out.print(strings[y]);
                if (y != strings.length - 1) System.out.print("\t");
                y++;
            }
            System.out.println("|");
        }
    }


    static boolean validator(String[][] matrixTest) {
        boolean ifWinner = false;
        if (matrixTest[1][1].equals(matrixTest[2][2]) & matrixTest[2][2].equals(matrixTest[0][0]) & !matrixTest[0][0].equals("-")) {
            ifWinner = true;
        }
        if (matrixTest[0][2].equals(matrixTest[1][1]) & matrixTest[1][1].equals(matrixTest[2][0]) & !matrixTest[2][0].equals("-")) {
            ifWinner = true;

        }
        if (matrixTest[0][0].equals(matrixTest[0][1]) & matrixTest[0][1].equals(matrixTest[0][2]) & !matrixTest[0][2].equals("-")) {
            ifWinner = true;

        }
        if (matrixTest[1][0].equals(matrixTest[1][1]) & matrixTest[1][1].equals(matrixTest[1][2]) & !matrixTest[1][2].equals("-")) {
            ifWinner = true;

        }
        if (matrixTest[2][0].equals(matrixTest[2][1]) & matrixTest[2][1].equals(matrixTest[2][2]) & !matrixTest[2][2].equals("-")) {
            ifWinner = true;

        }
        if (matrixTest[0][0].equals(matrixTest[1][0]) & matrixTest[1][0].equals(matrixTest[2][0]) & !matrixTest[2][0].equals("-")) {
            ifWinner = true;

        }
        if (matrixTest[0][1].equals(matrixTest[1][1]) & matrixTest[1][1].equals(matrixTest[2][1]) & !matrixTest[2][1].equals("-")) {
            ifWinner = true;

        }
        if (matrixTest[0][2].equals(matrixTest[1][2]) & matrixTest[1][2].equals(matrixTest[2][2]) & !matrixTest[2][2].equals("-")) {
            ifWinner = true;
        }
        return ifWinner;
    }

    private static Boolean validateDataExistence(int row, int column) {
        boolean exist;
        exist = matrix[row][column].equals("X") || matrix[row][column].equals("Y");
        return exist;

    }
}
