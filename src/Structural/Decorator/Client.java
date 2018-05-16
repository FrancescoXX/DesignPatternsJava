package Structural.Decorator;

/**
 * Created by FrancescoXX on 16/05/2018.
 */
public class Client {

    public static void main(String[] args) {

        //We need a icon window decorator, scrollbar window decorator, and a WindowDecorator

        //Crete window
        Window window = new Window();

        //Decorate with an icon
        IconWindowDecorator iconWindowDecorator = new IconWindowDecorator(window);

        //Decorate with a scrollbar
        ScrollbarWindowDecorator scrollbarWindowDecorator = new ScrollbarWindowDecorator(iconWindowDecorator);

        scrollbarWindowDecorator.draw();
    }
}