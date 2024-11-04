package ueb5.solid.refactored;

public class RadioSkill extends AlexaSkill implements IAlexaSkill {

    @Override
    public boolean canHandleRequest(String request) {
        return request.contains("radio");
    }

    @Override
    public void handleRequest(String request) {
        String parameter = getParameter(request, "Radio", "<DefaultSender>");
        System.out.println("Ich spiele den Radiosender '" + parameter + "'.");
    }
}


