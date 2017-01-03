package Creational.factorymethod;

/**
 * Created by FrancescoXX
 */

/**
 * Implementation of TransportFactory Abstract class
 */

public class BikeFactory extends TransportFactory {

    @Override
    Transport create() {
        return new Bike();
    }
}
