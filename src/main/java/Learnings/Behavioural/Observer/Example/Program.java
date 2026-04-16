package Learnings.Behavioural.Observer.Example;

public class Program {
    public static void main(String[] args) {
        Blog blog = new Blog();

        Subscriber sub1 = new Subscriber("Alice", blog);
        Subscriber sub2 = new Subscriber("Bob", blog);
        Subscriber sub3 = new Subscriber("Charlie", blog);

        // Subscribers subscribe to the blog
        sub1.subscribe();
        sub2.subscribe();
        sub3.subscribe();

        System.out.println();

        // Blog state changes
        blog.setState("New post: Observer Pattern in Java");

        System.out.println();

        // One subscriber unsubscribes
        sub2.unsubscribe();

        System.out.println();

        // Blog state changes again
        blog.setState("New post: Sequence Diagram for Observer Pattern");
    }
}
