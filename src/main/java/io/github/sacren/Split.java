/**
 * Split class to split string by regex.
 *
 * <p>Private instance data:
 * -input:String
 * -output:String
 *
 * <p>Constructor:
 * +Split()
 *
 * <p>Public methods:
 * +set():void
 * +toString():String
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split {
    /* private instance data */
    private String input;
    private String output;

    /** Split constructor. */
    public Split() {
        input = "This is an apple. These are 33 (thirty-three) apples.";
        set();
    }

    /** Split setter to tokenize string. */
    public void set() {
        StringBuilder sb = new StringBuilder();
        for (String token : input.split("\\W+")) {
            sb.append(token);
            sb.append(String.format("%n"));
        }
        output = sb.deleteCharAt(sb.length() - 1).toString();
    }

    /** Split string method. */
    public String toString() {
        return String.format(
                "%n=== Original text ===%n%n"
                        + "%s%n%n"
                        + "=== After split ===%n%n"
                        + "%s",
                input,
                output);
    }
}
