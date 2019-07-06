/**
 * Token class.
 *
 * <p>Private instance data:
 * -week:String
 * -list:String
 * -reversed:String
 *
 * <p>Constructor:
 * +Token()
 *
 * <p>Public methods:
 * +set():void
 * +tokenize():void
 * +toString():String
 */
import java.util.Arrays;
import java.util.StringTokenizer;

public class Token {
    /* private static data */
    private static final String[] WEEK = {
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    };

    /* private instance data */
    private String week;
    private String list;
    private String reversed;

    /** Token constructor. */
    public Token() {
        set();
        tokenize();
    }

    /** Token setter for the string of week names. */
    public void set() {
        StringBuilder sb = new StringBuilder();
        for (String name : WEEK) {
            sb.append(name);
            sb.append(" ");
        }
        week = sb.deleteCharAt(sb.length() - 1).toString();
    }

    /** Token getter for names of the week. */
    public void tokenize() {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringTokenizer st = new StringTokenizer(week);
        StringBuffer token = new StringBuffer();
        while (st.hasMoreTokens()) {
            token.delete(0, token.length());
            token.append(st.nextToken());
            sb1.append(token);
            sb1.append(String.format("%n"));
            sb2.insert(0, String.format("%n"));
            sb2.insert(0, token);
        }
        list = sb1.deleteCharAt(sb1.length() - 1).toString();
        reversed = sb2.deleteCharAt(sb2.length() - 1).toString();
    }

    /** Token getter for the week array in reverse. */
    public String[] getRvsList() {
        return reversed.split(String.format("%n"));
    }

    /** Token string method. */
    public String toString() {
        return String.format(
                "Days of week:%n%n"
                        + "%s%n%n"
                        + "List of days:%n%n"
                        + "%s%n%n"
                        + "Reversed:%n%n"
                        + "%s%n%n"
                        + "Reversed array:%n%n"
                        + "%s",
                week,
                list,
                reversed,
                Arrays.toString(getRvsList()));
    }
}
