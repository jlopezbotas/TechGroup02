package ticTacToeTest;

import org.junit.Before;
import org.junit.Test;
import ticTacToe.ticTacToeCode;

import static org.junit.Assert.*;

public class ticTacToeCodeTest {

    ticTacToeCode ttt;
    final int POS1 = 1;
    final int POS2 = 2;
    final int POS3 = 3;
    final int POS4 = 4;
    final int POS5 = 5;
    final int POS6 = 6;
    final int POS7 = 7;
    final int POS8 = 8;
    final int POS9 = 9;
    final char pieceX = 'X';
    final char pieceO = 'O';

    @Before
    public void setUp() throws Exception {
        ttt = new ticTacToeCode();
    }

    @Test
    public void isThereAWinnerTest() {
        ttt.putPiece(POS1, pieceX);
        ttt.putPiece(POS2, pieceX);
        ttt.putPiece(POS3, pieceX);
        assertTrue("There is a winner", ttt.isThereAWinner());
    }

    @Test
    public void isThereAWinnerInUpLineTest() {
        ttt.putPiece(POS1, pieceX);
        ttt.putPiece(POS2, pieceX);
        ttt.putPiece(POS3, pieceX);
        assertTrue("There is a winner in up line", ttt.isThereAWinnerInUpLine());
    }

    @Test
    public void isThereAWinnerInCenterLineTest() {
        ttt.putPiece(POS4, pieceX);
        ttt.putPiece(POS5, pieceX);
        ttt.putPiece(POS6, pieceX);
        assertTrue("There is a winner in center line", ttt.isThereAWinnerInCenterLine());
    }

    @Test
    public void isThereAWinnerInDownLineTest() {
        ttt.putPiece(POS7, pieceX);
        ttt.putPiece(POS8, pieceX);
        ttt.putPiece(POS9, pieceX);
        assertTrue("There is a winner in down line", ttt.isThereAWinnerInDownLine());
    }

    @Test
    public void isThereAWinnerInLeftColumnTest() {
        ttt.putPiece(POS1, pieceX);
        ttt.putPiece(POS4, pieceX);
        ttt.putPiece(POS7, pieceX);
        assertTrue("There is a winner in left column", ttt.isThereAWinnerInLeftColumn());
    }

    @Test
    public void isThereAWinnerInCenterColumnTest() {
        ttt.putPiece(POS2, pieceX);
        ttt.putPiece(POS5, pieceX);
        ttt.putPiece(POS8, pieceX);
        assertTrue("There is a winner in center column", ttt.isThereAWinnerInCenterColumn());
    }

    @Test
    public void isThereAWinnerInRightColumnTest() {
        ttt.putPiece(POS3, pieceX);
        ttt.putPiece(POS6, pieceX);
        ttt.putPiece(POS9, pieceX);
        assertTrue("There is a winner in right column", ttt.isThereAWinnerInRightColumn());
    }

    @Test
    public void isThereAWinnerInLeftRightDiagonalTest() {
        ttt.putPiece(POS1, pieceX);
        ttt.putPiece(POS5, pieceX);
        ttt.putPiece(POS9, pieceX);
        assertTrue("There is a winner in left-to-right diagonal", ttt.isThereAWinnerInLeftRightDiagonal());
    }

    @Test
    public void isThereAWinnerInRightLeftDiagonalTest() {
        ttt.putPiece(POS3, pieceX);
        ttt.putPiece(POS5, pieceX);
        ttt.putPiece(POS7, pieceX);
        assertTrue("There is a winner in right-to-left diagonal", ttt.isThereAWinnerInRightLeftDiagonal());
    }

    @Test
    public void isGameDrawTest() {
        ttt.putPiece(POS1, pieceX);
        ttt.putPiece(POS2, pieceO);
        ttt.putPiece(POS3, pieceX);
        ttt.putPiece(POS4, pieceO);
        ttt.putPiece(POS5, pieceX);
        ttt.putPiece(POS6, pieceO);
        ttt.putPiece(POS7, pieceX);
        ttt.putPiece(POS8, pieceO);
        ttt.putPiece(POS9, pieceX);
        assertTrue("Game draw", ttt.isGameDraw());
    }

    @Test
    public void changeTurnTest() {
        ttt.setToken(pieceX);
        assertEquals(pieceO, ttt.changeTurn());
    }

    @Test
    public void getCellElement() {
        ttt.putPiece(POS7, pieceX);
        assertEquals(pieceX, ttt.getCellElement(POS7));
    }

    @Test
    public void getAxis() {
        int[] expectedAxis = new int[]{0, 2};
        assertArrayEquals(expectedAxis, ttt.getAxis(POS3));
    }
}