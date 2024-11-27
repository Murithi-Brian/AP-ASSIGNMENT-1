public interface TransactionInterface {
    double getAmount();
    Calendar getDate();
    String getTransactionID();
    void printTransactionDetails();
    void apply(BankAccount ba);
}
