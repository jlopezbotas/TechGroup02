package daniel_sandoval.src;

public class Player {
    private String name;
    private char symbol;

    public Player (String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void displayInformation() {
        System.out.println("The player: "+getName()
                +"\n selected the symbol: "+getSymbol());
    }
}
