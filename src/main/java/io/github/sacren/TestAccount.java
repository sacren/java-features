/**
 * Test driver for Account.
 */
import java.util.Scanner;

public class TestAccount {
    /** Prompt the user for account number and balance. List account number and balance. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int accountNumber = inStream.nextInt();
        System.out.print("Enter the balance: ");
        double balance = inStream.nextDouble();
        inStream.close();
        listAccount(accountNumber, balance);
    }

    private static void listAccount(int accountNumber, double balance) {
        Account account = new Account(accountNumber, balance);
        Account defaultAccount = new Account();
        System.out.println();
        System.out.print(defaultAccount);
        System.out.printf(
                "The default account number is %d%n"
                        + "The default account balance is %.2f%n",
                defaultAccount.getAccountNumber(), defaultAccount.getBalance());
        System.out.println();
        System.out.print(account);
        System.out.printf(
                "The account number is %d%n"
                        + "The balance is %.2f%n",
                account.getAccountNumber(), account.getBalance());
        System.out.println();
        System.out.printf("Reset balance to zero:%n");
        account.setBalance(0);
        System.out.print(account);
        System.out.println();
        System.out.printf("Deposit $100.00:%n");
        account.credit(100);
        System.out.print(account);
        System.out.println();
        System.out.printf("Withdraw $101.00:%n");
        account.debit(101);
        System.out.print(account);
    }
}
