/**
 * Currency class.
 *
 * <p>Private instance data:
 * -num:double
 * -locales:Locale[]
 * -fmt:String
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
    private final double num = 1234567890.1234;
    private Locale[] locales = {
        Locale.GERMANY,
        Locale.US,
        Locale.ITALY,
        Locale.KOREA,
        Locale.CHINA,
        Locale.FRANCE,
        Locale.JAPAN
    };
    private String fmt;
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
        NumberFormat f;
        NumberFormat cf;
        NumberFormat nf;
        NumberFormat pf;
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
            f = NumberFormat.getInstance(loc);
            cf = NumberFormat.getCurrencyInstance(loc);
            nf = NumberFormat.getNumberInstance(loc);
            pf = NumberFormat.getPercentInstance(loc);
            generic.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(f.format(num));
            currency.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(cf.format(num));
            number.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(nf.format(num));
            percent.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(pf.format(num));
        }
        fmt = generic.toString();
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
            cf = NumberFormat.getCurrencyInstance(loc);
            sb.append(String.format("%22s: ", loc.getDisplayCountry()))
                .append(cf.format(num));
        }
        allFmt = sb.toString();
    }

    /** Currency string method. */
    public String toString() {
        return String.format(
                "=== Currency format of available countries ===%n%n"
                        + "%s%n%n"
                        + "=== Currency format of selected countries ===%n%n"
                        + "%s%n%n"
                        + "=== Number format of selected countries ===%n%n"
                        + "%s%n%n"
                        + "=== Percent format of selected countries ===%n%n"
                        + "%s%n%n"
                        + "=== General-purpose number format of selected countries ===%n%n"
                        + "%s",
                allFmt,
                curFmt,
                numFmt,
                perFmt,
                fmt);
    }
}
