package Creational.prototype;

/**
 * Created by FrancescoXX on 05/01/17.
 */

public class Video extends Graphic {

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Graphic clone() {
        Video clone = new Video();
        clone.setUrl(this.url);
        return clone;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
