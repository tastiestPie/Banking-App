package models;

public class BankAccount {
    public static enum AccountType {CHECKING, SAVINGS};
    private int custId;
    private int accNum;
    private double balance;
    private AccountType type;

    public BankAccount(int accNum, int custId, double balance, AccountType type){
        this.accNum = accNum;
        this.custId = custId;
        this.balance = balance;
        this.type = type;
    }

    //Getters and Setters
    public int getAccountNumber(){return accNum;}
    public double getBalance(){return balance;}
    public void setBalance(double balance){this.balance = balance;}
    public AccountType getType(){return type;}
    public int getCustId(){return custId;}
}
