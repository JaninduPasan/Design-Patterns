package Learnings.Behavioural.State.Example.MachineStates;

import Learnings.Behavioural.State.Example.IState;
import Learnings.Behavioural.State.Example.VendingMachine;

public class HasOneDollarIState implements IState {
    private VendingMachine machine;

    public HasOneDollarIState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertDollar() {
        System.out.println("Already have one dollar. Cannot insert another.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Money returned.");
        machine.setState(machine.getIdleState());
    }

    @Override
    public void dispense() {
        machine.releaseItem();

        if (machine.getCount() > 0) {
            machine.setState(machine.getIdleState());
        } else {
            System.out.println("Machine is now out of stock.");
            machine.setState(machine.getOutOfStockState());
        }
    }
}