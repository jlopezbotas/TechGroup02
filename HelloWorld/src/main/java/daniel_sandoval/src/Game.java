package daniel_sandoval.src;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        char[][] table = new char[3][3];
        char symbolEmpty = '-';
        int row, column;
        boolean validPosition, flag;
        boolean startGame = true;
        Scanner inputVariable = new Scanner(System.in);
        System.out.println("Write the name of the two players: ");
        String player1 = inputVariable.nextLine();
        String player2 = inputVariable.nextLine();
        System.out.println("Selected a symbol for two players example: 'X' o 'O' ");
        char symbolPlayer1 = inputVariable.next().charAt(0);
        Player playerOne = new Player(player1, symbolPlayer1);
        char symbolPlayer2 = inputVariable.next().charAt(0);
        Player playerTwo = new Player(player2, symbolPlayer2);
        playerOne.displayInformation();
        playerTwo.displayInformation();
        System.out.println("--------------- Start Game ------------");
        TableTicTocToe tableTicTocToe = new TableTicTocToe();
        tableTicTocToe.fillBoard(table,symbolEmpty);

        while (!tableTicTocToe.finishGame(table, symbolEmpty)) {
            tableTicTocToe.showTurnActual(startGame, player1, player2);
            tableTicTocToe.showTable(table);
            do {
                flag=false;
                System.out.print("Insert the row: ");
                row = inputVariable.nextInt();
                System.out.print("Insert the column: ");
                column = inputVariable.nextInt();
                validPosition = tableTicTocToe.isValueInsideTable(table, row, column);
                if(validPosition){
                    if(!tableTicTocToe.existValueInThisPosition(table, row, column, symbolEmpty)){
                        flag = true;
                }else {
                    System.out.println("That position is already marked select another position");
                }
                }else {
                    System.out.println("The position does not exist is a 3x3 matrix");
                }
            }
            while (!flag);

            if(startGame){
                tableTicTocToe.insertValue(table,row, column, playerOne.getSymbol());
            }else{
                tableTicTocToe.insertValue(table,row, column, playerTwo.getSymbol());
            }
            startGame=!startGame;
        }
        tableTicTocToe.showTable(table);
        tableTicTocToe.showWin(table,playerOne.getSymbol(),symbolEmpty, player1,player2);
    }
}
