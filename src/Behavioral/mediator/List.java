package Behavioral.mediator;

import java.util.ArrayList;

/**
 * Created by FrancescoXX on 25/05/2018.
 */
public class List {

    private java.util.List<String> items = new ArrayList<>();
    private ScreenDirector screenDirector;

    public void selectItem(int itemNumber){
        String item = items.get(itemNumber);
        if (screenDirector != null){
            screenDirector.itemSelected(item);
        }
    }

    public java.util.List<String> getItems() {
        return items;
    }

    public void setScreenDirector(ScreenDirector screenDirector) {
        this.screenDirector = screenDirector;
    }
}
