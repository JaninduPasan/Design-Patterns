package Learnings.Behavioural.Template.Example;

public class Program {
    public static void main(String[] args) {
        SpaghettiMeatballs mySpaghetti = new SpaghettiMeatballs();
        PenneAlfredo myPenneAlfredo = new PenneAlfredo();

        System.out.println("Making Spaghetti...");
        mySpaghetti.makeRecipe();
        System.out.println("\n");
        System.out.println("Making PenneAlfredo...");
        myPenneAlfredo.makeRecipe();
    }
}