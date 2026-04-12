package Learnings.CreationalAndStructural.Decorator.Example;

public class Program {
    public static void main(String[] args) {
        WebPage myPage = new BasicWebPage();
        myPage = new AuthorizedWebPage(myPage);
        myPage = new AuthenticatedWebPage(myPage);

        /**
         * Basic web page will display ->
         * Authorized display behavior ->
         * Authentication display behavior
         * */
        myPage.display();
    }
}
