/**
 * Test driver for Account.
 */
import java.util.Scanner;

public class TestAccount {
    /** Test Account instance. */
    public static void main(String[] args) {
        /* user input */
        Scanner inStream = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int accountNumber = inStream.nextInt();
        System.out.print("Enter the balance: ");
        double balance = inStream.nextDouble();
        inStream.close();
        /* Account instance in action */
        Account account = new Account(accountNumber, balance);
        Account defaultAccount = new Account();
        System.out.println();
        System.out.println("=== Default Account ===");
        System.out.println();
        System.out.println(defaultAccount);
        System.out.println();
        System.out.printf(
                "The default account number is %d%n"
                        + "The default account balance is %.2f%n",
                defaultAccount.getAccountNumber(),
                defaultAccount.getBalance());
        System.out.println();
        System.out.println("=== Custom Account ===");
        System.out.println();
        System.out.println(account);
        System.out.println();
        System.out.printf(
                "The account number is %d%n"
                        + "The balance is %.2f%n",
                account.getAccountNumber(),
                account.getBalance());
        System.out.println();
        System.out.println("=== Reset balance to zero ===");
        System.out.println();
        account.setBalance(0);
        System.out.println(account);
        System.out.println();
        System.out.println("=== Deposit $100.00 ===");
        System.out.println();
        account.credit(100);
        System.out.println(account);
        System.out.println();
        System.out.println("=== Withdraw $101.00 ===");
        System.out.println();
        account.debit(101);
        System.out.println(account);
    }
}
