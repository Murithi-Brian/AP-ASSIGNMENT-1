import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Create a bank account with initial balance of 1000.0
        BankAccount account = new BankAccount("1234567890", 1000.0);

        // Create a deposit transaction
        Calendar depositDate = Calendar.getInstance();
        DepositTransaction deposit = new DepositTransaction(500.0, depositDate, "DEP001");

        // Apply the deposit transaction
        System.out.println("Before Deposit: Balance = " + account.getBalance());
        deposit.apply(account); // Deposit funds to the account
        deposit.printTransactionDetails(); // Print details of the deposit
        System.out.println("After Deposit: Balance = " + account.getBalance());

        // Create a withdrawal transaction
        Calendar withdrawalDate = Calendar.getInstance();
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(300.0, withdrawalDate, "WDL001");

        // Apply the withdrawal transaction
        System.out.println("\nBefore Withdrawal: Balance = " + account.getBalance());
        withdrawal.apply(account); // Withdraw funds from the account
        withdrawal.printTransactionDetails(); // Print details of the withdrawal
        System.out.println("After Withdrawal: Balance = " + account.getBalance());
    }
}
