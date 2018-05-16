package Structural.Decorator;

/**
 * Created by FrancescoXX on 16/05/2018.
 */
public class WindowDecorator extends Window {

    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }
}
