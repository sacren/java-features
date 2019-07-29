/**
 * CharMath class.
 *
 * <p>Character operation through arithmetic.
 *
 * <p>Public methods:
 * +getIncre():StringBuilder
 * +getDecre():StringBuilder
 * +getChars():StringBuilder
 * +toString():String
 */
public class CharMath {
    /* private static data */
    private static final char C1 = '0'; /* initialize character with char */
    private static final char C2 = 'A';

    /** CharMath getter for characters in increment. */
    public StringBuilder getIncre() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%n=== Character increment ===%n%n"));
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        return sb;
    }

    /** CharMath getter for characters in decrement. */
    public StringBuilder getDecre() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%n%n=== Character decrement ===%n%n"));
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            sb.append(ch);
        }
        return sb;
    }

    /** CharMath method to display various characters. */
    public StringBuilder getChars() {
        char c3 = 98; /* initilize character with int */
        c3 -= 44; /* character as int */
        c3 += 44; /* restore original value */
        char c4 = 75;
        c4 = (char) (c4 - 1); /* Promote to int for calculation */
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%n%n=== Characters ===%n%n"));
        sb.append(String.format("%c%n", C1)); /* show '0' by char */
        sb.append(String.format("%c%n", C2)); /* show 'A' by char */
        sb.append(String.format("%c%n", 'A')); /* show 'A' by literal char */
        sb.append(String.format("%c%n", c3)); /* show 'b' by casting char to int */
        sb.append(String.format("%c%n", 74)); /* show 'J' by literal int */
        sb.append(String.format("%c", c4)); /* show 'J' by int operation */
        sb.append(String.format("%n%n=== Characters with cast ===%n%n"));
        sb.append(String.format("%d%n", (int) C1)); /* show integer casting from char */
        sb.append(String.format("%d%n", (int) C2)); /* show integer casting from char */
        sb.append((int) c3); /* show 'b' by char */
        return sb;
    }

    /** CharMath string method. */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(getIncre());
        sb.append(getDecre());
        sb.append(getChars());
        return sb.toString();
    }
}
