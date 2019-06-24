/**
 * UseDelim class.
 *
 * <p>Private instance data:
 * -source:String
 * -output:String
 *
 * <p>Constructor:
 * +UseDelim()
 *
 * <p>Public methods:
 * +delim():void
 * +toString():String
 */
import java.util.Scanner;

public class UseDelim {
    /* private instance data */
    private String source;
    private String output;

    /** UseDelim constructor. */
    public UseDelim() {
        source = "There are thirty-three big-apples";
        delim();
    }

    /** UseDelim setter to tokenize stream. */
    public void delim() {
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(source);
        in.useDelimiter("\\W+");
        while (in.hasNext()) {
            sb.append(in.next());
            sb.append(String.format("%n"));
        }
        output = sb.deleteCharAt(sb.length() - 1).toString();
    }

    /** UseDelim string method. */
    public String toString() {
        return String.format(
                "%n=== Original text ===%n%n"
                        + "%s%n%n"
                        + "=== Through scanner ===%n%n"
                        + "%s",
                source,
                output);
    }
}
