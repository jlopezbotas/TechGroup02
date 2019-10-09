package main.java.com.tictactoe.demo.controller;

import main.java.com.tictactoe.demo.model.TicTacToe;
import main.java.com.tictactoe.demo.view.TicTacToeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController implements ActionListener {

    private TicTacToeView view;
    private TicTacToe ticTacToe;

    public TicTacToeController(TicTacToeView ticTacToeView, TicTacToe ticTacToe) {
        this.view = ticTacToeView;
        this.ticTacToe = ticTacToe;
    }

    public void Start() {
        view.initComponents();
        view.start.addActionListener(this);
        view.oneOne.addActionListener(this);
        view.twoTwo.addActionListener(this);
        view.threeThree.addActionListener(this);
        view.fourFour.addActionListener(this);
        view.fiveFive.addActionListener(this);
        view.sixSix.addActionListener(this);
        view.sevenSeven.addActionListener(this);
        view.eightEight.addActionListener(this);
        view.nineNine.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object botton = actionEvent.getSource();
            if (view.oneOne.equals(botton)) {
                view.oneOne.setText(view.player.getText());
                ticTacToe.setValueToOneOne(view.player.getText());
            } else if (view.twoTwo.equals(botton)) {
                view.twoTwo.setText(view.player.getText());
                ticTacToe.setValueToTwoTwo(view.player.getText());
            } else if (view.threeThree.equals(botton)) {
                view.threeThree.setText(view.player.getText());
                ticTacToe.setValueToThreeThree(view.player.getText());
            } else if (view.fourFour.equals(botton)) {
                view.fourFour.setText(view.player.getText());
                ticTacToe.setValueToFourFour(view.player.getText());
            } else if (view.fiveFive.equals(botton)) {
                view.fiveFive.setText(view.player.getText());
                ticTacToe.setValueToFiveFive(view.player.getText());
            } else if (view.sixSix.equals(botton)) {
                view.sixSix.setText(view.player.getText());
                ticTacToe.setValueToSixSix(view.player.getText());
            } else if (view.sevenSeven.equals(botton)) {
                view.sevenSeven.setText(view.player.getText());
                ticTacToe.setValueToSevenSeven(view.player.getText());
            } else if (view.eightEight.equals(botton)) {
                view.eightEight.setText(view.player.getText());
                ticTacToe.setValueToEightEight(view.player.getText());
            } else if (view.nineNine.equals(botton)) {
                view.nineNine.setText(view.player.getText());
                ticTacToe.setValueToNineNine(view.player.getText());
            } else if (view.start.equals(botton)) {
                view.cleanAll();
                ticTacToe.cleanAll();
            }

            if (ticTacToe.verifyTicTacToe()) {
                view.popUpMessage(view.player.getText());
            } else {
                view.player.setText((view.player.getText() == "X")? "0" : "X");
            }
        }
}
