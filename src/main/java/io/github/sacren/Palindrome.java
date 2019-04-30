/**
 * Palindrome class.
 *
 * <p>Private instance data:
 * -usrStr:String
 * -alNum:char[]
 * -reversed:char[]
 *
 * <p>Constructor:
 * +Palindrome(usrStr:String)
 *
 * <p>Public methods:
 * +setSize():void
 * +filter():void
 * +reverse():void
 * +toString():String
 */
import java.util.Arrays;

public class Palindrome {
    /* private instance data */
    private String usrStr;
    private int size;
    private char[] usrArray;
    private char[] alNum;
    private char[] reversed;

    /** Palindrome constructor. */
    public Palindrome(String usrStr) {
        this.usrStr = usrStr;
        usrArray = usrStr.toCharArray();
        setSize();
        alNum = new char[size];
        reversed = new char[size];
        check();
        filter();
        reverse();
    }

    /** Palindrome method for size of alpha numeric characters. */
    public void setSize() {
        size = 0;
        for (char c : usrArray) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                size++;
            }
        }
    }

    /** Palindrome method for alpha numeric array validation. */
    public void check() {
        if (alNum.length == 0) {
            throw new IllegalArgumentException(
                    String.format("\"%s\" is not valid!", usrStr));
        }
    }

    /** Palindrome method for alpha numeric array of string. */
    public void filter() {
        int i = 0;
        for (char c : usrArray) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                alNum[i++] = Character.toUpperCase(c);
            }
        }
    }

    /** Palindrome method for reversed array. */
    public void reverse() {
        int i = 0;
        for (char c : alNum) {
            reversed[size - ++i] = c;
        }
    }

    /** Palindrome instance printout. */
    public String toString() {
        return String.format(
                "\"%s\" is%s a palindrome",
                usrStr,
                Arrays.equals(alNum, reversed) ? "" : " not");
    }
}
