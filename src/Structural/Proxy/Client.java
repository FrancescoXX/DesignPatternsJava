package Structural.Proxy;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by FrancescoXX on 19/05/2018.
 */
public class Client {

    public static void main(String[] args) {

        ImageProxy image = new ImageProxy("Test image");
        ImageProxy image2 = new ImageProxy("Second image");

        List<Image> images = new ArrayList<Image>();
        images.add(image);
        images.add(image2);

        Application application = new Application(images);
        System.out.println("Application Setup");
        application.draw();
    }
}
