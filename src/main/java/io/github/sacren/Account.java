/**
 * Account class.
 *
 * <p>Private instance data with default values:
 * -acctNum:int = Integer.MAX_VALUE
 * -balance:double = 0.0
 *
 * <p>Constructor:
 * +Account()
 * +Account(acctNum:int, balance:double)
 *
 * <p>Public methods:
 * +getAcctNum():int
 * +setAcctNum(acctNum:int):void
 * +getBalance():double
 * +setBalance(balance:double):void
 * +credit(amount:double):void
 * +debit(amount:double):void
 * +toString():String
 */
public class Account {
    /* private instance data */
    private int acctNum;
    private double balance;

    /** Account default constructor. */
    public Account() {
        this.acctNum = Integer.MAX_VALUE;
        this.balance = 0;
    }

    /** Account custom constructor. */
    public Account(int acctNum, double balance) {
        setAcctNum(acctNum);
        setBalance(balance);
    }

    /** Account getter for account number. */
    public int getAcctNum() {
        return acctNum;
    }

    /** Account setter for account number. */
    public void setAcctNum(int acctNum) {
        if (acctNum <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", acctNum));
        }
        this.acctNum = acctNum;
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

    /** Account setter for credit added to the account. */
    public void credit(double amount) {
        balance += amount;
    }

    /** Account setter for debit withdrawn from the account. */
    public void debit(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException(
                    String.format(
                        "Withdraw %.2f out of balance of %.2f is not allowed!",
                        amount, balance));
        }
        balance -= amount;
    }

    /** Account string method. */
    public String toString() {
        return String.format(
                "Account number: %d%n"
                        + "Balance:        %.2f",
                acctNum,
                balance);
    }
}
