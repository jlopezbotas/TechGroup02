package denis_camacho;

public class Table {
    private String[][] table;

    public Table() {
        table = new String[3][3];
        cleaning();
    }

    public void insert(Player player, int row, int column) {
        table[row][column] = String.format("%s", player.getChip());
    }

    public void cleaning() {
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                table[row][column] = "";
            }
        }
    }

    public boolean verifyField(int f, int c) {
        return table[f][c].equals("");
    }

    public boolean fullTable() {
        for (String[] row : table) {
            for (String column : row) {
                if (column.equals(""))
                    return false;
            }
        }
        return true;
    }

    public boolean selectFieldFile(Player player, int postRow, int postColumn) {

        if (verifyField(postColumn, postRow)) {
            insert(player, postColumn, postRow);
            return true;
        } else {
            System.out.println(String.format("The field not empty %s please choose another", player.getName()));
            return false;
        }
    }

    public boolean verifyWinner(Player player) {
        String chip1 = player.getChip();
        String chip2 = chip1 + chip1 + chip1;
        String rows = "";
        String columns = "";
        String diagonals = "";

        for (String[] row : table) {
            for (String column : row) {
                rows += column;
            }
            if (chip2.equals(rows)) {
                return true;
            }
        }
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                columns += table[column][row];
            }
            if (chip2.equals(columns)) {
                return true;
            }
        }

        for (int row = 0; row < table.length; row++) {
            diagonals += table[row][row];
        }
        if (chip2.equals(diagonals)) {
            return true;
        }
        diagonals = "";
        for (int row = 0; row < table.length; row++) {
            diagonals += table[table.length - row][row];
        }
        if (chip2.equals(diagonals)) {
            return true;
        }
        return false;
    }

    public String[][] getTable() {
        return table;
    }
}
