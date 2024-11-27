import java.util.Calendar;

// BaseTransaction is the main class implementing TransactionInterface
public class BaseTransaction implements TransactionInterface {
    private double amount; //  amount
    private Calendar date; // Date 
    private String transactionID; // transaction id

    // Constructor to initialize BaseTransaction fields
    public BaseTransaction(double amount, Calendar date, String transactionID) {
        this.amount = amount;
        this.date = date;
        this.transactionID = transactionID;
    }

    // Get the transaction amount
    @Override
    public double getAmount() {
        return amount;
    }

    // Get the transaction date
    @Override
    public Calendar getDate() {
        return date;
    }

    // Get the unique transaction ID
    @Override
    public String getTransactionID() {
        return transactionID;
    }

    // Print transaction details
    @Override
    public void printTransactionDetails() {
        System.out.println("Transaction Details:");
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date.getTime());
    }

    // Base implementation of the apply method (to be overridden by subclasses)
    @Override
    public void apply(BankAccount ba) {
        System.out.println("BaseTransaction applied.");
    }
}
