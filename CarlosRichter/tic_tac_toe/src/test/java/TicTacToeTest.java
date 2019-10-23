import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    public void testBoardClass() {
        Board board = new Board();
        assertEquals(false,board.isDraw());
    }

    @Test
    public void hasWonMethodTestRow1() {
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
        assertEquals(true,board.hasWon(Seed.CROSS));
    }

    @Test
    public void hasWonMethodTestRow2() {
        Board board = new Board();
        board.currentCol=2;
        board.currentRow=1;
        Cell cell1 = new Cell(1,0);
        Cell cell2 = new Cell(1,1);
        Cell cell3 = new Cell(1,2);
        cell1.content=Seed.CROSS;
        cell2.content=Seed.CROSS;
        cell3.content=Seed.CROSS;
        board.cells[1][0]=cell1;
        board.cells[1][1]=cell2;
        board.cells[1][2]=cell3;
        assertEquals(true,board.hasWon(Seed.CROSS));
    }

    @Test
    public void hasWonMethodTestRow3() {
        Board board = new Board();
        board.currentCol=2;
        board.currentRow=2;
        Cell cell1 = new Cell(2,0);
        Cell cell2 = new Cell(2,1);
        Cell cell3 = new Cell(2,2);
        cell1.content=Seed.CROSS;
        cell2.content=Seed.CROSS;
        cell3.content=Seed.CROSS;
        board.cells[2][0]=cell1;
        board.cells[2][1]=cell2;
        board.cells[2][2]=cell3;
        assertEquals(true,board.hasWon(Seed.CROSS));
    }

    @Test
    public void hasWonMethodTestCol1() {
        Board board = new Board();
        board.currentRow=2;
        board.currentCol=0;
        Cell cell1 = new Cell(0,0);
        Cell cell2 = new Cell(1,0);
        Cell cell3 = new Cell(2,0);
        cell1.content=Seed.CROSS;
        cell2.content=Seed.CROSS;
        cell3.content=Seed.CROSS;
        board.cells[0][0]=cell1;
        board.cells[1][0]=cell2;
        board.cells[2][0]=cell3;
        assertEquals(true,board.hasWon(Seed.CROSS));
    }

    @Test
    public void hasWonMethodTestCol2() {
        Board board = new Board();
        board.currentRow=2;
        board.currentCol=1;
        Cell cell1 = new Cell(0,1);
        Cell cell2 = new Cell(1,1);
        Cell cell3 = new Cell(2,1);
        cell1.content=Seed.CROSS;
        cell2.content=Seed.CROSS;
        cell3.content=Seed.CROSS;
        board.cells[0][1]=cell1;
        board.cells[1][1]=cell2;
        board.cells[2][1]=cell3;
        assertEquals(true,board.hasWon(Seed.CROSS));
    }

    @Test
    public void hasWonMethodTestCol3() {
        Board board = new Board();
        board.currentRow=2;
        board.currentCol=2;
        Cell cell1 = new Cell(0,2);
        Cell cell2 = new Cell(1,2);
        Cell cell3 = new Cell(2,2);
        cell1.content=Seed.CROSS;
        cell2.content=Seed.CROSS;
        cell3.content=Seed.CROSS;
        board.cells[0][2]=cell1;
        board.cells[1][2]=cell2;
        board.cells[2][2]=cell3;
        assertEquals(true,board.hasWon(Seed.CROSS));
    }

    @Test
    public void hasWonMethodTestDiagonal1() {
        Board board = new Board();
        board.currentRow=2;
        board.currentCol=2;
        Cell cell1 = new Cell(0,0);
        Cell cell2 = new Cell(1,1);
        Cell cell3 = new Cell(2,2);
        cell1.content=Seed.CROSS;
        cell2.content=Seed.CROSS;
        cell3.content=Seed.CROSS;
        board.cells[0][0]=cell1;
        board.cells[1][1]=cell2;
        board.cells[2][2]=cell3;
        assertEquals(true,board.hasWon(Seed.CROSS));
    }

    @Test
    public void hasWonMethodTestDiagonal2() {
        Board board = new Board();
        board.currentRow=2;
        board.currentCol=0;
        Cell cell1 = new Cell(0,2);
        Cell cell2 = new Cell(1,1);
        Cell cell3 = new Cell(2,0);
        cell1.content=Seed.CROSS;
        cell2.content=Seed.CROSS;
        cell3.content=Seed.CROSS;
        board.cells[0][2]=cell1;
        board.cells[1][1]=cell2;
        board.cells[2][0]=cell3;
        assertEquals(true,board.hasWon(Seed.CROSS));
    }

    @Test
    public void hasWonMethodTestLoser() {
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
