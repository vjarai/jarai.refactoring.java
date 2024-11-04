package ueb3.telefon.refactored;

public class Aufgelegt extends Zustand {
    public Aufgelegt() {
        super("<Hörer ist aufgelegt>");
    }

    @Override
    public Zustand abheben() {
        System.out.println("Hörer wird abgehoben.");
        return new Abgehoben();
    }

    @Override
    public Zustand annehmenAnruf() {
        System.out.println("Anruf wird angenommen.");
        return new Verbunden();
    }
}
