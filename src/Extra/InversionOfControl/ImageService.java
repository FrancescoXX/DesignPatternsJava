package Extra.InversionOfControl;

/**
 * Created by FrancescoXX on 03/05/2018.
 */
public class ImageService {

    private FileSystem fileSystem;

    public String readImage() {
        return fileSystem.readFile();
    }

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }
}
