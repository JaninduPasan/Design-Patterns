package Learnings.Behavioural.State.Example;

import Learnings.Behavioural.State.Example.MachineStates.HasOneDollarIState;
import Learnings.Behavioural.State.Example.MachineStates.IdleIState;
import Learnings.Behavioural.State.Example.MachineStates.OutOfStockIState;

public class VendingMachine {
    private IState idleState;
    private IState hasOneDollarState;
    private IState outOfStockState;

    private IState currentState;
    private int count;

    public VendingMachine(int count) {
        this.count = count;

        idleState = new IdleIState(this);
        hasOneDollarState = new HasOneDollarIState(this);
        outOfStockState = new OutOfStockIState(this);

        if (count > 0) {
            currentState = idleState;
        } else {
            currentState = outOfStockState;
        }
    }

    public void insertDollar() {
        currentState.insertDollar();
    }

    public void ejectMoney() {
        currentState.ejectMoney();
    }

    public void dispense() {
        currentState.dispense();
    }

    public void releaseItem() {
        if (count > 0) {
            System.out.println("An item has been dispensed.");
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public void setState(IState IState) {
        this.currentState = IState;
    }

    public IState getIdleState() {
        return idleState;
    }

    public IState getHasOneDollarState() {
        return hasOneDollarState;
    }

    public IState getOutOfStockState() {
        return outOfStockState;
    }
}
