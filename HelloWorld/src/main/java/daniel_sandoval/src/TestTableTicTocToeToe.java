package daniel_sandoval.src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTableTicTocToeToe {

    TableTicTocToe tableTicTocToe = new TableTicTocToe();
    @Test
    public void testIsValueInside() {
        char [][] table = new char[3][3];
        int row = 0;
        int column = 0;
        Assertions.assertTrue(tableTicTocToe.isValueInsideTable(table,row,column));
    }
    @Test
    public void testIsValueInsideNegatives() {
        char [][] table = new char[3][3];
        int row = -2;
        int column = -1;
        Assertions.assertFalse(tableTicTocToe.isValueInsideTable(table,row,column));
    }
    @Test
    public void testIsValueInsideGreaterThatTable() {
        char [][] table = new char[3][3];
        int row = 4;
        int column = 5;
        Assertions.assertFalse(tableTicTocToe.isValueInsideTable(table,row,column));
    }
    @Test
    public void testIsValueInsidePositiveAnNegative() {
        char [][] table = new char[3][3];
        int row = 2;
        int column = -6;
        Assertions.assertFalse(tableTicTocToe.isValueInsideTable(table,row,column));
    }
    @Test
    public void testIsValueInsideAcceptable() {
        char [][] table = new char[3][3];
        int row = 3;
        int column = 8;
        Assertions.assertFalse(tableTicTocToe.isValueInsideTable(table,row,column));
    }

    @Test
    public void testExistValueInThisPosition(){
        char [][] table = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        int row = 2;
        int column = 2;
        char symbol = 'X';
        Assertions.assertTrue(tableTicTocToe.existValueInThisPosition(table,row,column,symbol));
    }

    @Test
    public void testExistValueInThisPosition22(){
        char [][] table = {{'-','-','-'},{'-','-','-'},{'-','X','X'}};
        int row = 2;
        int column = 2;
        char symbol = 'X';
        Assertions.assertFalse(tableTicTocToe.existValueInThisPosition(table,row,column,symbol));
    }
    @Test
    public void testExistValueInThisPosition11(){
        char [][] table = {{'-','-','-'},{'-','O','-'},{'-','-','-'}};
        int row = 1;
        int column = 1;
        char symbol = 'O';
        Assertions.assertFalse(tableTicTocToe.existValueInThisPosition(table,row,column,symbol));
    }
    @Test
    public void testExistValueInThisPosition10(){
        char [][] table = {{'-','X','-'},{'-','-','-'},{'-','-','-'}};
        int row = 0;
        int column = 1;
        char symbol = 'X';
        Assertions.assertFalse(tableTicTocToe.existValueInThisPosition(table,row,column,symbol));
    }

    @Test
    public void testWinByRow(){
        char [][] table = {{'X','X','X'}
                          ,{'-','-','O'}
                          ,{'-','-','O'}};
        char symbol = 'X';
        Assertions.assertEquals(symbol, tableTicTocToe.winByRow(table,symbol));
    }
    @Test
    public void testWinByColumn(){
        char [][] table = {{'X','O','-'}
                          ,{'-','O','-'}
                          ,{'-','O','X'}};
        char symbol = 'O';
        Assertions.assertEquals(symbol, tableTicTocToe.winByColumn(table,symbol));
    }
    @Test
    public void testWinByDiagonal(){
        char [][] table = {{'O','X','X'}
                          ,{'-','O','-'}
                          ,{'-','-','O'}};
        char symbol = 'O';
        Assertions.assertEquals(symbol, tableTicTocToe.winByDiagonal(table,symbol));
    }
}
