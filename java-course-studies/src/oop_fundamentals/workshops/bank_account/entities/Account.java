package oop_fundamentals.workshops.bank_account.entities;

public class Account {

    private String name;
    private int account;
    private double balance;

    public Account(String name, int account, double balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    public Account(String name, int account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) { this.balance += deposit; }
    public void withdraw(double withdraw) { this.balance -= withdraw + 5; }
    public String toString() {
        return "Account "
                + account
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
