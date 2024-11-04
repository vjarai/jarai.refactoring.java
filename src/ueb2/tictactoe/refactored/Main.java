package ueb2.tictactoe.refactored;

import ueb2.tictactoe.refactored.logic.TicTacToeGame;
import ueb2.tictactoe.refactored.userinterface.ConsoleUserInterface;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame(new ConsoleUserInterface());
        game.play();
    }
}
