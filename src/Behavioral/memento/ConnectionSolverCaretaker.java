package Behavioral.memento;

/**
 * Created by FrancescoXX on 24/05/2018.
 */
public class ConnectionSolverCaretaker {

    private ConnectionSolverMemento connectionSolverMemento;

    public void saveState(ConnectionSolver connectionSolver) {
        connectionSolverMemento = connectionSolver.createMemento();
    }

    public void restoreState(ConnectionSolver connectionSolver) {

        connectionSolver.setMemento(connectionSolverMemento);
    }
}
