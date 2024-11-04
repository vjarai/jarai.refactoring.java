package ueb5.solid.refactored;

public interface IAlexaSkill {
    boolean canHandleRequest(String request);
    void handleRequest(String request);
}


