package ueb2.tictactoe.refactored.logic;


import ueb2.tictactoe.refactored.userinterface.IUserInterface;

public class TicTacToeGame {
    private final TicTacToeBoard board;
    private final IUserInterface userInterface;
    private Player currentPlayer = Player.X;

    public TicTacToeGame(IUserInterface ui) {
        this.userInterface = ui;
        this.board = new TicTacToeBoard();
    }

    public void play() {

        int moveCount = 0;

        while (true) {
            userInterface.showBoard(board);

            int move = userInterface.getMove(currentPlayer);

            try {
                board.setField(move, currentPlayer);
            } catch (Exception e) {
                userInterface.showMessage(e.getMessage());
                continue;
            }

            moveCount++;

            if (board.hasPlayerWon(currentPlayer)) {
                userInterface.showMessage("The winner is " + currentPlayer + "!");
                break;
            }

            if (moveCount >= 9) {
                userInterface.showMessage("No one won.");
                break;
            }

            currentPlayer = (currentPlayer == Player.O) ? Player.X : Player.O;
        }
    }
}

