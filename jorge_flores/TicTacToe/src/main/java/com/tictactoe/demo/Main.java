package main.java.com.tictactoe.demo;
import main.java.com.tictactoe.demo.controller.TicTacToeController;
import main.java.com.tictactoe.demo.model.TicTacToe;
import main.java.com.tictactoe.demo.view.TicTacToeView;

public class Main {
    public static void main(String[] args) {
        TicTacToeView ticTacToeView = new TicTacToeView();
        TicTacToe ticTacToe = new TicTacToe();
        TicTacToeController controller = new TicTacToeController(ticTacToeView, ticTacToe);
        controller.Start();
        ticTacToeView.setVisible(true);
    }
}
