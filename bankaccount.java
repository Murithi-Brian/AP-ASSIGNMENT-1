// BankAccount class to represent user accounts for transactions
public class BankAccount {
    private String accountNumber; // Unique id for the account
    private double balance; // Current balance of the account

    // Constructor to initialize BankAccount
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    // Method to add funds to the account
    public void deposit(double amount) {
        balance += amount;
    }
    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Method to retrieve the current balance
    public double getBalance() {
        return balance;
    }

    // Method to retrieve the account number
    public String getAccountNumber() {
        return accountNumber;
    }
}
