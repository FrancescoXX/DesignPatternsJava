package Structural.Proxy;

/**
 * Created by FrancescoXX on 19/05/2018.
 */
public class ImageProxy extends Image {

    //ImageProxy must behave like an Image
    private Image image;

    public ImageProxy(String url) {
        super();
        this.url = url;
    }

    @Override
    public void draw() {

        if (image == null) {
            image = new Image(this.url);
        }
        image.draw();
    }
}
