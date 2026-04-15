package Learnings.Behavioural.Command.Example;

public class Document {
    private StringBuilder content =  new StringBuilder();

    public void insertText(int position, String text) {
        content.insert(position, text);
        System.out.println("After insert: " + content);
    }

    public void deleteText(int position, int length) {
        content.delete(position, position + length);
        System.out.println("After delete: " + content);
    }

    public String getContent() {
        return content.toString();
    }
}
