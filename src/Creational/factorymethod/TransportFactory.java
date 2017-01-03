package Creational.factorymethod;

/**
 * Created by FrancescoXX
 */

/**
 * It's the way we create transport objects
 * We want users use the factory and not specific constructors
 * we have 2 implementations, could add future transports  (eg. PlaneFactory)
 */
public abstract class TransportFactory {

    abstract Transport create();
}
