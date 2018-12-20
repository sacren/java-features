/**
 * Driver for Account.
 */
import java.util.Scanner;

public class AccountDriver {
    /** Prompt the user for account number and balance. List account number and balance. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int accountNumber;
        for ( ; ; ) {
            System.out.print("Enter the account number: ");
            accountNumber = inStream.nextInt();
            if (accountNumber > 0) {
                break;
            }
            System.out.printf("\"%d\" is invalid. Try again.%n", accountNumber);
        }
        double balance;
        for ( ; ; ) {
            System.out.print("Enter the balance: ");
            balance = inStream.nextDouble();
            if (balance >= 0) {
                break;
            }
            System.out.printf("\"%f\" is invalid. Try again.%n", balance);
        }
        inStream.close();
        Account account = new Account(accountNumber, balance);
        Account defaultAccount = new Account();
        System.out.println();
        System.out.print(defaultAccount);
        System.out.println(":");
        System.out.printf(
                "The default account number is %d%n"
                        + "The default account balance is %.2f%n",
                defaultAccount.getAccountNumber(), defaultAccount.getBalance());
        System.out.println();
        System.out.print(account);
        System.out.println(":");
        System.out.printf(
                "The account number is %d%n"
                        + "The balance is %.2f%n",
                account.getAccountNumber(), account.getBalance());
    }
}
