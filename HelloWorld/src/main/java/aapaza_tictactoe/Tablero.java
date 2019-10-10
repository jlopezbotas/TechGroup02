package aapaza_tictactoe;

public class Tablero {
    int matrix[][];
    public Tablero(int matrix[][]){
        this.matrix = matrix;

    }

    public  int[][] returnBoard(){
        return this.matrix;
    }
    public void mostrarTablero(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i ][j] == 1) {
                    System.out.print("[X]" );
                } else if (matrix[i ][j] == 0) {
                    System.out.print("[ ]" );
                } else if (matrix[i ][j] == 2) {
                    System.out.print("[O]" );
                }

            }
            System.out.println("" );
        }


    }
    public boolean tableroLleno(){
        boolean isFull = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    isFull = false;
                }
            }
        }

        return isFull;

    }
    public void popularTablero(int y, int x,int valueToPopulate){
        matrix[y][x] = valueToPopulate;
    }

    public int hayGanador() {
        int winner = 0;

            if (matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][2] == 1) {
                winner = 1;

            } else if (matrix[0][0] == 1 && matrix[1][0] == 1 && matrix[2][0] == 1) {
                winner = 1;


            } else if (matrix[0][1] == 1 && matrix[1][1] == 1 && matrix[2][1] == 1) {
                winner = 1;


            } else if (matrix[0][2] == 1 && matrix[1][2] == 1 && matrix[2][2] == 1) {
                winner = 1;


            } else if (matrix[1][0] == 1 && matrix[1][1] == 1 && matrix[1][2] == 1) {
                winner = 1;


            } else if (matrix[2][0] == 1 && matrix[2][1] == 1 && matrix[2][2] == 1) {
                winner = 1;


            } else if (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) {
                winner = 1;


            } else if (matrix[2][0] == 1 && matrix[1][1] == 1 && matrix[0][2] == 1) {
                winner = 1;


            }
//

            if (matrix[0][0] == 2 && matrix[0][1] == 2 && matrix[0][2] == 2) {
                winner = 2;


            } else if (matrix[0][0] == 2 && matrix[1][0] == 2 && matrix[2][0] == 2) {
                winner = 2;


            } else if (matrix[0][1] == 2 && matrix[1][1] == 2 && matrix[2][1] == 2) {
                winner = 2;


            } else if (matrix[0][2] == 2 && matrix[1][2] == 2 && matrix[2][2] == 2) {
                winner = 2;


            } else if (matrix[1][0] == 2 && matrix[1][1] == 2 && matrix[1][2] == 2) {
                winner = 2;


            } else if (matrix[2][0] == 2 && matrix[2][1] == 2 && matrix[2][2] == 2) {
                winner = 2;


            } else if (matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2) {
                winner = 2;


            } else if (matrix[2][0] == 2 && matrix[1][1] == 2 && matrix[0][2] == 2) {
                winner = 2;


            }


        return winner;
        }

}
