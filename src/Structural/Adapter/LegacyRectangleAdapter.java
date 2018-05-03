package Structural.Adapter;

/**
 * Created by FrancescoXX on 07/01/17.
 */
public class LegacyRectangleAdapter extends Rectangle {

    //derive the code and use code to referee to legacy
    private LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    //ADAPTATION
    @Override
    public Integer determineSize() {
        return legacyRectangle.calculateSize();
    }
}
