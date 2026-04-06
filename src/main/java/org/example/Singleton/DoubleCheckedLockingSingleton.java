package org.example.Singleton;

public class DoubleCheckedLockingSingleton {

    /** 'volatile' ensures visibility across threads and prevents instruction reordering.
     Without it, a thread might see a partially constructed object. Another thread may access the object before it’s fully constructed */
    private static volatile DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton() {
        System.out.println("DoubleCheckedLockingSingleton constructor");
    }

    public static DoubleCheckedLockingSingleton getInstance() {

        /** Synchronize only when instance is not yet created
        This ensures only one thread can create the instance */
        if (uniqueInstance == null) {

            /** Synchronize only when instance is not yet created
             This ensures only one thread can create the instance*/
            synchronized (DoubleCheckedLockingSingleton.class) {

                /** Second check (WITH locking) → ensures only one instance is created
                 Prevents multiple threads from creating multiple objects */
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
