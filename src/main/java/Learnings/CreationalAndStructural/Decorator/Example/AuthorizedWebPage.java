package Learnings.CreationalAndStructural.Decorator.Example;

/**
 * Inherit from the abstract decorator and implement the component interface with the concrete decorator classes
 * */

public class AuthorizedWebPage extends  WebPageDecorator {

    /**
     * Constructor use the abstract superclass's constructor
     * Allows decorators to be stacked together
     * */
    public AuthorizedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authorizedUser() {
        System.out.println("Authorized User");
    }


    /**
     * Recursively call the display behavior
     * invokes the superclass's display method
     * Abstract decorator superclass facilitates the aggregation of various types of web design
     * 'super.display()' will cause the next web page in the stack to execute its version of the display until the basic web page
     * */
    public void display() {
        super.display();
        this.authorizedUser();
    }
}
