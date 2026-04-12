package Learnings.Behavioural.Template.Example;

/**
 * Superclass must contain abstract methods that are implemented by rge subclasses
 * PastaDish is an abstract class -> a generic pasta dish cannot be made
 * */
public abstract class PastaDish {

    /**
     * final -> method declared can not be overridden by subclasses
     * Neither specific dish subclasses can have its own version of makeRecipe
     * Ensure consistency in the steps of making the dishes
     * Methods that are the same for any subclass are consolidated in the superclass
     * */
    final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void cookPasta() {
        System.out.println("Cooking Pasta");
    }

    private void drainAndPlate() {
        System.out.println("Draining and Plate");
    }

    abstract void addPasta();
    abstract void addSauce();
    abstract void addProtein();
    abstract void addGarnish();

}
