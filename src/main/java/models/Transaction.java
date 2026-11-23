package models;
import java.time.LocalDate;

public class Transaction {
    public static enum TransactionType {WITHDRAWAL, DEPOSIT};
    private int transId;
    private int accNum;
    private String type;
    private LocalDate date;
    private int amount;
    private int resBalance;

    public Transaction(int transId, int accNum, String type, LocalDate date, int amount, int resBalance){
        this.transId = transId;
        this.accNum = accNum;
        this.type = type;
        this.date = date;
        this.amount = amount;
        this.resBalance = resBalance;
    }

    //Getters and Setters
    public int getTransactionId(){return transId;}    
    public String getTransactionType(){return type;}
    public LocalDate getTransactionDate(){return date;}
    public int getAccountNumber(){return accNum;}
    public int getTransactionAmount(){return amount ;}
    public int getRemainingBalance(){return resBalance;}

    public String toString(){return "Transaction ID: " + transId + ", Account Number: " + accNum + 
    ", Date: " + date + ", Type: " + type  + ", Amount: " + amount + ", Remaining Balance: " + resBalance;}
}
