/**
 * Account class
 *
 * <p>Private data with default values:
 * -accountNumber:int
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

    /* default constructor */
    public Account() {
        this.accountNumber = DEFAULT_ACCOUNT;
        this.balance = DEFAULT_BALANCE;
    }

    /* custom constructor */
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /** Public accessor for account number. */
    public int getAccountNumber() {
        return accountNumber;
    }

    /** Public accessor for account balance. */
    public double getBalance() {
        return balance;
    }

    /** Public mutator for account balance. */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** Public method for credit to account. */
    public void credit(double amount) {
        balance += amount;
    }

    /** Public method for debit from account. */
    public void debit(double amount) {
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("Not enough balance!");
        }
    }

    /** Account description. */
    public String toString() {
        return "Account[accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}
