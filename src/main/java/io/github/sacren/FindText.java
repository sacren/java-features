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
    private static String STR = "This is an apple. These are 33 (thirty-three) apples.";
    private static String REGEX = "Th";

    /* private instance data */
    private StringBuilder sb;

    /** FindText constructor. */
    public FindText() {
        sb = new StringBuilder();
        search();
    }

    /** FindText setter for match regex. */
    public void search() {
        /* compile regex for a Pattern object */
        Pattern pattern = Pattern.compile(REGEX);

        /* allocate a matching engine. */
        Matcher matcher = pattern.matcher(STR);

        /* perform matching */
        while (matcher.find()) {
            sb.append("Found: ");
            sb.append(matcher.group());
            sb.append(String.format("%n"));
        }
    }

    /** FindText string mathod. */
    public String toString() {
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
