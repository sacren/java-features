/**
 * Currency class.
 *
 * <p>Private instance data:
 * -fmt:double
 * -locales:Locale[]
 * -gnlFmt:String
 * -curFmt:String
 * -numFmt:String
 * -perFmt:String
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
    private String gnlFmt;
    private String curFmt;
    private String numFmt;
    private String perFmt;
    private String allFmt;

    /** Currency constructor. */
    public Currency() {
        setFmt();
    }

    /** Currency setter for various formats. */
    public void setFmt() {
        boolean once = true;
        StringBuilder generic = new StringBuilder();
        StringBuilder currency = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder percent = new StringBuilder();
        for (Locale loc : locales) {
            if (once) {
                once = false;
            } else {
                generic.append(String.format("%n"));
                currency.append(String.format("%n"));
                number.append(String.format("%n"));
                percent.append(String.format("%n"));
            }
            generic.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getInstance(loc).format(fmt));
            currency.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getCurrencyInstance(loc).format(fmt));
            number.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getNumberInstance(loc).format(fmt));
            percent.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getPercentInstance(loc).format(fmt));
        }
        gnlFmt = generic.toString();
        curFmt = currency.toString();
        numFmt = number.toString();
        perFmt = percent.toString();
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
                "=== Locale for general-purpose number ===%n%n"
                        + "%s%n%n"
                        + "=== Locale for currency ===%n%n"
                        + "%s%n%n"
                        + "=== Locale for number ===%n%n"
                        + "%s%n%n"
                        + "=== Locale for percent ===%n%n"
                        + "%s%n%n"
                        + "=== Locale for currency of available countries ===%n%n"
                        + "%s",
                gnlFmt,
                curFmt,
                numFmt,
                perFmt,
                allFmt);
    }
}
