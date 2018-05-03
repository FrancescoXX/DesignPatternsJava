package Creational.factorymethod;

/**
 * Created by FrancescoXX
 */

/**
 * FACTORY METHOD PATTERN EXAMPLE IN JAVA
 *
 *  Procedure:
 *  1-generic Transport Class
 *  2-Extend TransportClass (Specific transport we need, can be improved in the future)
 *  3-Override create method
 *  4-Work with Car implementation
 */

/**
 * The Client uses the TransportFactory and at runtime we can choose the factory to create(Bike or Car for now)
 */

public class Client {

    public static void main(String[] args) {

        TransportFactory factory = new BikeFactory();
        Transport transport = factory.create();  //creates a new Bike
        System.out.println(transport.drive());

        /**
         * Now lets change bike to car
         */
        factory = new CarFactory();
        transport = factory.create();           //creates a new Car
        System.out.println(transport.drive());
    }
}
