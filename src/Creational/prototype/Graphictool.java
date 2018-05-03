package Creational.prototype;

/**
 * Created by FrancescoXX on 05/01/17.
 */

/**
 * Part of the Gui framework
 */

public class GraphicTool {

    private Graphic prototype;

    /**
     * Creates a graphicTool by using prototype
     * @param prototype
     */
    public GraphicTool(Graphic prototype){
        this.prototype = prototype;
    }

    /**
     * Method internal to the framework
     * @return
     */
    protected Graphic createGraphic(){
        return prototype.clone();
    }

    //to change properties at runtime
    public void setPrototype(Graphic prototype) {
        this.prototype = prototype;
    }
}
