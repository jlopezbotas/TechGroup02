package controller;

import model.PlayerTTT;
import model.TableTTT;
import view.TicTacToeView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController implements ActionListener {

    private TicTacToeView viewTTT;
    private TableTTT tableTTT;
    private model.PlayerTTT PlayerTTT;

    public TicTacToeController(TicTacToeView ticTacToeView, TableTTT tableTTT, PlayerTTT playerTTT) {
        this.viewTTT = ticTacToeView;
        this.tableTTT = tableTTT;
        this.PlayerTTT = playerTTT;
    }

    public void Start() {
        viewTTT.initComponents();
        viewTTT.start.addActionListener(this);
        viewTTT.oneOne.addActionListener(this);
        viewTTT.twoTwo.addActionListener(this);
        viewTTT.threeThree.addActionListener(this);
        viewTTT.fourFour.addActionListener(this);
        viewTTT.fiveFive.addActionListener(this);
        viewTTT.sixSix.addActionListener(this);
        viewTTT.sevenSeven.addActionListener(this);
        viewTTT.eightEight.addActionListener(this);
        viewTTT.nineNine.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object botton = actionEvent.getSource();
        if (viewTTT.oneOne.equals(botton)) {
            viewTTT.oneOne.setText(viewTTT.player.getText());
            PlayerTTT.setValueToOneOne(viewTTT.player.getText(), tableTTT.getTable());
        } else if (viewTTT.twoTwo.equals(botton)) {
            viewTTT.twoTwo.setText(viewTTT.player.getText());
            PlayerTTT.setValueToTwoTwo(viewTTT.player.getText(), tableTTT.getTable());
        } else if (viewTTT.threeThree.equals(botton)) {
            viewTTT.threeThree.setText(viewTTT.player.getText());
            PlayerTTT.setValueToThreeThree(viewTTT.player.getText(), tableTTT.getTable());
        } else if (viewTTT.fourFour.equals(botton)) {
            viewTTT.fourFour.setText(viewTTT.player.getText());
            PlayerTTT.setValueToFourFour(viewTTT.player.getText(), tableTTT.getTable());
        } else if (viewTTT.fiveFive.equals(botton)) {
            viewTTT.fiveFive.setText(viewTTT.player.getText());
            PlayerTTT.setValueToFiveFive(viewTTT.player.getText(), tableTTT.getTable());
        } else if (viewTTT.sixSix.equals(botton)) {
            viewTTT.sixSix.setText(viewTTT.player.getText());
            PlayerTTT.setValueToSixSix(viewTTT.player.getText(), tableTTT.getTable());
        } else if (viewTTT.sevenSeven.equals(botton)) {
            viewTTT.sevenSeven.setText(viewTTT.player.getText());
            PlayerTTT.setValueToSevenSeven(viewTTT.player.getText(), tableTTT.getTable());
        } else if (viewTTT.eightEight.equals(botton)) {
            viewTTT.eightEight.setText(viewTTT.player.getText());
            PlayerTTT.setValueToEightEight(viewTTT.player.getText(), tableTTT.getTable());
        } else if (viewTTT.nineNine.equals(botton)) {
            viewTTT.nineNine.setText(viewTTT.player.getText());
            PlayerTTT.setValueToNineNine(viewTTT.player.getText(), tableTTT.getTable());
        } else if (viewTTT.start.equals(botton)) {
            viewTTT.cleanAll();
            tableTTT.cleanAll();
        }

        if (tableTTT.verifyTicTacToe()) {
            viewTTT.popUpMessage(viewTTT.player.getText());
        } else {
            viewTTT.player.setText((viewTTT.player.getText() == "X")? "0" : "X");
        }
    }
}
