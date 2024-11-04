package ueb3.state.original;


public class Telefon {
    private TelefonZustand aktuellerZustand;

    public Telefon() {
        this.aktuellerZustand = TelefonZustand.AUFGELEGT;
    }

    public Telefon(TelefonZustand aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }

    public void abheben() {
        switch (aktuellerZustand) {
            case AUFGELEGT:
                aktuellerZustand = TelefonZustand.ABGEHOBEN;
                break;
            case ABGEHOBEN:
            case VERBUNDEN:
                throw new IllegalStateException();
            default:
                throw new IllegalArgumentException();
        }
    }

    public void annehmenAnruf() {
        switch (aktuellerZustand) {
            case AUFGELEGT:
                aktuellerZustand = TelefonZustand.VERBUNDEN;
                break;
            case ABGEHOBEN:
            case VERBUNDEN:
                throw new IllegalStateException();
            default:
                throw new IllegalArgumentException();
        }
    }

    public void auflegen() {
        switch (aktuellerZustand) {
            case VERBUNDEN:
            case ABGEHOBEN:
                aktuellerZustand = TelefonZustand.AUFGELEGT;
                break;
            case AUFGELEGT:
                throw new IllegalStateException();
            default:
                throw new IllegalArgumentException();
        }
    }

    public void sprechen() {
        switch (aktuellerZustand) {
            case ABGEHOBEN:
            case AUFGELEGT:
                throw new IllegalStateException();
            case VERBUNDEN:
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void wählen() {
        switch (aktuellerZustand) {
            case ABGEHOBEN:
                aktuellerZustand = TelefonZustand.VERBUNDEN;
                break;
            case AUFGELEGT:
            case VERBUNDEN:
                throw new IllegalStateException();
            default:
                throw new IllegalArgumentException();
        }
    }
}

