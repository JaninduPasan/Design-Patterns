package Learnings.Behavioural.ChainOfResponsibility.Example;

public interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler nextHandler);
}