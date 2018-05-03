package Behavioral.observer;

/**
 * Created by FrancescoXX on 03/05/2018.
 */
public class Client {

    public static void main(String[] args) {
        Button button = new Button();
        InputText text = new InputText();
        List list = new List();

        //Notify button
        button.attachObserver(text);
        button.attachObserver(list);

        button.clicked();
    }
}
