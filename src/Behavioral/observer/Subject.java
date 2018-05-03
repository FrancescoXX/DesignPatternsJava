package Behavioral.observer;

/**
 * Created by FrancescoXX on 03/05/2018.
 *
 * Subject interface
 */
public interface Subject {

    void attachObserver(Observer observer);

    void detachObserver(Observer observer);

    void change();
}
