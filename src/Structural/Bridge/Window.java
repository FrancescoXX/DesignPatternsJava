package Structural.Bridge;

/**
 * Created by FrancescoXX on 17/05/2018.
 */
public class Window {

    private WindowImpl window;

    public void draw(int x, int y, int width, int height, String colour) {
        window.draw(x, y, width, height, colour);
    }

    public void setWindow(WindowImpl window) {
        this.window = window;
    }
}
