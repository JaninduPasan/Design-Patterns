package Learnings.Behavioural.Mediator.Example;

public class Program {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        Colleague user1 = new User1(mediator, "Alice");
        Colleague user2 = new User2(mediator, "Bob");

        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hello Bob!");
        user2.send("Hi Alice!");
    }
}