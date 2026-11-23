package dao;
import java.util.*;
import models.*;
import java.time.LocalDate;

public interface BankingDAO {
    //Employee methods
    public Employee selectEmployeeByName(int empId);
    public Boolean insertIntoEmployees(Employee emp);
    public Boolean updateEmployeeByName(Employee emp);
    public Boolean deleteEmployeeByName(int empId);

    //Customer methods
    public Customer selectCustomerById(int custId);
    public Boolean insertIntoCustomers(Customer cust);
    public Boolean updateCustomer(int custId, Customer cust);
    public Boolean deleteCustomerByName(int custId);
    public Boolean freezeCustomerByName(int custId);

    //BankAccount methods
    public BankAccount selectBankAccountByAccNum(int accNum);
    public Boolean insertIntoBankAccounts(BankAccount acc);
    public Boolean withdraw(int accNum, double amount);
    public Boolean deposit(int accNum, double amount);
    public List<BankAccount> selectBankAccountsByCustId(int custId);
    public Boolean deleteBankAccountByAccNum(int accNum);
    public Boolean deleteBankAccountsByCustId(int custId);
    public Boolean transferFunds(int fromAccNum, int toAccNum, double amount);
    public List<BankAccount> selectSuspiciousAccounts(); //based on account notes

    //Transaction methods
    public Transaction selectTransactionById(int transId);
    public Boolean insertIntoTransactions(Transaction trans);
    public List<Transaction> selectTransactionsByAccNum(int accNum);
    public List<Transaction> selectTransactionsByType(Transaction.TransactionType type);
    public List<Transaction> selectTransactionsByDateRange(LocalDate start, LocalDate end);

    //AccountNote methods
    public AccountNote selectAccountNoteById(int transId);
    public Boolean insertIntoAccountNotes(AccountNote note);
    public List<AccountNote> selectAccountNotesByAccNum(int accNum); //order by newest first
    public List<AccountNote> selectAccountNotesByType(AccountNote.NoteType type); 
    public List<AccountNote> selectAccountNotesByAuthor(int author);
    public List<AccountNote> selectAccountNotesByDateRange(LocalDate start, LocalDate end); 

    //Activity Log methods
    public ActivityLog selectActivityLogById(int logId);
    public Boolean insertIntoActivityLogs(ActivityLog log);
    public List<ActivityLog> selectActivityLogsByEmpId(int empId);
    public List<ActivityLog> selectActivityLogsByAction(String action);
    public List<ActivityLog> selectActivityLogsByDateRange(LocalDate start, LocalDate end);

} 
