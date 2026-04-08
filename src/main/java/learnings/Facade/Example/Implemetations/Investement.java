package learnings.Facade.Example.Implemetations;

import learnings.Facade.Example.BankServiceInterface;

import java.math.BigDecimal;

public class Investement implements BankServiceInterface {
    public Investement(BigDecimal initAmmount) {
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(int to, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
