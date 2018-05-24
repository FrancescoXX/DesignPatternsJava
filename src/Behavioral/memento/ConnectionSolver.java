package Behavioral.memento;

import java.awt.geom.Point2D;

/**
 * Created by FrancescoXX on 24/05/2018.
 */
public class ConnectionSolver {

    private Point2D firstPoint;
    private Point2D secondPoint;

    public void calculateLine() {
        System.out.println("Calculate Line between: " + firstPoint + " and " + secondPoint);
    }

    public void setFirstPoint(Point2D firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setMemento(ConnectionSolverMemento memento) {
        firstPoint = memento.getFirstPoint();
        secondPoint = memento.getSecondPoint();
    }

    public void setSecondPoint(Point2D secondPoint) {
        this.secondPoint = secondPoint;
    }

    public ConnectionSolverMemento createMemento() {
        return new ConnectionSolverMemento(firstPoint, secondPoint);
    }
}
