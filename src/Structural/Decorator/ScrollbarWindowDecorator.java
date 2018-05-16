package Structural.Decorator;

/**
 * Created by FrancescoXX on 16/05/2018.
 */
public class ScrollbarWindowDecorator extends WindowDecorator {

    public ScrollbarWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        //Decoration
        System.out.println("Draw a scrollbar");
        window.draw();
    }
}
