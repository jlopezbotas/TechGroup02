package jorge_flores.tic_tac_toe;

import jorge_flores.tic_tac_toe.controller.TicTacToeController;
import jorge_flores.tic_tac_toe.model.PlayerTTT;
import jorge_flores.tic_tac_toe.model.TableTTT;
import jorge_flores.tic_tac_toe.view.TicTacToeView;

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