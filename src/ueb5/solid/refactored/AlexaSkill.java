package ueb5.solid.refactored;

public abstract class AlexaSkill implements IAlexaSkill {
    protected String getParameter(String request, String token, String defaultValue) {
        // Implementation here
        return defaultValue;
    }

    public abstract boolean canHandleRequest(String request);
    public abstract void handleRequest(String request);
}
