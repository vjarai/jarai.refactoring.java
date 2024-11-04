package ueb5.solid.refactored;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WettervorhersageSkill extends AlexaSkill implements IAlexaSkill {

    @Override
    public boolean canHandleRequest(String request) {
        return request.contains("wetter");
    }

    @Override
    public void handleRequest(String request) {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println("Morgen, am " + tomorrow.format(formatter) + " scheint die Sonne.");
    }
}
