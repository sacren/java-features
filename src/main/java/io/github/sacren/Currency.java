/**
 * Currency class.
 *
 * <p>Private instance data:
 * -locales:Locale[]
 * -fmt:double
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

    /** Currency constructor. */
    public Currency() {
        setFmt();
    }

    /** Currency setter for various formats. */
    public void setFmt() {
        boolean once = true;
        StringBuilder number = new StringBuilder();
        StringBuilder currency = new StringBuilder();
        for (Locale loc : locales) {
            if (once) {
                once = false;
            } else {
                number.append(String.format("%n"));
                currency.append(String.format("%n"));
            }
            number.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getInstance(loc).format(fmt));
            currency.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getCurrencyInstance(loc).format(fmt));
        }
        numFmt = number.toString();
        curFmt = currency.toString();
    }

    /** Currency string method. */
    public String toString() {
        return String.format(
                "=== Number of locale ===%n%n"
                        + "%s%n%n"
                        + "=== Currency of locale ===%n%n"
                        + "%s",
                numFmt,
                curFmt);
    }
}
