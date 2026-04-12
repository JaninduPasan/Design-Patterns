package Learnings.CreationalAndStructural.Decorator.Example;

/**
 * Abstract Decorator -> Abstract superclass of concrete decorate classes
 * */
public abstract class WebPageDecorator implements WebPage {
    /**
     * Only has one instance of the web page
     * Allows decorators to be stacked on top of the basic web page, and on top of each other
     * */
    protected WebPage page;

    /**
     * Constructor allows different subtypes of webpages to be linked together in a stack
     * Indicates what instance of web page subtype should be stacked upon
     * */
    public WebPageDecorator(WebPage page) {
        this.page = page;
    }


    /**
     * Order of the tack matters
     * The Basic web page must be the first one in the stack
     * Rest of the ordering depend on the design and augmenting behavior which to be executed first
     * */

    @Override
    public void display() {
        this.page.display();
    }
}
