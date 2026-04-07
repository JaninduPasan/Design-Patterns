package org.example.Facade.Example;

import org.example.Facade.Example.Implemetations.Chequing;
import org.example.Facade.Example.Implemetations.Investement;
import org.example.Facade.Example.Implemetations.Saving;

import java.math.BigDecimal;
import java.util.Hashtable;

/***
 * Facade class -> public methods are simple to use and show no hint of the underlying interface and implementing classes
 * */

public class BankService {
    private Hashtable<Integer, BankServiceInterface> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<Integer, BankServiceInterface>();
    }

    public int createNewAccount(String type, BigDecimal initAmmount) {

        BankServiceInterface newAccount = null;
        switch (type) {
            case "chequing":
                newAccount = new Chequing(initAmmount);
                break;
            case "saving":
                newAccount = new Saving(initAmmount);
                break;
            case "investment":
                newAccount = new Investement(initAmmount);
                break;
            default:
                System.out.println("Bank Service Error");
                break;
        }

        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return 0;
    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        BankServiceInterface toAccount = this.bankAccounts.get(to);
        BankServiceInterface fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount.getAccountNumber(), amount);
    }
}
