package org.example.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("BillPughSingleton constructor");
    }

    /** Static inner class (Holder) is NOT loaded into memory
     until it is referenced (i.e., when getInstance() is called). */
    private static class Holder {

        /**
         * The Singleton instance is created here.
         * 'static final' ensures: Only one instance is created
         * Instance is created once and never changed
         * */
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {

        /**
         * When this method is called for the first time:
            → Holder class gets loaded into memory
            → INSTANCE is created automatically (thread-safe by JVM)
         */
        return Holder.INSTANCE;
    }
}
