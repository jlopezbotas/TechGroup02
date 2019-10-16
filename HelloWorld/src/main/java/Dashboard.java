public class Dashboard {
    private Field grid[][];
    private int lineToWon;
    Dashboard() {
        this(3, 3);
    }

    Dashboard(int size, int lineToWon) {
        grid = new Field[size][size];
        this.lineToWon = lineToWon;
        initialize();
    }

    private void initialize() {
        for (int row=0; row < grid.length; row++)
        {
            for (int col=0; col < grid[row].length; col++)
            {
                grid[row][col] = new Field();
            }
        }
    }

    public boolean isEmpty() {
        return isFilledOf(false);
    }

    public boolean isFull() {
        return isFilledOf(true);
    }

    public boolean isFilledOf(Boolean emptyFull) {
        for (int row=0; row < grid.length; row++)
        {
            for (int col=0; col < grid[row].length; col++)
            {
                if ((emptyFull && grid[row][col].isEmpty()) ||
                    (!emptyFull && !grid[row][col].isEmpty()))
                    return false;
            }
        }
        return true;
    }


    public void fillField(String shape, Position position) {
        if (isValid(position)) {
            grid[position.getX()][position.getY()].setValue(shape);
        }
    }

    public String haveAWinner() {
        if (haveAWinnerRow() != null) {
            return haveAWinnerRow();
        } else if (haveAWinnerColumn() != null) {
            return haveAWinnerColumn();
        } else if (haveAWinnerDiagonal() != null) {
            return haveAWinnerDiagonal();
        }
        return null;
    }

    public boolean isValid(Position position) {
        return position.getX() <= grid.length - 1 &&
                position.getY() <= grid[0].length - 1 &&
                grid[position.getX()][position.getY()].isEmpty();
    }

    private String haveAWinnerRow() {
        int consecutive;
        String previousValue;
        for (int row = 0; row < grid.length; row++)
        {
            consecutive = 0;
            previousValue = "None";
            for (int col = 0; col < grid[row].length; col++)
            {
                if (grid[row][col].getValue() == previousValue) {
                    consecutive++;
                } else if (!grid[row][col].isEmpty()) {
                    previousValue = grid[row][col].getValue();
                    consecutive = 1 ;
                }

                if (consecutive == lineToWon)
                    return previousValue;
            }
        }
        return null;
    }

    private String haveAWinnerColumn() {
        int consecutive;
        String previousValue;
        for (int col = 0; col < grid[0].length; col++) {
            consecutive = 0;
            previousValue = "None";
            for (int row = 0; row < grid.length; row++) {
                if (grid[row][col].getValue() == previousValue) {
                    consecutive++;
                } else if (!grid[row][col].isEmpty()) {
                    previousValue = grid[row][col].getValue();
                    consecutive = 1 ;
                }

                if (consecutive == lineToWon)
                    return previousValue;
            }
        }
        return null;
    }

    private String haveAWinnerDiagonal() {
        final int ROW = grid.length;
        final int COL = grid[0].length;
        int consecutive;
        String previousValue;
        // There will be ROW+COL-1 lines in the output
        for (int line = 1; line <= (ROW + COL - 1); line++) {

            // Get column index of the first element in this
            // line of output.The index is 0 for first ROW
            // lines and line - ROW for remaining lines
            int start_col = Utils.max(0, line - ROW);

            // Get count of elements in this line. The count
            // of elements is equal to minimum of line number,
            // COL-start_col and ROW
            int count = Utils.min(line, (COL - start_col), ROW);
            consecutive = 0;
            previousValue = "None";
            // Print elements of this line
            for (int j = 0; j < count; j++) {
                if (grid[Utils.min(ROW, line) - j - 1]
                        [start_col + j].getValue() == previousValue) {
                    consecutive++;
                } else if (!grid[Utils.min(ROW, line) - j - 1]
                        [start_col + j].isEmpty()) {
                    previousValue = grid[Utils.min(ROW, line) - j - 1]
                            [start_col + j].getValue();
                    consecutive = 1 ;
                }

                if (consecutive == lineToWon)
                    return previousValue;
            }
        }
        return null;
    }
}
