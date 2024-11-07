package ueb2.tictactoe.tests;

import ueb2.tictactoe.refactored.logic.Player;
import ueb2.tictactoe.refactored.logic.TicTacToeBoard;
import ueb2.tictactoe.refactored.userinterface.IUserInterface;

import java.util.ArrayList;
import java.util.List;

public class FakeUserInterface implements IUserInterface {
    private int readLineBufferIndex = 0;
    private int[] readLineBuffer;
    private List<String> writeLineBuffer = new ArrayList<>();

    public int[] getReadLineBuffer() {
        return readLineBuffer;
    }

    public void setReadLineBuffer(int[] readLineBuffer) {
        this.readLineBuffer = readLineBuffer;
    }

    public List<String> getWriteLineBuffer() {
        return writeLineBuffer;
    }

    @Override
    public int getMove(Player player) {
        return readLineBuffer[readLineBufferIndex++];
    }

    @Override
    public void showBoard(TicTacToeBoard board) {
    }

    @Override
    public void showMessage(String message) {
        writeLineBuffer.add(message);
    }
}

