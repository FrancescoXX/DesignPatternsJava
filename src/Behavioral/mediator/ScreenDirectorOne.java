package Behavioral.mediator;

/**
 * Created by FrancescoXX on 25/05/2018.
 */
public class ScreenDirectorOne implements ScreenDirector {

    private InputText inputText;

    @Override
    public void itemSelected(String item) {
        inputText.setValue(item);
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }
}
