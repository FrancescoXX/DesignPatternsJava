package Creational.abstractfactory;

/**
 * Created by FrancescoXX on 03/01/17.
 */
public interface WidgetFactory {

    Scrollbar createScrollbar();
    Window createWindow();
}
