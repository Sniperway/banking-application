/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking.application;

/**
 *
 * @author Fentse
 */
import java.util.ArrayList;
import java.util.List;

public class BankingApplication {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");
        bank.addAccount(new SavingsAccount("John Doe", 1000));
        bank.addAccount(new CheckingAccount("Jane Doe", 500));

        System.out.println("Bank Report:");
        System.out.println("=============");
        for (Account account : bank.getAccounts()) {
            System.out.println(account.getReport());
        }
    }
}

class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

abstract class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public abstract String getReport();
}

class SavingsAccount extends Account {
    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public String getReport() {
        return "Savings Account - Owner: " + getOwner() + ", Balance: " + getBalance();
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public String getReport() {
        return "Checking Account - Owner: " + getOwner() + ", Balance: " + getBalance();
    }
}




    

