package Learnings.Behavioural.State.Example.MachineStates;

import Learnings.Behavioural.State.Example.IState;
import Learnings.Behavioural.State.Example.VendingMachine;

public class IdleIState implements IState {
    private VendingMachine machine;

    public IdleIState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertDollar() {
        System.out.println("Dollar inserted.");
        machine.setState(machine.getHasOneDollarState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("No money to return.");
    }

    @Override
    public void dispense() {
        System.out.println("Insert a dollar first.");
    }
}
