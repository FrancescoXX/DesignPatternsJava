package Creational.abstractfactory;

/**
 * Created by FrancescoXX on 03/01/17.
 */
public class PinkThemeWidgetFactory implements WidgetFactory {
    @Override
    public Scrollbar createScrollbar() {
        return new PinkThemeScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PinkThemeWindows();
    }
}
