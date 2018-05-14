package Behavioral.Command;

/**
 * Created by FrancescoXX on 14/05/2018.
 *
 * Each command is an object itself
 */
public class AddTextCommand extends AbstractCommand {

    private String undoText;

    private String textToBeAdded;

    public AddTextCommand(TextEditor textEditor, String textToBeAdded) {
        super(textEditor);
        this.textToBeAdded = textToBeAdded;
    }

    @Override
    public void action() {
        undoText = getTextEditor().getText();
        getTextEditor().setText(getTextEditor().getText() + textToBeAdded);
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
