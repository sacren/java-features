/**
 * BackRef class for regex back reference.
 *
 * <p>Private instance data:
 * -input1:String
 * -input2:String
 *
 * <p>Constructor:
 * +BackRef()
 *
 * <p>Public methods:
 * +getReverse():String
 * +getMatches():String
 * +getGroups():String
 * +getSwap():String
 * +toString():String
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackRef {
    /* private instance data */
    private String input1;
    private String input2;

    /** BackRef constructor. */
    public BackRef() {
        input1 = "one:two:three:four";
        input2 = "apple orange";
    }

    /** BackRef setter for backward reference. */
    public String getReverse() {
        Pattern p = Pattern.compile("(.+):(.+):(.+):(.+)");
        Matcher m = p.matcher(input1);
        return m.replaceAll("$4+$3+$2+$1");
    }

    /** BackRef getter for matched text. */
    public String getMatches() {
        Pattern p = Pattern.compile("(.+):(.+):(.+):(.+)");
        Matcher m = p.matcher(input1);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            sb.append(m.group());
            sb.append(" starting at ");
            sb.append(m.start());
            sb.append(" and ending at ");
            sb.append(m.end());
        }
        return sb.toString();
    }

    /** BackRef getter for group info. */
    public String getGroups() {
        Pattern p = Pattern.compile("(.+):(.+):(.+):(.+)");
        Matcher m = p.matcher(input1);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                sb.append("Group ");
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
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    /** BackRef getter for swapped text. */
    public String getSwap() {
        Pattern p = Pattern.compile("(\\w+)(\\W+)(\\w+)");
        Matcher m = p.matcher(input2);
        return m.replaceFirst("$3$2$1");
    }

    /** BackRef string method. */
    public String toString() {
        return String.format(
                "Original text: %s%n"
                        + "Reversed text: %s%n%n"
                        + "Original text: %s%n"
                        + "Swapped text:  %s%n%n"
                        + "=== Matches ===%n%n"
                        + "%s%n%n"
                        + "=== Groups ===%n%n"
                        + "%s",
                input1,
                getReverse(),
                input2,
                getSwap(),
                getMatches(),
                getGroups());
    }
}
