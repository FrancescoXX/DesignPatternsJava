package Structural.Decorator;

/**
 * Created by FrancescoXX on 16/05/2018.
 *
 * We are adding additional feature to Window
 */
public class IconWindowDecorator extends WindowDecorator {

    public IconWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Draw ICON");
        window.draw();
    }
}
