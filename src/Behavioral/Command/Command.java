package Behavioral.Command;

/**
 * Created by FrancescoXX on 14/05/2018.
 *
 * Command is an interface
 * goal is to perform logic for command to let undo action performed
 */
public interface Command {

    void action();

    void undo();
}
