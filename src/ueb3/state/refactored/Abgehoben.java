package ueb3.state.refactored;

public class Abgehoben extends Zustand {
    public Abgehoben() {
        super("<Hörer ist abgenommen>");
    }

    @Override
    public Zustand auflegen() {
        System.out.println("Hörer wird aufgelegt.");
        return new Aufgelegt();
    }

    @Override
    public Zustand wählen() {
        System.out.println("Rufnummer wird gewählt.");
        return new Verbunden();
    }
}
