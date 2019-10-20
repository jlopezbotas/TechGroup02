import controller.TicTacToeController;
import model.PlayerTTT;
import model.TableTTT;
import view.TicTacToeView;

public class MainTTT {
    public static void main(String[] args) {
        TicTacToeView ticTacToeView = new TicTacToeView();
        TableTTT tableTTT = new TableTTT();
        PlayerTTT playerTTT = new PlayerTTT();
        TicTacToeController controller = new TicTacToeController(ticTacToeView, tableTTT, playerTTT);
        controller.Start();
        ticTacToeView.setVisible(true);
    }
}