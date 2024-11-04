package ueb5.solid.refactored;

import java.util.ArrayList;
import java.util.List;

public class Alexa {
    private List<IAlexaSkill> installedSkills = new ArrayList<>() {
    };

    public void installSkills() {
        installSkill(new WettervorhersageSkill());
        installSkill(new RadioSkill());
        installSkill(new LampenSkill());
    }

    public void installSkill(IAlexaSkill newSkill) {
        installedSkills.add(newSkill);
    }

    public void handleRequest(String request) {
        IAlexaSkill requestHandler = installedSkills.stream()
                .filter(skill -> skill.canHandleRequest(request.toLowerCase()))
                .findFirst()
                .orElse(null);

        if (requestHandler == null) {
            System.out.println("Entschuldigung, '" + request + "' habe ich leider nicht verstanden (Fehlt ein Skill?).");
        } else {
            requestHandler.handleRequest(request);
        }
    }
}
