package Creational.abstractfactory;

/**
 * Created by FrancescoXX on 03/01/17.
 */
public class YellowThemeWidgetFactory implements WidgetFactory {
    @Override
    public Scrollbar createScrollbar() {
        return new YellowThemeScrollBar();
    }

    @Override
    public Window createWindow() {
        return new YellowThemeWindow();
    }
}
