package view;

import javax.swing.*;
import java.awt.*;

public class TicTacToeView {
    public JFrame frame = new JFrame("Tic Tac Toe");

    public javax.swing.JLabel player;
    public javax.swing.JButton start;
    public javax.swing.JButton oneOne;
    public javax.swing.JButton twoTwo;
    public javax.swing.JButton threeThree;
    public javax.swing.JButton fourFour;
    public javax.swing.JButton fiveFive;
    public javax.swing.JButton sixSix;
    public javax.swing.JButton sevenSeven;
    public javax.swing.JButton eightEight;
    public javax.swing.JButton nineNine;

    public void initComponents() {
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,3,5,10));
        JLabel status = new JLabel("Player  >  >  >");
        player = new JLabel();
        player.setText("X");
        start = new JButton("Clean");
        oneOne = new JButton("-");
        oneOne.setVerticalTextPosition(0);
        oneOne.setHorizontalTextPosition(0);
        twoTwo = new JButton("-");
        twoTwo.setVerticalTextPosition(0);
        twoTwo.setHorizontalTextPosition(1);
        threeThree = new JButton("-");
        threeThree.setVerticalTextPosition(0);
        threeThree.setHorizontalTextPosition(2);
        fourFour = new JButton("-");
        fourFour.setVerticalTextPosition(1);
        fourFour.setHorizontalTextPosition(0);
        fiveFive = new JButton("-");
        fiveFive.setVerticalTextPosition(1);
        fiveFive.setHorizontalTextPosition(1);
        sixSix = new JButton("-");
        sixSix.setVerticalTextPosition(1);
        sixSix.setHorizontalTextPosition(2);
        sevenSeven = new JButton("-");
        sevenSeven.setVerticalTextPosition(2);
        sevenSeven.setHorizontalTextPosition(0);
        eightEight = new JButton("-");
        eightEight.setVerticalTextPosition(2);
        eightEight.setHorizontalTextPosition(1);
        nineNine = new JButton("-");
        nineNine.setVerticalTextPosition(2);
        nineNine.setHorizontalTextPosition(2);
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.add(status);
        panel.add(player);
        panel.add(start);
        panel.add(oneOne);
        panel.add(twoTwo);
        panel.add(threeThree);
        panel.add(fourFour);
        panel.add(fiveFive);
        panel.add(sixSix);
        panel.add(sevenSeven);
        panel.add(eightEight);
        panel.add(nineNine);
        frame.add(panel);
    }

    public void setVisible(boolean isVisible) {
        frame.setVisible(isVisible);
    }

    public void popUpMessage(String winner) {
        JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, "Completed Game, the winner is "+ winner, "Information",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void cleanAll() {
        player.setText("X");
        oneOne.setText("-");
        twoTwo.setText("-");
        threeThree.setText("-");
        fourFour.setText("-");
        fiveFive.setText("-");
        sixSix.setText("-");
        sevenSeven.setText("-");
        eightEight.setText("-");
        nineNine.setText("-");
    }
}