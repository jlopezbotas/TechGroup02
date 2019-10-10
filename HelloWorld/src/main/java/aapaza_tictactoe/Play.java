
package aapaza_tictactoe;
import java.util.Scanner;

public class Play {

    Play(){


    }
    public  void welcome(){
        System.out.println("Welcome to the Game ...");
        System.out.println("You will need to enter on the following order:");
        System.out.println("y:[0-2]");
        System.out.println("x:[0-2]");

    }
    public  void startGame(){
        int postY = 0;
        int postX = 0;
        int[][] board = initializeBoard();
        Tablero table = new Tablero(board);
        table.mostrarTablero();
        String player="X";
        String player2="O";
        while (!table.tableroLleno()) {
            System.out.println("Player " + player + " introduce the coordenates");
            System.out.print("y[0-2]:");

            try {


                Scanner y = new Scanner(System.in);
                postY = y.nextInt();
                System.out.print("x[0-2]:");
                Scanner x = new Scanner(System.in);
                postX = x.nextInt();


                boolean isCorrectPoss = new Validator().goodcoordenates(postY, postX);
                boolean isFieldAvailable = new Validator().isAlreadyFilledField(table.returnBoard(), postY, postX);

                if (isCorrectPoss && !isFieldAvailable) {
                    if (player.equals("X")) {
                        player = "O";
                        table.popularTablero(postY, postX, 1);
                        table.mostrarTablero();
                    } else if (player.equals("O")) {
                        player = "X";
                        table.popularTablero(postY, postX, 2);
                        table.mostrarTablero();

                    }
                    if (table.hayGanador() == 1) {
                        System.out.println("Bravo!!!! the winner is player: X");
                        break;
                    } else if (table.hayGanador() == 2) {
                        System.out.println("Bravo!!!! the winner is player: O");
                        break;
                    }
                }
            }catch (java.util.InputMismatchException e){
              System.out.println("Ohhh..You entered wrong data");
              break;
           }
        }

    }


    private int[][] initializeBoard(){
        int[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        return  matrix;
    }

    public static void main (String[]args){
        Play play = new Play();
        play.welcome();
        play.startGame();


    }
}
