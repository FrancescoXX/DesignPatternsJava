package Behavioral.visitor;

/**
 * Created by FrancescoXX on 22/05/2018.
 */
public class UpgradeCarPartVisitor implements CarPartVisitor {
    @Override
    public void visit(CarPart carPart) {
        System.out.println("Upgrade " + carPart);
    }
}
