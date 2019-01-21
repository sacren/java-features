/**
 * Account class
 *
 * <p>Private data with default values:
 * -accountNumber:int = Integer.MAX_VALUE
 * -balance:double = 0.0
 *
 * <p>Constructor:
 * +Account()
 * +Account(accountNumber:int)
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
    /* public static data */
    public static final int DEFAULT_ACCOUNT = Integer.MAX_VALUE;
    public static final double DEFAULT_BALANCE = 0;

    /* private instance data */
    private int accountNumber;
    private double balance;

    /** Default constructor. */
    public Account() {
        this.accountNumber = DEFAULT_ACCOUNT;
        this.balance = DEFAULT_BALANCE;
    }

    /** Custom constructor. */
    public Account(int accountNumber, double balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    /** Public accessor for account number. */
    public int getAccountNumber() {
        return accountNumber;
    }

    /** Public mutator for account number. */
    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", accountNumber));
        }
        this.accountNumber = accountNumber;
    }

    /** Public accessor for account balance. */
    public double getBalance() {
        return balance;
    }

    /** Public mutator for account balance. */
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", balance));
        }
        this.balance = balance;
    }

    /** Public method for credit to account. */
    public void credit(double amount) {
        balance += amount;
    }

    /** Public method for debit from account. */
    public void debit(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException(
                    String.format(
                        "Debit %.2f out of %.2f is not allowed!",
                        amount, balance));
        }
        balance -= amount;
    }

    /** Account description. */
    public String toString() {
        return String.format("[A/C #: %d, Balance: %.2f]%n", accountNumber, balance);
    }
}
