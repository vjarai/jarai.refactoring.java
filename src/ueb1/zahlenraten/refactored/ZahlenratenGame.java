package ueb1.zahlenraten.refactored;

import java.util.Random;

public class ZahlenratenGame {
    private int geheimzahl;
    private IUiService uiService;

    public ZahlenratenGame(IUiService uiService, Integer geheimzahl) {
        this.uiService = uiService;
        this.geheimzahl = (geheimzahl != null) ? geheimzahl : new Random().nextInt(100) + 1;
    }

    public void play() {
        int anzahlVersuche = 0;
        int eingabezahl;

        do {
            uiService.writeLine(anzahlVersuche == 0 ? "Errate eine Zahl zwischen 1 und 100" : "Bitte Versuchen sie es erneut");

            eingabezahl = Integer.parseInt(uiService.readLine());

            prozessInput(eingabezahl);

            anzahlVersuche++;

        } while (eingabezahl != geheimzahl);

        uiService.writeLine("du hast " + (anzahlVersuche - 1) + " Versuche gebraucht");
        uiService.readLine();
    }

    public void prozessInput(int eingabezahl) {
        if (eingabezahl < geheimzahl) {
            uiService.writeInputToSmall();
        } else if (eingabezahl > geheimzahl) {
            uiService.writeInputToBig();
        } else {
            uiService.writeInputCorrect();
        }
    }
}

