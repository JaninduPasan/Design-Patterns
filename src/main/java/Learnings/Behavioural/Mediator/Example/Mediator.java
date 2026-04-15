package Learnings.Behavioural.Mediator.Example;

/**
 * Mediator Interface
 * */
public interface Mediator {
    void sendMessage(String message, Colleague sender);
}
