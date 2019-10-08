import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains Unit Tests for class TicTacToeTest operations.
 *
 * @author Franco Aldunate
 * @version 10/07/2019
 */
public class TicTacToeTest {
    private TicTacToe ticTacToe;

    /**
     * This method tests instancing of TicTacToe Class.
     */
    @Before
    public void setUp() {
        ticTacToe = new TicTacToe();
    }

    /**
     * This method tests setting start player one returns symbol 'X'.
     */
    @Test
    public void setStartPlayerOneTestReturnsSymbolX() {
        final int number = 1;
        final String actualResult = ticTacToe.setStartPlayer(number);
        final String expectedResult = "X";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests setting start player two returns symbol 'O'.
     */
    @Test
    public void setStartPlayerTwoTestReturnsSymbolO() {
        final int number = 2;
        final String actualResult = ticTacToe.setStartPlayer(number);
        final String expectedResult = "O";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests setting start player invalid value returns Default 'X'.
     */
    @Test
    public void setStartPlayerInvalidValueTestReturnsDefaultX() {
        final int number = 3;
        final String actualResult = ticTacToe.setStartPlayer(number);
        final String expectedResult = "X";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests switching player returns symbol 'O'.
     */
    @Test
    public void switchPlayerTestReturnsSymbolO() {
        ticTacToe.setStartPlayer(1);
        final String actualResult = ticTacToe.switchPlayer();
        final String expectedResult = "O";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests switching player returns symbol 'X'.
     */
    @Test
    public void switchPlayerTestReturnsSymbolX() {
        ticTacToe.setStartPlayer(2);
        final String actualResult = ticTacToe.switchPlayer();
        final String expectedResult = "X";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests making selection to available position returns 'true'.
     */
    @Test
    public void makeSelectionToAvailablePositionTestReturnsTrue() {
        final boolean actualResult = ticTacToe.makeSelection(5);
        assertTrue(actualResult);
    }

    /**
     * This method tests making selection to unavailable position returns 'false'.
     */
    @Test
    public void makeSelectionToUnavailablePositionTestReturnsFalse() {
        final String[][] board = new String[][]{{"-", "-", "-"}, {"-", "X", "-",}, {"-", "-", "-"}};
        ticTacToe = new TicTacToe(board);
        final boolean actualResult = ticTacToe.makeSelection(5);
        assertFalse(actualResult);
    }

    /**
     * This method tests making selection to invalid position zero (0)returns 'false'.
     */
    @Test
    public void makeSelectionToInvalidPositionZeroTestReturnsFalse() {
        final boolean actualResult = ticTacToe.makeSelection(0);
        assertFalse(actualResult);
    }

    /**
     * This method tests making selection to invalid position ten (10) returns 'false'.
     */
    @Test
    public void makeSelectionToInvalidPositionTenTestReturnsFalse() {
        final boolean actualResult = ticTacToe.makeSelection(10);
        assertFalse(actualResult);
    }

    /**
     * This method tests getting board position with valid value (1-9) returns array of equivalent matrix position.
     */
    @Test
    public void getBoardPositionWithValidValueTestReturnsArrayOfEquivalentMatrixPosition() {
        final int[] actualResult = ticTacToe.getBoardPosition(7);
        final int[] expectedResult = new int[]{2, 0};
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * This method tests getting board position with invalid value returns null.
     */
    @Test
    public void getBoardPositionWithInvalidValueTestReturnsNull() {
        final int[] actualResult = ticTacToe.getBoardPosition(0);
        assertNull(actualResult);
    }

    /**
     * This method tests validating if the game has a row winner returns 'true'.
     */
    @Test
    public void hasWinnerOnRowTestReturnsTrue() {
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(5);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(6);
        final boolean actualResult = ticTacToe.hasWinner();
        assertTrue(actualResult);
    }

    /**
     * This method tests validating if the game has a column winner returns 'true'.
     */
    @Test
    public void hasWinnerOnColumnTestReturnsTrue() {
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(2);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(7);
        final boolean actualResult = ticTacToe.hasWinner();
        assertTrue(actualResult);
    }

    /**
     * This method tests validating if the game has a crossed winner returns 'true'.
     */
    @Test
    public void hasWinnerOnCrossedLineTestReturnsTrue() {
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(2);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(5);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(9);
        final boolean actualResult = ticTacToe.hasWinner();
        assertTrue(actualResult);
    }

    /**
     * This method tests validating if the game has a winner returns 'false'.
     */
    @Test
    public void hasWinnerTestReturnsFalse() {
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(5);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(9);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(6);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(2);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(8);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(7);
        final boolean actualResult = ticTacToe.hasWinner();
        assertFalse(actualResult);
    }

    /**
     * This method tests validating row winner returns 'true'.
     */
    @Test
    public void hasRowWinnerTestReturnsTrue() {
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(5);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(6);
        final boolean actualResult = ticTacToe.hasRowWinner();
        assertTrue(actualResult);
    }

    /**
     * This method tests validating row winner returns 'false'.
     */
    @Test
    public void hasRowWinnerTestReturnsFalse() {
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(5);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(7);
        final boolean actualResult = ticTacToe.hasRowWinner();
        assertFalse(actualResult);
    }

    /**
     * This method tests validating column winner returns 'true'.
     */
    @Test
    public void hasColumnWinnerTestReturnsTrue() {
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(2);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(7);
        final boolean actualResult = ticTacToe.hasColumnWinner();
        assertTrue(actualResult);
    }

    /**
     * This method tests validating column winner returns 'false'.
     */
    @Test
    public void hasColumnWinnerTestReturnsFalse() {
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(2);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(8);
        final boolean actualResult = ticTacToe.hasRowWinner();
        assertFalse(actualResult);
    }

    /**
     * This method tests validating crossed winner case: left-top to right-bottom returns 'true'.
     */
    @Test
    public void hasCrossedWinnerCaseLeftTopToRightBottomTestReturnsTrue() {
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(2);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(5);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(9);
        final boolean actualResult = ticTacToe.hasCrossedWinner();
        assertTrue(actualResult);
    }

    /**
     * This method tests validating crossed winner case: left-bottom to right-top returns 'true'.
     */
    @Test
    public void hasCrossedWinnerCaseLeftBottomToRightTopTestReturnsTrue() {
        ticTacToe.makeSelection(7);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(2);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(5);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        final boolean actualResult = ticTacToe.hasCrossedWinner();
        assertTrue(actualResult);
    }

    /**
     * This method tests validating crossed winner returns 'false'.
     */
    @Test
    public void hasCrossedWinnerTestReturnsFalse() {
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(2);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(7);
        final boolean actualResult = ticTacToe.hasCrossedWinner();
        assertFalse(actualResult);
    }

    /**
     * This method tests validating game over returns 'true'.
     */
    @Test
    public void isGameOverTestReturnsTrue() {
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(2);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(4);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(6);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(5);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(7);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(8);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(9);
        final boolean actualResult = ticTacToe.isGameOver();
        assertTrue(actualResult);
    }

    /**
     * This method tests validating game over returns 'false'.
     */
    @Test
    public void isGameOverTestReturnsFalse() {
        ticTacToe.makeSelection(1);
        ticTacToe.switchPlayer();
        ticTacToe.makeSelection(3);
        final boolean actualResult = ticTacToe.isGameOver();
        assertFalse(actualResult);
    }
}
