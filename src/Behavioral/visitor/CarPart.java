package Behavioral.visitor;

/**
 * Created by FrancescoXX on 22/05/2018.
 */
public abstract class CarPart {

    void acceptVisitor(CarPartVisitor visitor) {
        visitor.visit(this);
    }
}
