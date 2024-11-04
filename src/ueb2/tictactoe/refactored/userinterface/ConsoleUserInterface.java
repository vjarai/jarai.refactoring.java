package ueb2.tictactoe.refactored.userinterface;


import ueb2.tictactoe.refactored.logic.Player;
import ueb2.tictactoe.refactored.logic.TicTacToeBoard;

import java.util.Scanner;

public class ConsoleUserInterface implements IUserInterface {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int getMove(Player player) {
        System.out.printf("What box do you want to place %s in? (1-9)%n", player);
        System.out.print("> ");
        return Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showBoard(TicTacToeBoard board) {
        System.out.println(" " + board.getFieldSymbol(0) + " | " + board.getFieldSymbol(1) + " | " + board.getFieldSymbol(2) + " ");
        System.out.println(" --------- ");
        System.out.println(" " + board.getFieldSymbol(3) + " | " + board.getFieldSymbol(4) + " | " + board.getFieldSymbol(5) + " ");
        System.out.println(" --------- ");
        System.out.println(" " + board.getFieldSymbol(6) + " | " + board.getFieldSymbol(7) + " | " + board.getFieldSymbol(8) + " ");
    }
}

