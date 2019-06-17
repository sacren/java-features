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
 * +toString():String
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {
    /* private static data */
    private static String TEXT = "This is an apple. These are 33 (thirty-three) apples.";

    /* private instance data */
    private String match;

    /** FindText constructor. */
    public FindText() {
        search();
    }

    /** FindText setter for match regex. */
    public void search() {
        /* compile regex and allocate a matching engine */
        Pattern p = Pattern.compile("Th");
        Matcher m = p.matcher(TEXT);

        /* test if it matches */
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            sb.append("Found: \"");
            sb.append(m.group());
            sb.append("\" starting at ");
            sb.append(m.start());
            sb.append(" and ending at ");
            sb.append(m.end());
            sb.append(String.format("%n"));
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        match = sb.toString();
    }

    /** FindText string mathod. */
    public String toString() {
        return match;
    }
}
