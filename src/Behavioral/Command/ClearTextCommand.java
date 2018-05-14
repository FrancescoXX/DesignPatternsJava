package Behavioral.Command;

/**
 * Created by FrancescoXX on 14/05/2018.
 */
public class ClearTextCommand extends AbstractCommand {

    private String undoText = "";

    public ClearTextCommand(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void action() {
        //first backup the undo text
        undoText = getTextEditor().getText();
        getTextEditor().setText("");

    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
