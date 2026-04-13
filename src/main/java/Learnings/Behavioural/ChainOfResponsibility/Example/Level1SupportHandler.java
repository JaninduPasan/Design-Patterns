package Learnings.Behavioural.ChainOfResponsibility.Example;

public class Level1SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 Support handled the request.");
        } else if (nextHandler != null) {
            System.out.println("Level 1 Support cannot handle the request.");
            nextHandler.handleRequest(request);
        }
    }
}
