/**
 * Trio class extends Duo class.
 *
 * <p>We use Trio for 3-D pointers.  Broadly Trio could represent any object
 * that requires conceptual three dimensions.  See Time class for details.
 *
 * <p>Private variable with default value:
 * -thirdDbl:double = 0
 *
 * <p>Constructor:
 * +Trio()
 * +Trio(firstDbl:double, secondDbl:double, thirdDbl:double)
 *
 * <p>Public methods:
 * +getThirdDbl():double
 * +setThird():void
 * +setThird(thirdDbl:double):void
 * +toString():String
 */
public class Trio extends Duo {
    /* private instance variable */
    private double thirdDbl;

    /** Trio default constructor. */
    public Trio() {
        /* super(); */
        /* above implicitly executed for default class */
        setThird();
    }

    /** Trio custom constructor. */
    public Trio(double firstDbl, double secondDbl, double thirdDbl) {
        super(firstDbl, secondDbl);
        setThird(thirdDbl);
    }

    /** Trio setter for default thirdDbl instance variable. */
    public void setThird() {
        thirdDbl = 0;
    }

    /** Trio setter for thirdDbl instance variable. */
    public void setThird(double thirdDbl) {
        this.thirdDbl = thirdDbl;
    }

    /** Trio getter for thirdDbl. */
    public double getThirdDbl() {
        return thirdDbl;
    }

    /** Trio instance formatted string. */
    @Override
    public String toString() {
        return String.format(
                "(%.2f, %.2f, %.2f)",
                getFirstDbl(), getSecondDbl(), thirdDbl);
    }
}
