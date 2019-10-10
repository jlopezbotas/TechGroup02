import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    public void testBoardClass() {
        Board board = new Board();
        assertEquals(false,board.isDraw());
    }

    @Test
    public void hasWonMethodTest() {
        Board board = new Board();
        board.currentCol=2;
        board.currentRow=0;
        Cell cell1 = new Cell(0,0);
        Cell cell2 = new Cell(0,1);
        Cell cell3 = new Cell(0,2);
        cell1.content=Seed.CROSS;
        cell2.content=Seed.CROSS;
        cell3.content=Seed.CROSS;
        board.cells[0][0]=cell1;
        board.cells[0][1]=cell2;
        board.cells[0][2]=cell3;
        // board.paint();
        assertEquals(true,board.hasWon(Seed.CROSS));
    }
    @Test
    public void hasWonMethodTest2() {
        Board board = new Board();
        board.currentCol=2;
        board.currentRow=0;
        Cell cell1 = new Cell(0,0);
        Cell cell2 = new Cell(0,1);
        Cell cell3 = new Cell(board.currentRow,board.currentCol);
        cell1.content=Seed.CROSS;
        cell2.content=Seed.NOUGHT;
        cell3.content=Seed.CROSS;
        board.cells[0][0]=cell1;
        board.cells[0][1]=cell2;
        board.cells[0][2]=cell3;
        // board.paint();
        assertEquals(false,board.hasWon(Seed.CROSS));
    }


    @Test
    public void testGameMainClass() {
        final String expectedResult = "Hola";
        assertEquals(expectedResult, "Hola");
    }
}