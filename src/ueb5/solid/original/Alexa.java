package ueb5.solid.original;

public class Alexa {


    public void handleRequest(String request) {

        request = request.toLowerCase();

        if(request.contains("radio"))
            System.out.println("Ich spiele Radio.");
        else if(request.contains("licht"))
            System.out.println("Ich schalte das Licht ein.");
        else if(request.contains("wetter"))
            System.out.println("Das Wetter ist sonnig.");
        else
            System.out.println("Entschuldigung, '" + request + "' habe ich leider nicht verstanden (Fehlt ein Skill?).");

    }
}
