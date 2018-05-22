package Behavioral.visitor;

/**
 * Created by FrancescoXX on 22/05/2018.
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();

        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());

        car.getCarParts().add(new Light());
        car.getCarParts().add(new Light());

        car.getCarParts().add(new Engine());

        car.upgrade();
        car.print();
        car.render();
    }
}
