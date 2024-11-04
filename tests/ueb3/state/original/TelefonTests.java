package ueb3.state.original;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefonTests {

    @Test
    public void kannAbhebenWählenSprechenSprechenAuflegen() {
        // Arrange

        var telefon = new  ueb3.state.original.Telefon();
        //var telefon = new  ueb3.telefon.refactored.Telefon();

        // Act
        telefon.abheben();
        telefon.wählen();
        telefon.sprechen();
        telefon.sprechen();
        telefon.auflegen();
    }

    @Test
    public void kannAuflegenWennVerbunden() {
        // Arrange
        Telefon telefon = new Telefon();

        // Act
        telefon.annehmenAnruf();
        telefon.auflegen();
    }

    @Test
    public void kannAuflegenWennAbgehoben() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.ABGEHOBEN);

        // Act
        telefon.auflegen();
    }

    @Test
    public void kannNichtSprechenWennAbgehoben() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.ABGEHOBEN);

        // Act & Assert
        assertThrows(IllegalStateException.class, telefon::sprechen);
    }

    @Test
    public void kannNichtWählenWennVerbunden() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.VERBUNDEN);

        // Act & Assert
        assertThrows(IllegalStateException.class, telefon::wählen);
    }

    @Test
    public void kannNichtAbhebenWennVerbunden() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.VERBUNDEN);

        // Act & Assert
        assertThrows(IllegalStateException.class, telefon::abheben);
    }

    @Test
    public void kannNichtAnnehmenAnrufWennVerbunden() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.VERBUNDEN);

        // Act & Assert
        assertThrows(IllegalStateException.class, telefon::annehmenAnruf);
    }

    @Test
    public void kannNichtAnnehmenAnrufWennAbgehoben() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.ABGEHOBEN);

        // Act & Assert
        assertThrows(IllegalStateException.class, telefon::annehmenAnruf);
    }

    @Test
    public void kannNichtWählenWennAufgelegt() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.AUFGELEGT);

        // Act & Assert
        assertThrows(IllegalStateException.class, telefon::wählen);
    }

    @Test
    public void kannNichtSprechenWennAufgelegt() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.AUFGELEGT);

        // Act & Assert
        assertThrows(IllegalStateException.class, telefon::sprechen);
    }

    @Test
    public void kannNichtAuflegenWennAufgelegt() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.AUFGELEGT);

        // Act & Assert
        assertThrows(IllegalStateException.class, telefon::auflegen);
    }

    @Test
    public void kannNichtAbhebenWennAbgehoben() {
        // Arrange
        Telefon telefon = new Telefon(TelefonZustand.ABGEHOBEN);

        // Act & Assert
        assertThrows(IllegalStateException.class, telefon::abheben);
    }
}


