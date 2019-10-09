package test.java.com.tictactoe.demo.model;

import main.java.com.tictactoe.demo.controller.TicTacToeController;
import main.java.com.tictactoe.demo.model.TicTacToe;
import org.junit.Assert;

public class TicTacToeTest extends TicTacToe {

    private TicTacToe ticTacToe = new TicTacToe();

    @org.junit.Test
    public void testVerifyTicTacToe1() {
        String[][] table = new String[][]{{"X", "X", "X"}, {"O", "X", "O"}, {"7", "O", "O"}};
        ticTacToe.setTable(table);
        Assert.assertTrue(ticTacToe.verifyTicTacToe());
    }

    @org.junit.Test
    public void testVerifyTicTacToe2() {
        String[][] table = {{"X", "0", "X"}, {"O", "X", "O"}, {"X", "O", "O"}};
        ticTacToe.setTable(table);
        Assert.assertTrue(ticTacToe.verifyTicTacToe());
    }

    @org.junit.Test
    public void testVerifyTicTacToe3() {
        String[][] table = {{"O", "X", "X"}, {"O", "X", "O"}, {"7", "O", "X"}};
        ticTacToe.setTable(table);
        Assert.assertFalse(ticTacToe.verifyTicTacToe());
    }

    @org.junit.Test
    public void testVerifyTicTacToe4() {
        String[][] table = {{"O", "O", "O"}, {"O", "X", "X"}, {"X", "O", "O"}};
        ticTacToe.setTable(table);
        Assert.assertTrue(ticTacToe.verifyTicTacToe());
    }

    @org.junit.Test
    public void testVerifyTicTacToe5() {
        String[][] table = {{"X", "O", "X"}, {"O", "O", "O"}, {"7", "X", "O"}};
        ticTacToe.setTable(table);
        Assert.assertTrue(ticTacToe.verifyTicTacToe());
    }

    @org.junit.Test
    public void testCleanAll() {
        final String[][] table = {{"X", "X", "X"}, {"O", "X", "O"}, {"7", "O", "O"}};
        final String[][] expected = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        ticTacToe.setTable(table);
        ticTacToe.cleanAll();
        Assert.assertArrayEquals(expected, ticTacToe.getTable());
    }
}