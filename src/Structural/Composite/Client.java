package Structural.Composite;

/**
 * Created by FrancescoXX on 19/05/2018.
 */
public class Client {

    public static void main(String[] args) {

        Line line = new Line();
        Rectangle rectangle = new Rectangle();

        //Create graphic item group
        GraphicItemGroup group = new GraphicItemGroup();

        group.getGraphicList().add(line);
        group.getGraphicList().add(rectangle);

        group.draw();

        System.out.println("------------------------");

        Line line1 = new Line();

        //Second group. will contain group1 and other graphics
        GraphicItemGroup group2 = new GraphicItemGroup();
        group2.getGraphicList().add(group); //Add group to another group
        group2.getGraphicList().add(line1);

        group2.draw();
    }
}
