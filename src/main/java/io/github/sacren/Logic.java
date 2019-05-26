/**
 * Logic class.
 *
 * <p>Private instance data:
 * -male:boolean
 * -female:boolean
 *
 * <p>Constructor:
 * +Logic()
 *
 * <p>Public methods:
 * +toString():String
 */
public class Logic {
    /* private static data */
    private static final int AGE = 18;
    private static final double WEIGHT = 71.23;
    private static final double HEIGHT = 191;
    private static final boolean MARRIED = false;
    private static final boolean ATTACHED = false;
    private static final char GENDER = 'm';

    /* private instance data */
    private boolean male;
    private boolean female;

    /** Logic constructor. */
    public Logic() {
        male = Character.valueOf(GENDER).equals(Character.valueOf('m'));
        female = Character.valueOf(GENDER).equals(Character.valueOf('f'));
    }

    /** Logic string method. */
    public String toString() {
        return String.format(
                "Age:      %d%n"
                        + "Weight:   %.2f%n"
                        + "Height:   %.2f%n"
                        + "Married:  %B%n"
                        + "Attached: %B%n"
                        + "Gender:   %C%n%n"
                        + "=== Given the facts above, evaluate relational logic ===%n%n"
                        + "Age 18, not married, not attached and male:                 %B%n"
                        + "Married and female:                                         %B%n"
                        + "Height at least 180, weight at least above 65 and below 80: %B%n"
                        + "Height at least above 180 or weight at least above 90:      %B",
                AGE,
                WEIGHT,
                HEIGHT,
                MARRIED,
                ATTACHED,
                GENDER,
                AGE == 18 && !MARRIED && !ATTACHED && male,
                MARRIED && female,
                HEIGHT >= 180 && WEIGHT >= 65 && WEIGHT <= 80,
                HEIGHT >= 180 || WEIGHT >= 90);
    }
}
