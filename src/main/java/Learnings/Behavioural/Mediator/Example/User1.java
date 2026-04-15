package Learnings.Behavioural.Mediator.Example;

/**
 * Concrete Colleague 1
 * */
public class User1 extends Colleague {

    public User1(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " receives: " + message);
    }
}