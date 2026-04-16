package Learnings.Behavioural.Observer.Example;

public class Subscriber implements Observer {
    private String name;
    private Blog blog;

    public Subscriber(String name, Blog blog) {
        this.name = name;
        this.blog = blog;
    }

    @Override
    public void update() {
        System.out.println(name + " received update --> " + blog.getState());
    }

    public void subscribe() {
        blog.registerObserver(this);
        System.out.println(name + " subscribed to the blog.");
    }

    public void unsubscribe() {
        blog.unregisterObserver(this);
        System.out.println(name + " unsubscribed from the blog.");
    }
}
