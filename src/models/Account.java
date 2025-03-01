package src.models;
public abstract class Account {
    private static int STANDARD_AGENCY = 1;
    private static int ID_SEQUENCIAL = 1;
    protected int agency;
    protected int id;
    protected double balance;
    public Account(){
        this.agency = STANDARD_AGENCY;
        this.id = ID_SEQUENCIAL++;
    }

    public int getAgency() {
        return agency;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        this.balance += value;
    }
    public void withdraw(double value){
        this.balance -= value;
    }
    public void transfer(double value, Account account){
        if(this.balance >= value){
            this.withdraw(value);
            account.deposit(value);
        }else
            System.out.println("The operation is not possible: There is not enough balance in the account.");
    }
}
