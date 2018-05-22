package Behavioral.visitor;

/**
 * Created by FrancescoXX on 22/05/2018.
 */
public class PrintCarPartVisitor implements CarPartVisitor {
    @Override
    public void visit(CarPart carPart) {
        System.out.println("Print " + carPart);
    }
}
