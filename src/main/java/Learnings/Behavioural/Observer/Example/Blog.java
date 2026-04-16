package Learnings.Behavioural.Observer.Example;

/***
 * Inherits registerObserver(), unregisterObserver(), and notify
 * has other responsibilities of managing a blog and posting methods
 */
public class Blog extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("Blog updated state --> " + state);
        notifyObservers();
    }
}
