package Structural.Bridge;

/**
 * Created by FrancescoXX on 17/05/2018.
 */
public class DirectXWindowImpl extends WindowImpl {
    @Override
    public void draw(int x, int y, int width, int height, String colour) {
        System.out.println("Drawing on DirectX x: " + x + " y: " + y + " width: " + width + " height: " + height);
    }
}
