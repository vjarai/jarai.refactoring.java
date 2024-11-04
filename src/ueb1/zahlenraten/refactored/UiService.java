package ueb1.zahlenraten.refactored;

import java.util.Scanner;

public class UiService implements IUiService {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String readLine() {
        return scanner.nextLine();
    }

    @Override
    public void writeLine(String message) {
        System.out.println(message);
    }

    @Override
    public void writeInputToSmall() {
        System.out.println("Ihre Zahl ist zu klein");
    }

    @Override
    public void writeInputToBig() {
        System.out.println("Ihre Zahl ist zu groß");
    }

    @Override
    public void writeInputCorrect() {
        System.out.println("Richtig");
    }
}

