package ueb1.zahlenraten.refactored;

public class Main {
    public static void main(String[] args) {
        IUiService uiService = new UiService();
        ZahlenratenGame game = new ZahlenratenGame(uiService, null);
        game.play();
    }
}
