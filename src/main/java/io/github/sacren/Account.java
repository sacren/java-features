/**
 * Account class for a bank account.
 *
 * <p>Private instance variables with default values:
 * -acctNum:int = Integer.MAX_VALUE
 * -balance:double = 0.0
 *
 * <p>Constructor:
 * +Account()
 * +Account(acctNum:int, balance:double)
 *
 * <p>Public methods:
 * +setAcctNum(acctNum:int):void
 * +setBalance(balance:double):void
 * +getAcctNum():int
 * +getBalance():double
 * +credit(amount:double):void
 * +debit(amount:double):void
 * +transFrom(another:Account, amount:double):void
 * +transTo(another:Account, amount:double):void
 * +toString():String
 */
public class Account {
    /* private instance variables */
    private int acctNum;
    private double balance;

    /** Account default constructor. */
    public Account() {
        this(Integer.MAX_VALUE, 0);
    }

    /** Account custom constructor. */
    public Account(int acctNum, double balance) {
        setAcctNum(acctNum);
        setBalance(balance);
    }

    /** Account setter for account number. */
    public void setAcctNum(int acctNum) {
        if (acctNum <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", acctNum));
        }
        this.acctNum = acctNum;
    }

    /** Account setter for account balance. */
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", balance));
        }
        this.balance = balance;
    }

    /** Account getter for account number. */
    public int getAcctNum() {
        return acctNum;
    }

    /** Account getter for account balance. */
    public double getBalance() {
        return balance;
    }

    /** Account method credits to the account. */
    public void credit(double amount) {
        balance += amount;
    }

    /** Account method debits from the account. */
    public void debit(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException(
                    String.format(
                        "Withdraw %.2f out of balance of %.2f is not allowed!",
                        amount, balance));
        }
        balance -= amount;
    }

    /** Account method transfers amount from another account. */
    public void transFrom(Account another, double amount) {
        another.debit(amount);
        credit(amount);
    }

    /** Account method transfers amount to another account. */
    public void transTo(Account another, double amount) {
        debit(amount);
        another.credit(amount);
    }

    /** Account instance formatted string. */
    public String toString() {
        return String.format(
                "Account number: %d%n"
                        + "Balance:        %.2f",
                acctNum,
                balance);
    }
}
