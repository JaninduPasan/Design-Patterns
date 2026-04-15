package Learnings.Behavioural.State.Example;

public class Program {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(2);

        machine.insertDollar();
        machine.dispense();

        machine.insertDollar();
        machine.ejectMoney();

        machine.insertDollar();
        machine.dispense();

        machine.insertDollar();
        machine.dispense();
    }
}
