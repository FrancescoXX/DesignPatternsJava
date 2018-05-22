package Behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FrancescoXX on 22/05/2018.
 */
public class Car {

    List<CarPart> carParts = new ArrayList<>();

    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }

    public void render() {
        RenderCarPartVisitor visitor = new RenderCarPartVisitor();
        for (CarPart carPart : carParts) {
            carPart.acceptVisitor(visitor);
        }
    }

    public void print() {
        PrintCarPartVisitor visitor = new PrintCarPartVisitor();
        for (CarPart carPart : carParts) {
            carPart.acceptVisitor(visitor);
        }
    }

    public void upgrade() {
        UpgradeCarPartVisitor visitor = new UpgradeCarPartVisitor();
        for (CarPart carPart : carParts) {
            carPart.acceptVisitor(visitor);
        }
    }


}
