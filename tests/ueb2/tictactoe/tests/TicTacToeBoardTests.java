package ueb2.tictactoe.tests;

import org.junit.jupiter.api.Test;
import ueb2.tictactoe.refactored.logic.Player;
import ueb2.tictactoe.refactored.logic.TicTacToeBoard;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TicTacToeBoardTests {

    @Test
    public void canNotMoveToField0() {
        // Arrange
        TicTacToeBoard board = new TicTacToeBoard();

        // Act & Assert
        assertThrows(Exception.class, () -> board.setField(0, Player.X));
    }

    @Test
    public void canNotMoveToField10() {
        // Arrange
        TicTacToeBoard board = new TicTacToeBoard();

        // Act & Assert
        assertThrows(Exception.class, () -> board.setField(10, Player.X));
    }

    @Test
    public void canNotMoveToNonemptyField() {
        // Arrange
        TicTacToeBoard board = new TicTacToeBoard();

        // Act
        board.setField(1, Player.X);

        // Assert
        assertThrows(Exception.class, () -> board.setField(1, Player.O));
    }
}
