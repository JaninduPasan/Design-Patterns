package Learnings.Behavioural.Command.Example;

import java.util.Stack;

/**
 * Invoker - Object that manages the history and redo lists
 * Use Singleton Design Pattern
 */

public class CommandManager {
    private static CommandManager instance;
    private Stack<Command> history =  new Stack<>();

    private CommandManager() {}

    public static CommandManager getInstance() {
        if (instance == null) {
            instance = new CommandManager();
        }
        return instance;
    }

    public void invokeCommand(Command command) {
        command.execute();
        if (command.isReversible()) {
            history.push(command);
        }
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.unExecute();
        }
    }
}
