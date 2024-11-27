import java.util.Calendar;

// Handles withdrawal transactions
public class WithdrawalTransaction extends BaseTransaction {

    // Constructor initializes transaction details
    public WithdrawalTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

     // @throws InsufficientFundsException if balance is insufficient.
    @Override
    public void apply(BankAccount ba) throws InsufficientFundsException {
        if (ba.getBalance() < getAmount()) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        ba.withdraw(getAmount());
        System.out.println("Withdrawal of " + getAmount() + " applied to account.");
    }

    // @return true if reversal succeeds.
    public boolean reverse(BankAccount ba) {
        try {
            ba.deposit(getAmount());
            System.out.println("Withdrawal reversed. Amount restored: " + getAmount());
            return true;
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
