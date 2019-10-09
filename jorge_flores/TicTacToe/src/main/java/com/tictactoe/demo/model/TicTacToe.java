package main.java.com.tictactoe.demo.model;

public class TicTacToe {
    private String[][] table = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    public String[][] getTable() {
        return table;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }

    public boolean verifyTicTacToe()
    {
        return (BackSlash() || ForwardSlash() || Vertical() || Horizontal())? true : false;
    }

    private boolean Horizontal() {
        return ((table[0][0] == table[0][1]) && (table[0][2] == table[1][1]))? true :
                   ((table[1][0] == table[1][1]) && (table[1][2] == table[1][1]))? true :
                        ((table[2][0] == table[2][1]) && (table[2][2] == table[2][1]))? true : false;
    }

    private boolean Vertical() {
        return ((table[0][0] == table[0][1]) && (table[0][2] == table[0][1]))? true :
                    ((table[1][0] == table[1][1]) && (table[1][2] == table[1][1]))? true :
                        ((table[2][0] == table[2][1]) && (table[2][2] == table[2][1]))? true : false;
    }

    private boolean ForwardSlash() {
        return ((table[0][2] == table[1][1]) && (table[2][0] == table[1][1]))? true : false;
    }

    private boolean BackSlash() {
        return ((table[0][0] == table[1][1]) && (table[2][2] == table[1][1]))? true : false;
    }

    public void setValueToOneOne(String value) {
        table[0][0] = value;
    }

    public void setValueToTwoTwo(String value) {
        table[0][1] = value;
    }

    public void setValueToThreeThree(String value) {
        table[0][2] = value;
    }

    public void setValueToFourFour(String value) {
        table[1][0] = value;
    }

    public void setValueToFiveFive(String value) {
        table[1][1] = value;
    }

    public void setValueToSixSix(String value) {
        table[1][2] = value;
    }

    public void setValueToSevenSeven(String value) {
        table[2][0] = value;
    }

    public void setValueToEightEight(String value) {
        table[2][1] = value;
    }

    public void setValueToNineNine(String value) {
        table[2][2] = value;
    }

    public void cleanAll() {
        table = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    }
}
