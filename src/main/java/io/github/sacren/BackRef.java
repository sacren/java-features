/**
 * BackRef class for regex back reference.
 *
 * <p>Private instance data:
 * -text:String
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
    private String text;
    private String reversed;
    private String tokens;

    /** BackRef constructor. */
    public BackRef() {
        text = "one:two:three:four";
        reverse();
    }

    /** BackRef setter for backward reference. */
    public void reverse() {
        Pattern p = Pattern.compile("(.+):(.+):(.+):(.+)");
        Matcher m = p.matcher(text);
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
            sb.append(String.format("%n"));
            sb.append("Group count: ");
            sb.append(m.groupCount());
            sb.append(String.format("%n%n"));
            for (int i = 0; i < m.groupCount(); i++) {
                sb.append("Group count ");
                sb.append(i);
                sb.append(" :");
                sb.append(m.group(i));
                sb.append(String.format("%n"));
            }
        }
        tokens = sb.toString();
    }

    /** BackRef string method. */
    public String toString() {
        return String.format(
                "Original text: %s%n"
                        + "Reversed text: %s%n%n"
                        + "=== Tokens ===%n%n"
                        + "%s",
                text,
                reversed,
                tokens);
    }
}
