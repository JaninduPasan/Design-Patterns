package Learnings.Behavioural.Observer.Example;

/**
 * Make sure all observer objects behave the same way
 * */
public interface Observer {
    /**
     * This method is called by the subject
     * makes sure when a change happens, all its observers are notified
     * */
    void update();
}
