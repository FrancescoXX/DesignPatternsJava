package Creational.singleton;

/**
 * Created by FrancescoXX
 */

/**
 * Very simple class. It just invokes a method in the Manager class
 * There's no way to have multiple Managers
 */

public class Client {
    public static void main(String[] args) {


        Manager.getInstance().helloSingleton();

        /**
         * Call the instance of a class which extends the singleton class
         */
        MyManager.getInstance().helloSingleton();
    }
}
