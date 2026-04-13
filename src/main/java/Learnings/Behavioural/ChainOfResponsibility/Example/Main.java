package Learnings.Behavioural.ChainOfResponsibility.Example;

public class Main {
    public static void main(String[] args) {
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);
        Request request4 = new Request(Priority.IMPOSSIBLE);

        System.out.println(" Process Request 1");
        level1Handler.handleRequest(request1);
        System.out.println("\n Process Request 2");
        level1Handler.handleRequest(request2);
        System.out.println("\n Process Request 3");
        level1Handler.handleRequest(request3);
        System.out.println("\n Process Request 4");
        level1Handler.handleRequest(request4);
    }
}