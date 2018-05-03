package Creational.prototype;

/**
 * Created by FrancescoXX on 05/01/17.
 */

public class Image extends Graphic {

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Graphic clone() {
        Image clone = new Image();
        clone.setUrl(this.url);
        return clone;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
