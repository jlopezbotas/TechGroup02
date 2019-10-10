public class Dashboard {
    private Field grid[][];
    Dashboard() {
        this(3);
    }

    Dashboard(int size) {
        grid = new Field[size][size];
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
        for (int row=0; row < grid.length; row++)
        {
            for (int col=0; col < grid[row].length; col++)
            {
                if(!grid[row][col].isEmpty())
                    return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for (int row=0; row < grid.length; row++)
        {
            for (int col=0; col < grid[row].length; col++)
            {
                if(grid[row][col].isEmpty())
                    return false;
            }
        }
        return true;
    }


    public void fillField(String shape, Position position) {

    }

    public boolean haveAWinner(String shape) {
        return false;
    }
}
