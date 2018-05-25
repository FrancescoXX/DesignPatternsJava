package Behavioral.mediator;

/**
 * Created by FrancescoXX on 25/05/2018.
 */
public class Client {

    public static void main(String[] args) {

        List list = new List();
        InputText text = new InputText();

        ScreenDirectorOne screenDirector = new ScreenDirectorOne();
        screenDirector.setInputText(text);

        //Link
        list.setScreenDirector(screenDirector);

        list.getItems().add("Data item one");
        list.getItems().add("Data item two");
        list.getItems().add("Data item three");

        list.selectItem(2);

        System.out.println("Selected value is: " + text.getValue());
    }
}
