package ueb2.tictactoe.refactored.userinterface;


import ueb2.tictactoe.refactored.logic.Player;
import ueb2.tictactoe.refactored.logic.TicTacToeBoard;

public interface IUserInterface {
    int getMove(Player player);
    void showBoard(TicTacToeBoard board);
    void showMessage(String message);
}

