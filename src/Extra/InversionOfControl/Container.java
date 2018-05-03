package Extra.InversionOfControl;

/**
 * Created by FrancescoXX on 03/05/2018.
 */
public class Container {

    private ImageService imageService;

    public void init() {
        imageService = new ImageService();
        imageService.setFileSystem(new UnixFileSystem());
    }

    public ImageService getImageService() {
        return imageService;
    }

    public static void main(String[] args) {
        Container container = new Container();
        container.init();
        ImageService imageService = container.getImageService();

        System.out.println(imageService.readImage());
    }
}
