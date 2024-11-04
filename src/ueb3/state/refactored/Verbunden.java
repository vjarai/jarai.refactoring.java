package ueb3.state.refactored;

public class Verbunden extends Zustand {
    public Verbunden() {
        super("<Verbindung ist hergestellt>");
    }

    @Override
    public Zustand auflegen() {
        System.out.println("Hörer wird aufgelegt.");
        return new Aufgelegt();
    }

    @Override
    public Zustand sprechen() {
        System.out.println("Es wird gesprochen.");
        return this;
    }
}
