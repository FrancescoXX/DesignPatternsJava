package Behavioral.observer;

/**
 * Created by FrancescoXX on 03/05/2018.
 */
public class InputText implements Observer {

    public void setText(String text){
        System.out.println("InputText set text: " + text);
    }

    @Override
    public void update() {
        this.setText("button has been clicked");
    }
}
