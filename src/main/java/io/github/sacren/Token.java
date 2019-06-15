/**
 * Token class.
 *
 * <p>Private instance data:
 * -week:String
 *
 * <p>Constructor:
 * +Token()
 *
 * <p>Public methods:
 * +set():void
 * +getToken():String
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

    /** Token constructor. */
    public Token() {
        set();
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
    public String getToken() {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(week);
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
            sb.append(String.format("%n"));
        }
        return sb.delete(sb.length() - 1, sb.length()).toString();
    }

    /** Token string method. */
    public String toString() {
        return String.format(
                "Days of week:%n%n"
                        + "%s%n%n"
                        + "List of days:%n%n"
                        + "%s",
                week,
                getToken());
    }
}
