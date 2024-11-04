package ueb5.solid.refactored;

public class Main {
    public static void main(String[] args) {
        Alexa myAlexa = new Alexa();

        myAlexa.installSkill(new RadioSkill());
        myAlexa.installSkill(new WettervorhersageSkill());
        myAlexa.installSkill(new LampenSkill());

        // myAlexa.installSkills();

        myAlexa.handleRequest("Spiele Radio HR3");
        myAlexa.handleRequest("Wie wird das Wetter?");
        myAlexa.handleRequest("Schalte Licht Wohnzimmer ein");
        myAlexa.handleRequest("BlaBla");

        // Equivalent to Console.ReadLine() in Java
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}








