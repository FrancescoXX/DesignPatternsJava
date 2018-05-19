package Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FrancescoXX on 19/05/2018.
 */
public class Application {

    private List<Image> images = new ArrayList<>();

    public Application(List<Image> images) {
        this.images = images;
    }

    public void draw() {
        for (Image image : images) {
            image.draw();
        }
    }
}
