/**
 * Currency class.
 *
 * <p>Private instance data:
 * -fmt:double
 * -locales:Locale[]
 * -numFmt:String
 * -curFmt:String
 * -intFmt:String
 * -allFmt:String
 *
 * <p>Constructor:
 * +Currency()
 *
 * <p>Public methods:
 * +setFmt():void
 * +toString():String
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Currency {
    /* private instance data */
    private final double fmt = 1234567890.1234;
    private Locale[] locales = {
        Locale.GERMANY,
        Locale.US,
        Locale.ITALY,
        Locale.KOREA,
        Locale.CHINA,
        Locale.FRANCE,
        Locale.JAPAN
    };
    private String numFmt;
    private String curFmt;
    private String intFmt;
    private String allFmt;

    /** Currency constructor. */
    public Currency() {
        setFmt();
    }

    /** Currency setter for various formats. */
    public void setFmt() {
        boolean once = true;
        StringBuilder number = new StringBuilder();
        StringBuilder currency = new StringBuilder();
        StringBuilder integer = new StringBuilder();
        for (Locale loc : locales) {
            if (once) {
                once = false;
            } else {
                number.append(String.format("%n"));
                currency.append(String.format("%n"));
                integer.append(String.format("%n"));
            }
            number.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getInstance(loc).format(fmt));
            currency.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getCurrencyInstance(loc).format(fmt));
            integer.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getIntegerInstance(loc).format((int) fmt));
        }
        numFmt = number.toString();
        curFmt = currency.toString();
        intFmt = integer.toString();
        /* all available locales */
        StringBuilder sb = new StringBuilder();
        once = true;
        for (Locale loc : NumberFormat.getAvailableLocales()) {
            /* skip if no country locale */
            if (loc.getCountry().isEmpty()) {
                continue;
            }
            if (once) {
                once = false;
            } else {
                sb.append(String.format("%n"));
            }
            sb.append(String.format("%22s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getCurrencyInstance(loc).format(fmt));
        }
        allFmt = sb.toString();
    }

    /** Currency string method. */
    public String toString() {
        return String.format(
                "=== Number of locale ===%n%n"
                        + "%s%n%n"
                        + "=== Currency of locale ===%n%n"
                        + "%s%n%n"
                        + "=== Currency of integer locale ===%n%n"
                        + "%s%n%n"
                        + "=== Currency of available locales ===%n%n"
                        + "%s",
                numFmt,
                curFmt,
                intFmt,
                allFmt);
    }
}
