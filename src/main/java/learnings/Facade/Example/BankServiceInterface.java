package learnings.Facade.Example;

import java.math.BigDecimal;

public interface BankServiceInterface {
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(int toAccount, BigDecimal amount);
    public int getAccountNumber();
}
