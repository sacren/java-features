/**
 * Account class.
 *
 * <p>Private data with default values:
 * -accountNumber:int = Integer.MAX_VALUE
 * -balance:double = 0.0
 *
 * <p>Constructor:
 * +Account()
 * +Account(accountNumber:int, balance:double)
 *
 * <p>Public methods:
 * +getAccountNumber():int
 * +getBalance():double
 * +setBalance(balance:double):void
 * +credit(amount:double):void
 * +debit(amount:double):void
 * +toString():String
 */
public class Account {
    /* private static data */
    private static final int DEFAULT_ACCOUNT = Integer.MAX_VALUE;
    private static final double DEFAULT_BALANCE = 0;

    /* private instance data */
    private int accountNumber;
    private double balance;

    /** Account default constructor. */
    public Account() {
        this.accountNumber = DEFAULT_ACCOUNT;
        this.balance = DEFAULT_BALANCE;
    }

    /** Account custom constructor. */
    public Account(int accountNumber, double balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    /** Account getter for account number. */
    public int getAccountNumber() {
        return accountNumber;
    }

    /** Account setter for account number. */
    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", accountNumber));
        }
        this.accountNumber = accountNumber;
    }

    /** Account getter for account balance. */
    public double getBalance() {
        return balance;
    }

    /** Account setter for account balance. */
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", balance));
        }
        this.balance = balance;
    }

    /** Account method for credit to the account. */
    public void credit(double amount) {
        balance += amount;
    }

    /** Account method for debit from the account. */
    public void debit(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException(
                    String.format(
                        "Withdraw %.2f out of balance of %.2f is not allowed!",
                        amount, balance));
        }
        balance -= amount;
    }

    /** Account instance printout. */
    public String toString() {
        return String.format(
                "[A/C #%d has balance of %.2f]",
                accountNumber, balance);
    }
}
