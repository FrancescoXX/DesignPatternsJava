package Structural.Proxy;

/**
 * Created by FrancescoXX on 19/05/2018.
 */
public class Image {

    protected String url;

    public Image() {
    }

    public Image(String url) {
        System.out.println("Drawing image");
        this.url = url;
    }

    public void draw() {
        System.out.println("Draw image from url " + url);
    }
}
