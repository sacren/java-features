/**
 * NumMon class for 1 - 12 for the name of the month in upper case.
 *
 * <p>Private instance data:
 * -num:int
 *
 * <p>Constructor:
 * +NumMon(num:int)
 *
 * <p>Public methods:
 * +getMonth():String
 * +check():void
 * +toString():String
 */
public class NumMon {
    /* private instance data */
    private int num;

    /** NumMon constructor. */
    public NumMon(int num) {
        this.num = num;
        check();
    }

    /** NumMon method to validate the input. */
    public void check() {
        if (num < 1 || num > 12) {
            throw new IllegalArgumentException(
                    String.format(
                        "%d is invalid!", num));
        }
    }

    /** NumMon getter for the name of the month. */
    public String getMonth() {
        String month = "december";
        switch (num) {
            case 1:
                month = "january";
                break;
            case 2:
                month = "february";
                break;
            case 3:
                month = "march";
                break;
            case 4:
                month = "april";
                break;
            case 5:
                month = "may";
                break;
            case 6:
                month = "june";
                break;
            case 7:
                month = "july";
                break;
            case 8:
                month = "august";
                break;
            case 9:
                month = "september";
                break;
            case 10:
                month = "october";
                break;
            case 11:
                month = "november";
                break;
            case 12:
                /* month has been initialized. */
                break;
            default:
                /* Nothing to do. */
        }
        return month.toUpperCase();
    }

    /** NumMon instance string. */
    public String toString() {
        return String.format(
                "Number: %d%n%n"
                        + "Month: %s",
                num,
                getMonth());
    }
}
