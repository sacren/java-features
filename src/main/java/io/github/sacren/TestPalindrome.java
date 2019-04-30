/**
 * Test driver for Palindrome class.
 */
import java.util.Scanner;

public class TestPalindrome {
    /** Check if the string is a palindrome. */
    public static void main(String[] args) {
        String usrStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase in palindrome: ");
        usrStr = in.nextLine();
        in.close();
        System.out.println();
        System.out.println("=== Palindrome ===");
        System.out.println();
        System.out.println(new Palindrome(usrStr));
    }
}
