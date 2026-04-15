package Learnings.Behavioural.Command.Example;

/**
 * Command superclass
 * */
public abstract class Command {
    public abstract void execute();
    public abstract void unExecute();
    public abstract boolean isReversible();
}
