package Behavioral.memento;

import java.awt.geom.Point2D;

/**
 * Created by FrancescoXX on 24/05/2018.
 */
public class ConnectionSolverMemento {

    private Point2D firstPoint;
    private Point2D secondPoint;

    public ConnectionSolverMemento(Point2D firstPoint, Point2D secondPointpoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPointpoint;
    }

    public Point2D getFirstPoint() {
        return firstPoint;
    }

    public Point2D getSecondPoint() {
        return secondPoint;
    }
}
