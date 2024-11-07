package ueb2.tictactoe.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import ueb2.tictactoe.refactored.logic.TicTacToeGame;

public class TicTacToeGameTests {

    @Test
    public void playerXCanWin() {
        // Arrange
        FakeUserInterface userInterface = new FakeUserInterface();
        userInterface.setReadLineBuffer(new int[]{0, 1, 4, 2, 5, 3});

        TicTacToeGame game = new TicTacToeGame(userInterface);

        // Act
        game.play();

        // Assert
        assertEquals("The winner is X!", userInterface.getWriteLineBuffer().get(userInterface.getWriteLineBuffer().size() - 1));
    }

    @Test
    public void playerYCanWin() {
        // Arrange
        FakeUserInterface userInterface = new FakeUserInterface();
        userInterface.setReadLineBuffer(new int[]{1, 4, 2, 5, 9, 6});

        TicTacToeGame game = new TicTacToeGame(userInterface);

        // Act
        game.play();

        // Assert
        assertEquals("The winner is O!", userInterface.getWriteLineBuffer().get(userInterface.getWriteLineBuffer().size() - 1));
    }

    @Test
    public void noPlayerCanWin() {
        // Arrange
        FakeUserInterface userInterface = new FakeUserInterface();
        userInterface.setReadLineBuffer(new int[]{1, 4, 2, 5, 6, 3, 9, 8, 7, -1});

        TicTacToeGame game = new TicTacToeGame(userInterface);

        // Act
        game.play();

        // Assert
        assertTrue(userInterface.getWriteLineBuffer().contains("No one won."));
    }
}
