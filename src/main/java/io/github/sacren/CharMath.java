/**
 * CharMath class.
 *
 * <p>Character operation through arithmetic.
 *
 * <p>Private instance data:
 * -str:String
 *
 * <p>Constructor:
 * +CharMath()
 *
 * <p>Public methods:
 * +increment():void
 * +decrement():void
 * +show():void
 * +toString():String
 */
public class CharMath {
    /* private instance data */
    private String str;

    /** CharMath constructor. */
    public CharMath() {
        increment();
        decrement();
        show();
    }

    /** CharMath method of character increment. */
    public void increment() {
        str = String.format("%n=== Character increment ===%n%n");
        for (char c = 'a'; c <= 'z'; c++) {
            str += Character.toString(c);
        }
    }

    /** CharMath method of character decrement. */
    public void decrement() {
        str += String.format("%n%n=== Character decrement ===%n%n");
        for (char c = 'Z'; c >= 'A'; c--) {
            str += Character.toString(c);
        }
    }

    /** CharMath method to display various characters. */
    public void show() {
        final char c1 = '0'; /* initialize character with char */
        final char c2 = 'A';
        char c3 = 98; /* initilize character with int */
        c3 -= 44; /* character as int */
        c3 += 44; /* restore original value */
        char c4 = 75;
        c4 = (char) (c4 - 1); /* Promote to int for calculation */
        str += String.format(
                "%n%n=== Characters ===%n%n"
                        + "%c%n" /* show '0' by char */
                        + "%c%n" /* show 'A' by char */
                        + "%c%n" /* show 'A' by literal char */
                        + "%c%n" /* show 'b' by casting char to int */
                        + "%c%n" /* show 'J' by literal int */
                        + "%c" /* show 'J' by int operation */
                        + "%n%n=== Characters with cast ===%n%n"
                        + "%d%n" /* show integer casting from char */
                        + "%d%n" /* show integer casting from char */
                        + "%c", /* show 'b' by char */
                c1,
                c2,
                'A',
                c3,
                74,
                c4,
                (int) c1,
                (int) c2,
                (int) c3);
    }

    /** CharMath instance printout. */
    public String toString() {
        return str;
    }
}
