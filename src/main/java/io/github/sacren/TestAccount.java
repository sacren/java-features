/**
 * Test driver for Account.
 */
import java.util.Scanner;

public class TestAccount {
    /** Account test driver. */
    public static void main(String[] args) {
        /* user input */
        Scanner in = new Scanner(System.in);
        int acctNum;
        System.out.print("Enter the account number: ");
        acctNum = in.nextInt();
        double balance;
        System.out.print("Enter the balance: ");
        balance = in.nextDouble();
        in.close();
        /* account activities and balance */
        Account defAcct = new Account();
        System.out.println();
        System.out.println("=== Default Account ===");
        System.out.println();
        System.out.println(defAcct);
        System.out.println();
        System.out.println("=== Use getter for default account ===");
        System.out.println();
        System.out.printf(
                "Default account number:  %d%n"
                        + "Default account balance: %.2f%n",
                defAcct.getAcctNum(),
                defAcct.getBalance());
        try {
            Account acct = new Account(acctNum, balance);
            System.out.println();
            System.out.println("=== Custom Account ===");
            System.out.println();
            System.out.println(acct);
            System.out.println();
            System.out.println("=== Reset balance to 0 ===");
            System.out.println();
            acct.setBalance(0);
            System.out.println(acct);
            System.out.println();
            System.out.println("=== Deposit $100.00 ===");
            System.out.println();
            acct.credit(100);
            System.out.println(acct);
            System.out.println();
            System.out.println("=== Withdraw $98.00 ===");
            System.out.println();
            try {
                acct.debit(98);
            } catch (IllegalArgumentException ia) {
                System.out.println(ia.getMessage());
                System.out.println();
            }
            System.out.println(acct);
        } catch (IllegalArgumentException ia) {
            ia.printStackTrace();
        }
    }
}
