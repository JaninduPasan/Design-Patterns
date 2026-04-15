package Learnings.Behavioural.State.Example.MachineStates;

import Learnings.Behavioural.State.Example.IState;
import Learnings.Behavioural.State.Example.VendingMachine;

public class OutOfStockIState implements IState {
    private VendingMachine machine;

    public OutOfStockIState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertDollar() {
        System.out.println("Machine is out of stock. Cannot insert money.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("No money to return.");
    }

    @Override
    public void dispense() {
        System.out.println("No item to dispense. Machine is out of stock.");
    }
}