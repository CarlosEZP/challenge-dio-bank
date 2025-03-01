package src.models;

public class Account {
    protected int agency;
    protected int id;
    protected double balance;

    public int getAgency() {
        return agency;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(){}
    public void withdraw(){}
    public void transfer(){}
}
