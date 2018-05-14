package Behavioral.Command;

/**
 * Created by FrancescoXX on 14/05/2018.
 */
public abstract class AbstractCommand implements Command {

    private TextEditor textEditor;

    public AbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditor getTextEditor() {
        return textEditor;
    }
}
