/**
 * FindText class for regular expression.
 *
 * <p>Private instance data:
 * -text:String
 *
 * <p>Constructor:
 * +FindText()
 *
 * <p>Public methods:
 * +getRegEx():String
 * +getWord():String
 * +getNum():String
 * +replace():void
 * +toString():String
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {
    /* private instance data */
    private String text;
    private String replaceAll;
    private String replaceFirst;

    /** FindText constructor. */
    public FindText() {
        text = "This is an apple. These are 33 (thirty-three) apples.";
        replace();
    }

    /** FindText getter for match regex. */
    public String getRegEx() {
        /* compile regex and allocate a matching engine */
        Pattern p = Pattern.compile("Th");
        Matcher m = p.matcher(text);

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
        return sb.toString();
    }

    /** FindText getter for the word and its index. */
    public String getWord() {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(text);
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

    /** FindText getter for the number and its index. */
    public String getNum() {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("\\b[1-9][0-9]*\\b");
        Matcher m = p.matcher(text);
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

    /** FindText setter for replaced text. */
    public void replace() {
        Pattern p = Pattern.compile("apple");
        Matcher m = p.matcher(text);
        replaceAll = m.replaceAll("orange");
        replaceFirst = m.replaceFirst("orange");
    }

    /** FindText string mathod. */
    public String toString() {
        return String.format(
                "%s%n%n"
                        + "=== Word and index ===%n%n"
                        + "%s%n%n"
                        + "=== Number and index ===%n%n"
                        + "%s%n%n"
                        + "=== Replace all ===%n%n"
                        + "%s%n"
                        + "%s%n%n"
                        + "=== Replace first ===%n%n"
                        + "%4$s%n"
                        + "%s",
                getRegEx(),
                getWord(),
                getNum(),
                text,
                replaceAll,
                replaceFirst);
    }
}
