/**
 * Driver for Account.
 */
import java.util.Scanner;

public class AccountDriver {
    /** Prompt the user for account number and balance. List account number and balance. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int accountNumber = inStream.nextInt();
        System.out.print("Enter the balance: ");
        double balance = inStream.nextDouble();
        inStream.close();
        try {
            checkInput(accountNumber);
            checkInput(balance);
            listAccount(accountNumber, balance);
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }
    }

    private static void checkInput(double value) throws NegativeValueException {
        if (value < 0) {
            throw new NegativeValueException(
                    String.format("%f invokes exception!", value));
        }
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
    }
}
