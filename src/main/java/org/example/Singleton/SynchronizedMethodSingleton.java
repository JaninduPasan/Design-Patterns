package org.example.Singleton;

public class SynchronizedMethodSingleton {

    // This static variable holds the ONE and ONLY instance of the class.
    private static SynchronizedMethodSingleton uniqueInstance = null;

    private SynchronizedMethodSingleton() {
        System.out.println("SynchronizedMethodSingleton constructor");
    }

    /**
     * Public static method provides global access to the single instance.
     * 'static' → can be called without creating an object of the class.
     * 'synchronized' → ensures only one thread can execute this method at a time, making it thread-safe.
     */
    public static synchronized SynchronizedMethodSingleton getInstance() {
        // Lazy Initialization
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedMethodSingleton();
        }
        return uniqueInstance;
    }


    /**
     Synchronization happens every time -> performance overhead
     **/
}

