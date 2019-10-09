package daniel_sandoval.src;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class TableTicTocToe {

    /**
     * Fill table with symbol empty "-"
     * @param table table tic toc
     * @param symbolEmpty character -
     */
    public void fillBoard(char[][] table, char symbolEmpty) {
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[0].length; column++) {
                table[row][column] = symbolEmpty;
            }
        }
    }

    /**
     * Show table with elements inside
     * @param table table tic toc
     */
    public void showTable(char[][] table) {
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[0].length; column++) {
                System.out.print(table[row][column]);
            }
            System.out.println();
        }
    }

    /**
     * Verify if value of row and column is inside of the table.
     * @param table table tic toc
     * @param row table row
     * @param column table column
     * @return boolean
     */
    public boolean isValueInsideTable(char[][] table, int row, int column) {
        return row >= 0 && row < table.length && column >= 0 && column < table.length;
    }

    /**
     * Verify if the value in one position if different to -
     * @param table table tic toc
     * @param row table row
     * @param column table column
     * @param symbolEmpty character -
     * @return boolean
     */
    public boolean existValueInThisPosition(char[][] table, int row, int column, char symbolEmpty) {
        return (table[row][column] != symbolEmpty);
    }

    /**
     * Insert element in determinate position
     * @param table table tic toc
     * @param row table row
     * @param column table column
     * @param symbol character
     */
    public void insertValue(char[][] table, int row, int column, char symbol) {
        table[row][column] = symbol;
    }

    /**
     * Finish the game
     * @param table table tic toc
     * @param symbol symbol
     * @return boolean
     */
    public boolean finishGame(char[][] table, char symbol) {
        return (matrizLlena(table,symbol)||
                winByRow(table,symbol) != symbol ||
                winByColumn(table,symbol) != symbol ||
                winByDiagonal(table,symbol) != symbol );
    }

    /**
     * Win by row
     * @param table table tic toc
     * @param symbol
     * @return char winner
     */
    public char winByRow(char[][] table, char symbol) {
        char tableSymbol;
        boolean foundElement;
        for (int row = 0; row < table.length ; row++) {
            foundElement = true;
            tableSymbol = table[row][0];
            if (symbol != tableSymbol) {
                for (int column = 1; column < table[0].length ; column++) {
                    if (tableSymbol != table[row][column]){
                        foundElement= false;
                    }
                }
                if (foundElement){
                    return tableSymbol;
                }
            }
        }
        return symbol;
    }

    /**
     * win by column
     * @param table table tic toc
     * @param symbol
     * @return char winner
     */
    public char winByColumn(char[][] table, char symbol) {
        char tableSymbol;
        boolean foundElement;
        for (int row = 0; row < table.length ; row++) {
            foundElement = true;
            tableSymbol = table[0][row];
            if (symbol != tableSymbol) {
                for (int column = 1; column < table[0].length ; column++) {
                    if (tableSymbol != table[column][row]){
                        foundElement= false;
                    }
                }
                if (foundElement){
                    return tableSymbol;
                }
            }
        }
        return symbol;
    }

    /**
     * Win by diagonal
     * @param table table tic toc
     * @param symbol
     * @return char winner
     */
    public char winByDiagonal(char[][] table, char symbol) {
        char tableSymbol;
        boolean foundElement = true;
        tableSymbol = table[0][0];
        if (table[0][0] != symbol) {
            for (int row = 0; row < table.length; row++) {
                if (tableSymbol != table[row][row]){
                    foundElement = false;
                }
            }
            if(foundElement){
                return tableSymbol;
            }
        }
        tableSymbol = table[0][2];
        if (table[0][0] != symbol) {
            for (int row = 1, column = 1; row < table.length; row++, column--) {
                if (tableSymbol != table[row][column]){
                    foundElement = false;
                }
            }
            if(foundElement){
                return tableSymbol;
            }
        }
        return symbol;
    }

    /**
     * Table tic toc full
     * @param table table tic toc
     * @param symbol
     * @return boolean
     */
    public boolean matrizLlena(char[][] table, char symbol){
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[0].length; column++) {
                if(table[row][column] == symbol){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Show player winner
     * @param table table tic toc
     * @param player1
     * @param symbol
     */
    public void showWin(char[][] table, char symbolPlayer1, char symbol, String player1, String player2){
        char symbolTableR = winByRow(table,symbol);
        if (symbolTableR != symbol){
            if(symbolTableR == symbolPlayer1){
                System.out.println("The player "+player1+" won by row");
            }
            else {
                System.out.println("The player "+player2+" won by row");
            }
        }
        char symbolTableC = winByColumn(table,symbol);
        if (symbolTableC != symbol){
            if(symbolTableC == symbolPlayer1){
                System.out.println("The player "+player1+" won by column");
            }
            else {
                System.out.println("The player "+player2+" won by column");
            }
        }
        char symbolTableD = winByDiagonal(table,symbol);
        if (symbolTableD != symbol){
            if(symbolTableD == symbolPlayer1){
                System.out.println("The player "+player1+" won by diagonal");
            }
            else {
                System.out.println("The player "+player2+" won by diagonal");
            }
        }
    }

    /**
     * Show turn actual
     * @param turn table tic toc
     * @param player1
     * @param player2
     */
    public void showTurnActual(boolean turn, String player1, String player2) {
        if ((turn)) {
            System.out.println("it's player's turn " + player1);
        } else {
            System.out.println("it's player's turn " + player2);
        }
    }
}
