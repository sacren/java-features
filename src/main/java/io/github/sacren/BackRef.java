/**
 * BackRef class for regex back reference.
 *
 * <p>Private instance data:
 * -input1:String
 * -input2:String
 * -reversed:String
 * -tokens:String
 *
 * <p>Constructor:
 * +BackRef()
 *
 * <p>Public methods:
 * +reverse():void
 * +toString():String
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackRef {
    /* private instance data */
    private String input1;
    private String input2;
    private String reversed;
    private String swapped;
    private String tokens;

    /** BackRef constructor. */
    public BackRef() {
        input1 = "one:two:three:four";
        input2 = "apple orange";
        reverse();
        swap();
    }

    /** BackRef setter for backward reference. */
    public void reverse() {
        Pattern p = Pattern.compile("(.+):(.+):(.+):(.+)");
        Matcher m = p.matcher(input1);
        reversed = m.replaceAll("$4+$3+$2+$1");
        /* for all the text */
        m.reset(); /* reset() before find() for the counter */
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            sb.append(m.group());
            sb.append(" starting at ");
            sb.append(m.start());
            sb.append(" and ending at ");
            sb.append(m.end());
            sb.append(String.format("%n%n"));
            sb.append("Group count: ");
            sb.append(m.groupCount());
            sb.append(String.format("%n%n"));
            for (int i = 0; i <= m.groupCount(); i++) {
                sb.append("Group count ");
                sb.append(i);
                sb.append(": subsequence=\"");
                sb.append(m.group(i));
                sb.append("\", start @ ");
                sb.append(m.start(i));
                sb.append(", end @ ");
                sb.append(m.end(i));
                sb.append(String.format("%n"));
            }
        }
        tokens = sb.deleteCharAt(sb.length() - 1).toString();
    }

    /** BackRef method to swap words. */
    public void swap() {
        Pattern p = Pattern.compile("(\\w+) (\\w+)");
        Matcher m = p.matcher(input2);
        swapped = m.replaceFirst("$2 $1");
    }

    /** BackRef string method. */
    public String toString() {
        return String.format(
                "Original text: %s%n"
                        + "Reversed text: %s%n%n"
                        + "Original text: %s%n"
                        + "Replaced text: %s%n%n"
                        + "=== Tokens ===%n%n"
                        + "%s",
                input1,
                reversed,
                input2,
                swapped,
                tokens);
    }
}
