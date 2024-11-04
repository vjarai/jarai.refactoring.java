package ueb3.telefon.refactored;

public abstract class Zustand {
    private String bezeichnung;

    protected Zustand(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Zustand abheben() {
        throw new UnsupportedOperationException();
    }

    public Zustand annehmenAnruf() {
        throw new UnsupportedOperationException();
    }

    public Zustand auflegen() {
        throw new UnsupportedOperationException();
    }

    public Zustand sprechen() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return bezeichnung;
    }

    public Zustand wählen() {
        throw new UnsupportedOperationException();
    }
}










