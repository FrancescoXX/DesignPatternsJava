package Creational.factorymethod;

/**
 * Created by FrancescoXX
 */
public class CarFactory extends TransportFactory {

    @Override
    Transport create() {

        return new Car();
    }
}
