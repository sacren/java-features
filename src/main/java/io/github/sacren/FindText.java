/**
 * FindText class.
 *
 * <p>Private instance data:
 * -sb:StringBuilder
 *
 * <p>Constructor:
 * +FindText()
 *
 * <p>Public methods:
 * +search():void
 * +getWord():String
 * +toString():String
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {
    /* private static data */
    private static String TEXT = "This is an apple. These are 33 (thirty-three) apples.";

    /* private instance data */
    private String msg;

    /** FindText constructor. */
    public FindText() {
        search();
    }

    /** FindText setter for match regex. */
    public void search() {
        /* compile regex and allocate a matching engine */
        Pattern p = Pattern.compile("Th");
        Matcher m = p.matcher(TEXT);

        /* test if it finds regex */
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            sb.append("First: \"");
            sb.append(m.group());
            sb.append("\" starting at ");
            sb.append(m.start());
            sb.append(" and ending at ");
            sb.append(m.end());
            sb.append(String.format("%n"));
        }
        /* start all over */
        m.reset();
        while (m.find()) {
            sb.append("Second: \"");
            sb.append(m.group());
            sb.append("\" starting at ");
            sb.append(m.start());
            sb.append(" and ending at ");
            sb.append(m.end());
            sb.append(String.format("%n"));
        }
        /* test if it matches regex */
        if (m.matches()) {
            sb.append("Matches \"");
            sb.append(m.group());
            sb.append("\" starting at ");
            sb.append(m.start());
            sb.append(" and ending at ");
            sb.append(m.end());
            sb.append(String.format("%n"));
        } else {
            sb.append("Matches nothing at all!");
        }
        /* test for lookingAt() */
        sb.append(String.format("%n"));
        if (m.lookingAt()) {
            sb.append("Look for \"");
            sb.append(m.group());
            sb.append("\" starting at ");
            sb.append(m.start());
            sb.append(" and ending at ");
            sb.append(m.end());
        } else {
            sb.append("Found nothing at all!");
        }
        msg = sb.toString();
    }

    /** FindText getter for the word and its index. */
    public String getWord() {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(TEXT);
        while (m.find()) {
            sb.append("\"");
            sb.append(m.group());
            sb.append("\" starting at ");
            sb.append(m.start());
            sb.append(" and ending at ");
            sb.append(m.end());
            sb.append(String.format("%n"));
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /** FindText string mathod. */
    public String toString() {
        return String.format(
                "%s%n%n"
                        + "=== Word and index ===%n%n"
                        + "%s",
                msg,
                getWord());
    }
}
