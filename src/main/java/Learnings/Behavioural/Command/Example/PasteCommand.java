package Learnings.Behavioural.Command.Example;

/**
 * Concrete Command Class
 * Keeps track of where the text will be inserted as well as what will be inserted
 * Keep track of details i.e. current state of the Document
 * */
public class PasteCommand extends Command {
    private Document document;
    private int position;
    private String text;

    public PasteCommand(Document document, int position, String text) {
        this.document = document;
        this.position = position;
        this.text = text;
    }

    @Override
    public void execute() {
        document.insertText(position, text);
    }

    @Override
    public void unExecute() {
        document.deleteText(position, text.length());
    }

    @Override
    public boolean isReversible() {
        return true;
    }
}
