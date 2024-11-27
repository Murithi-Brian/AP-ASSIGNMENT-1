import java.util.Calendar;

public class DepositTransaction extends BaseTransaction {

    // Constructor to initialize DepositTransaction
    public DepositTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

     // Override the apply method to add deposit functionality
    @Override
    public void apply(BankAccount ba) {
        ba.deposit(amount);
        System.out.println("Deposit of " + amount + " applied to account.");
    }
}
