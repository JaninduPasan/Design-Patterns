package Learnings.Behavioural.Command.Example;

public class Program {
    public static void main(String[] args) {
        Document document = new Document();

        CommandManager commandManager = CommandManager.getInstance();

        Command command1 = new PasteCommand(document, 0, "Hello ");
        Command command2 = new PasteCommand(document, 6, "World!");

        commandManager.invokeCommand(command1);
        commandManager.invokeCommand(command2);

        commandManager.undo();
        commandManager.undo();
    }
}
