package denis_camacho;

public class Game {
    private Player player1;
    private Player player2;
    private Table table;
    private boolean status;
    private boolean endGame;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.table = new Table();
        this.status = false;
        this.endGame = false;
    }

    public void startGame() {

        if (table.verifyWinner(player1)) {
            player1.updateFlagWinner();
            System.out.println(String.format("Player %s winner %s of 3", player1.getName(), player1.getFlagWinner()));
            table.cleaning();
        }
        if (table.fullTable()) {
            table.cleaning();
        }
        if (player1.getFlagWinner() != 2) {
            if (table.verifyWinner(player2)) {
                player2.updateFlagWinner();
                System.out.println(String.format("Player %s winner %s of 3", player1.getName(), player2.getFlagWinner()));
                table.cleaning();
            }
        }
        if (table.fullTable()) {
            table.cleaning();
        }
        if (player1.getFlagWinner() == 2) {
            System.out.println(String.format("####################################\nThe player %s is" +
                    " winner congratulation\n####################################", player1.getName()));
            endGame = true;
        }
        if (player2.getFlagWinner() == 2) {
            System.out.println(String.format("####################################\nThe player %s is" +
                    " winner congratulation\n####################################", player2.getName()));
            endGame = true;
        }
    }

    public boolean isStatus() {
        return status;
    }

    public Table getTable() {
        return table;
    }

    public boolean isEndGame() {
        return endGame;
    }

    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }
}
