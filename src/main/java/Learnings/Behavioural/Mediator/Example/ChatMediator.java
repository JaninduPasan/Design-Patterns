package Learnings.Behavioural.Mediator.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Mediator
 * */
public class ChatMediator implements Mediator {
    private List<Colleague> users = new ArrayList<>();

    public void addUser(Colleague user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, Colleague sender) {
        for (Colleague user : users) {
            if (user != sender) {
                user.receive(sender.name + ": " + message);
            }
        }
    }
}
