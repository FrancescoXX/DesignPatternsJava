package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FrancescoXX on 19/05/2018.
 */
public class GraphicItemGroup implements Graphic {

    //Its a composite of other Items
    private List<Graphic> graphicList = new ArrayList<>();

    @Override
    public void draw() {
        for (Graphic graphic : graphicList) {
            graphic.draw();
        }
    }

    public List<Graphic> getGraphicList() {
        return graphicList;
    }
}
