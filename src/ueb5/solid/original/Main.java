package ueb5.solid.original;

public class Main {
    public static void main(String[] args) {
        var myAlexa = new Alexa();

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








