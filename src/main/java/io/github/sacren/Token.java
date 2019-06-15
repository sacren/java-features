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
        week = sb.delete(sb.length() - 1, sb.length()).toString();
    }

    /** Token getter for names of the week. */
    public void tokenize() {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringTokenizer st = new StringTokenizer(week);
        String token;
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            sb1.append(token);
            sb1.append(String.format("%n"));
            sb2.insert(0, String.format("%n"));
            sb2.insert(0, token);
        }
        list = sb1.delete(sb1.length() - 1, sb1.length()).toString();
        reversed = sb2.delete(sb2.length() - 1, sb2.length()).toString();
    }

    /** Token string method. */
    public String toString() {
        return String.format(
                "Days of week:%n%n"
                        + "%s%n%n"
                        + "List of days:%n%n"
                        + "%s%n%n"
                        + "Reversed:%n%n"
                        + "%s",
                week,
                list,
                reversed);
    }
}
