package ueb3.state.refactored;


public class Telefon {
    private Zustand aktuellerZustand;

    public Telefon() {
        aktuellerZustand = new Aufgelegt();
    }

    public Telefon(Zustand zustand) {
        aktuellerZustand = zustand;
    }

    public void abheben() {
        aktuellerZustand = aktuellerZustand.abheben();
    }

    public void annehmenAnruf() {
        aktuellerZustand = aktuellerZustand.annehmenAnruf();
    }

    public void auflegen() {
        aktuellerZustand = aktuellerZustand.auflegen();
    }

    public void sprechen() {
        aktuellerZustand = aktuellerZustand.sprechen();
    }

    public void wählen() {
        aktuellerZustand = aktuellerZustand.wählen();
    }
}
