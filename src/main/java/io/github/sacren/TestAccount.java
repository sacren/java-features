/**
 * Test driver for Account.
 */
import static java.lang.System.out;

import java.util.Scanner;

public class TestAccount {
    /** Account test driver. */
    public static void main(String[] args) {
        /* user input */
        Scanner in = new Scanner(System.in);
        int acctNum;
        out.print("Enter the account number: ");
        acctNum = in.nextInt();
        double balance;
        out.print("Enter the balance: ");
        balance = in.nextDouble();
        in.close();
        /* account activities and balance */
        Account defAcct = new Account();
        out.println();
        out.println("=== Default Account ===");
        out.println();
        out.println(defAcct);
        out.println();
        out.println("=== Use getter for default account ===");
        out.println();
        out.printf(
                "Default account number:  %d%n"
                        + "Default account balance: %.2f%n",
                defAcct.getAcctNum(),
                defAcct.getBalance());
        try {
            Account acct = new Account(acctNum, balance);
            out.println();
            out.println("=== Custom Account ===");
            out.println();
            out.println(acct);
            out.println();
            out.println("=== Reset balance to 0 ===");
            out.println();
            acct.setBalance(0);
            out.println(acct);
            out.println();
            out.println("=== Deposit $100.00 ===");
            out.println();
            acct.credit(100);
            out.println(acct);
            out.println();
            out.println("=== Withdraw $98.00 ===");
            out.println();
            try {
                acct.debit(98);
            } catch (IllegalArgumentException ex) {
                out.println(ex.getMessage());
                out.println();
            }
            out.println(acct);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }
}
