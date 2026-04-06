package org.example.Singleton;

public class BasicSingleton {


    //The Class variable is null if no instance is initiated -> Lazy construction
    private static BasicSingleton uniqueInstance = null;

    // Private constructor prevents external classes from creating objects
    private BasicSingleton() {
        System.out.println("BasicSingleton constructor");
    }

    public static BasicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BasicSingleton();
        }
        return uniqueInstance;
    }
}