package Extra.InversionOfControl;

/**
 * Created by FrancescoXX on 03/05/2018.
 */
public class UnixFileSystem implements FileSystem {
    @Override
    public String readFile() {
        return "Unix file system read";
    }
}
