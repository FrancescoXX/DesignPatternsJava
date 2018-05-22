package Behavioral.visitor;

/**
 * Created by FrancescoXX on 22/05/2018.
 */
public class RenderCarPartVisitor implements CarPartVisitor {
    @Override
    public void visit(CarPart carPart) {
        System.out.println("Render " + carPart);
    }
}
