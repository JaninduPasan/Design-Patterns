package Learnings.CreationalAndStructural.Decorator.Example;

/**
 * Base concrete component class
 * Base building clock for all web pages objects during run time
 * implement how it displays itself by using standard HTML markup and page element styling defined in the cascading style sheet
 * */

public class BasicWebPage implements WebPage {
    public String html = "xxxxxxxxxxxxx";
    public String styleSheet = "yyyyyyyyyyyy";
    public String script = "zzzzzzzzzzzz";

    @Override
    public void display() {
        // Render the HTML to the stylesheet, and run any embedded script
        System.out.println("Basic Web Page");
    }
}
