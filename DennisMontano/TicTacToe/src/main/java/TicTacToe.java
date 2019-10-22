import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;

public class TicTacToe {

    public char[][] board = {{'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}};
    public char token = 'X';

    public TicTacToe() {
        welcomeMessage();
        displayPositionsMap();
        displayBoard();
    }

    public void welcomeMessage() {
        System.out.println("Welcome to TIC-TAC-TOE.");
        System.out.println("You have to enter the code position to put the piece. Take note about code positions");
        System.out.println("Let's start it!");
    }

    public void displayBoard() {
        System.out.println(" ");
        for (char [] line : board) {
            for (char cell : line) {
                System.out.print(' ');
                System.out.print(cell);
            }
            System.out.println(' ');
        }
        System.out.println(' ');
    }

    public void displayPositionsMap() {
        System.out.println("Code positions");
        int position = 1;
        for (int line = 0; line <= 2; line++) {
            for (int column = 0; column <= 2; column++) {
                System.out.print(' ');
                System.out.print(position);
                position += 1;
            }
            System.out.println(' ');
        }
    }

    public boolean isThereAWinner() {
        return isThereAWinnerInUpLine() || isThereAWinnerInCenterLine() || isThereAWinnerInDownLine() ||
                isThereAWinnerInLeftColumn() || isThereAWinnerInCenterColumn() || isThereAWinnerInRightColumn() ||
                isThereAWinnerInLeftRightDiagonal() || isThereAWinnerInRightLeftDiagonal();
    }

    public boolean isThereAWinnerInUpLine() {
        return getToken() == board[0][0] && (getToken() == board[0][1] && (getToken() == board[0][2]));
    }

    public boolean isThereAWinnerInCenterLine() {
        return getToken() == board[1][0] && (getToken() == board[1][1] && (getToken() == board[1][2]));
    }

    public boolean isThereAWinnerInDownLine() {
        return getToken() == board[2][0] && (getToken() == board[2][1] && (getToken() == board[2][2]));
    }

    public boolean isThereAWinnerInLeftColumn() {
        return getToken() == board[0][0] && (getToken() == board[1][0] && (getToken() == board[2][0]));
    }

    public boolean isThereAWinnerInCenterColumn() {
        return getToken() == board[0][1] && (getToken() == board[1][1] && (getToken() == board[2][1]));
    }

    public boolean isThereAWinnerInRightColumn() {
        return getToken() == board[0][2] && (getToken() == board[1][2] && (getToken() == board[2][2]));
    }

    public boolean isThereAWinnerInLeftRightDiagonal() {
        return getToken() == board[0][0] && (getToken() == board[1][1] && (getToken() == board[2][2]));
    }

    public boolean isThereAWinnerInRightLeftDiagonal() {
        return getToken() == board[0][2] && (getToken() == board[1][1] && (getToken() == board[2][0]));
    }

    public boolean isGameDraw() {
        return !ArrayUtils.contains(board[0], '_') &&
                !ArrayUtils.contains(board[1], '_') &&
                !ArrayUtils.contains(board[2], '_');
    }

    public void setToken(char token) {
        this.token = token;
    }

    public char getToken() {
        return this.token;
    }

    public char changeTurn() {
        setToken(this.token == 'X' ? 'O':'X');
        return getToken();
    }

    public int enterPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time for: " + getToken() + " player");
        System.out.println("Enter a code position");
        int position = scanner.nextInt();
        char cellElement = getCellElement(position);
        while(position < 1 || position > 9 || cellElement != '_') {
            System.out.print(cellElement != '_' ? "Occupied position, " : "Code position not valid, ");
            System.out.println("please enter again.");
            System.out.println("Time for: " + getToken() + " player");
            System.out.println("Enter a code position");
            position = scanner.nextInt();
            cellElement = getCellElement(position);
        }
        return position;
    }

    public char getCellElement(int position) {
        int[] axis = getAxis(position);
        return board[axis[0]][axis[1]];
    }

    public int[] getAxis(int codePosition) {
        int[] axis = new int[]{0,0};
        switch (codePosition) {
            case 1:
                axis = new int[]{0, 0};
                break;
            case 2:
                axis = new int[]{0, 1};
                break;
            case 3:
                axis = new int[]{0, 2};
                break;
            case 4:
                axis = new int[]{1, 0};
                break;
            case 5:
                axis = new int[]{1, 1};
                break;
            case 6:
                axis = new int[]{1, 2};
                break;
            case 7:
                axis = new int[]{2, 0};
                break;
            case 8:
                axis = new int[]{2, 1};
                break;
            case 9:
                axis = new int[]{2, 2};
                break;
        }
        return axis;
    }

    public void putPiece(int place, char piece) {
        int[] axis = getAxis(place);
        board[axis[0]][axis[1]] = piece;
    }

    public static void main(String [] args) {
        TicTacToe game = new TicTacToe();
        while (!game.isThereAWinner() && !game.isGameDraw()) {
            game.changeTurn();
            int position = game.enterPosition();
            game.putPiece(position, game.getToken());
            game.displayPositionsMap();
            game.displayBoard();
        }
        System.out.println(game.isGameDraw() ? "Game draw" : "Game finished, winner: "+game.getToken());
    }
}
