package ueb5.solid.refactored;

public class LampenSkill extends AlexaSkill implements IAlexaSkill {

    @Override
    public boolean canHandleRequest(String request) {
        return request.contains("licht");
    }

    @Override
    public void handleRequest(String request) {
        String parameter = getParameter(request, "Licht", "<DefaultLampe>");
        System.out.println("Schalte Lampe " + parameter + " ein.");
    }
}
