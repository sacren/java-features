/**
 * Currency class.
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

    /** Currency string method. */
    public String toString() {
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
}
