/**
 * Currency class.
 *
 * <p>Private instance data:
 * -locales:Locale[]
 *
 * <p>Constructor:
 * +Currency()
 *
 * <p>Public methods:
 * +getNumFmt():String
 * +toString():String
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Currency {
    /* private instance data */
    private Locale[] locales = {
        Locale.US,
        Locale.FRANCE,
        Locale.JAPAN
    };

    /** Currency constructor. */
    public Currency() {
    }

    /** Currency getter for general-purpose number format. */
    public String getNumFmt() {
        boolean once = true;
        StringBuilder sb = new StringBuilder();
        for (Locale loc : locales) {
            if (once) {
                once = false;
            } else {
                sb.append(String.format("%n"));
            }
            sb.append(String.format("%13s: ", loc.getDisplayCountry()))
                .append(NumberFormat.getInstance(loc).format(1234567890.1234));
        }
        return sb.toString();
    }

    /** Currency string method. */
    public String toString() {
        return getNumFmt();
    }
}
