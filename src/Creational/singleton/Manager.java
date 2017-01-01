package Creational.singleton;

/**
 * Created by FrancescoXX
 */

/**
 * SINGLETON PATTERN EXAMPLE IN JAVA
 *
 *  Procedure:
 *  1-store Unique Instance
 *  2-getInstance is the only way to retrieve the instance
 *  3-Create the singleton instance
 */
public class Manager {

    /**
     * Unique instance
     */
    private static Manager instance = null;

    /**
     * Protected Manager constructor so no other classes can instantiate a singleton
     * Can also be private
     */
    protected Manager() {}

    /**
     * Create a singleton instance if it doesn't exist
     * @synchronized to allow only one instance when using multiple threads
     */
    private synchronized static void createInstance () {
        if (instance == null) {
            instance = new Manager();
        }
    }

    /**
     * Access method to get hold of singleton instance
     * @return the one singleton instance, create a new one only if it doesn't exist
     */
    public static Manager getInstance(){
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

    /**
     * replace with Manager method
     */
    public void helloSingleton(){
        System.out.println("Hello i'm a singleton");
    }
}
