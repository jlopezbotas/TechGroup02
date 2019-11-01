package main.java.com.model;

public class TicTacToe extends Board {

    private char[][] board;
    private char currentPlayerMark;

    public char[][] getBoard() {
        return board;
    }

    public TicTacToe() {

        this.board = new char[3][3];
        currentPlayerMark = 'x';
        Board a = new Board();
        board = a.InitializeBoard(this.board);
        a.PrintBoard(this.board);
    }

    public boolean CheckForDraw() {
        boolean IsFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    IsFull = false;
                }
            }
        }

        return IsFull;
    }

    public boolean CheckForWin() {
        return (CheckRowsForWin() || CheckColumnsForWin() || CheckDiagonalsForWin());
    }

    private boolean CheckRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (CheckRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }

        return false;
    }

    private boolean CheckColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (CheckRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }

        return false;
    }

    private boolean CheckDiagonalsForWin() {
        return ((CheckRowCol(board[0][0], board[1][1], board[2][2]) == true) ||
                (CheckRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }

    private boolean CheckRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    public void ChangePlayer() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        } else {
            currentPlayerMark = 'x';
        }
    }

    public boolean PlaceMark(int row, int col) {
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayerMark;

                    return true;
                }
            }
        }

        return false;
    }
}
