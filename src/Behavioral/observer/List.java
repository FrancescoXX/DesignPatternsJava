package Behavioral.observer;

/**
 * Created by FrancescoXX on 03/05/2018.
 * <p>
 * Implementationof Observer
 */
public class List implements Observer {

    public void setListValue(int value) {
        System.out.println("Set list value : " + value);
    }

    @Override
    public void update() {
        setListValue(1);
    }
}
