package ueb2.tictactoe.refactored.logic;

import java.util.Arrays;

public class TicTacToeBoard {
    private final Player[] fields = new Player[9];

    private final int[][] winningCombinations = {
            // Horizontal
            { 0, 1, 2 },
            { 3, 4, 5 },
            { 6, 7, 8 },

            // Vertical
            { 0, 3, 6 },
            { 1, 4, 7 },
            { 2, 5, 8 },

            // Diagonal
            { 0, 4, 8 },
            { 2, 4, 6 }
    };

    public TicTacToeBoard() {
        reset();
    }

    public void reset() {
        Arrays.fill(fields, Player.None);
    }

    public char getFieldSymbol(int fieldNumber) {
        return " XO".charAt(fields[fieldNumber].ordinal());
    }

    public boolean hasPlayerWon(Player player) {
        for (int[] combination : winningCombinations) {
            if (Arrays.stream(combination).allMatch(x -> fields[x] == player)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFieldEmpty(int fieldNumber) {
        return fields[fieldNumber - 1] == Player.None;
    }

    public void setField(int fieldNumber, Player player) {
        if (!isFieldNumberValid(fieldNumber)) {
            throw new IllegalArgumentException("Wrong selection entered!\nPress any key to try again..");
        }

        if (!isFieldEmpty(fieldNumber)) {
            throw new IllegalArgumentException("Error: box not vacant!\nPress any key to try again..");
        }

        fields[fieldNumber - 1] = player;
    }

    public boolean isFieldNumberValid(int fieldNumber) {
        return fieldNumber >= 1 && fieldNumber <= fields.length;
    }


}

