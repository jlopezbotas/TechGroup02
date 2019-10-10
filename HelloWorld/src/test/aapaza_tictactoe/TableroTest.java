package aapaza_tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

public class TableroTest {

    @Test
    public  void VerifyIfTableroIsFull(){
        int[][] matrix = {
                {1, 2, 1},
                {2, 1, 1},
                {1, 2, 1}};
        boolean isFullTablero=new Tablero(matrix).tableroLleno();
        assertTrue(isFullTablero);
    }
    @Test
    public  void VerifyIfTableroIsNotFull(){
        int[][] matrix = {
                {1, 2, 0},
                {2, 1, 0},
                {1, 2, 1}};
        boolean isFullTablero=new Tablero(matrix).tableroLleno();
        assertFalse(isFullTablero);
    }
    @Test
    public  void VerifyIfThereIsWinner(){
        int[][] matrix = {
                {1, 2, 0},
                {2, 1, 0},
                {1, 2, 1}};
        int isFullTablero=new Tablero(matrix).hayGanador();
        assertEquals(isFullTablero,1);
    }
    @Test
    public  void VerifyIfThereIsNoWinner(){
        int[][] matrix = {
                {1, 2, 0},
                {2, 0, 0},
                {1, 2, 1}};
        int isFullTablero=new Tablero(matrix).hayGanador();
        assertEquals(isFullTablero,0);
    }

}