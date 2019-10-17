/**
 * Trio class extends Duo class.
 *
 * <p>We use Trio for 3-D pointers.  Broadly Trio could represent any object
 * that requires conceptual three dimensions.  See Time class for details.
 *
 * <p>Private instance variables with default value:
 * -thirdInt:int = 0
 * -thirdDbl:double = 0
 *
 * <p>Constructor:
 * +Trio()
 * +Trio(firstInt:int, secondInt:int, thirdInt:int)
 * +Trio(firstDbl:double, secondDbl:double, thirdDbl:double)
 *
 * <p>Public methods:
 * +setThird():void
 * +setThird(thirdInt:int):void
 * +setThird(thirdDbl:double):void
 * +getThirdInt():int
 * +getThirdDbl():double
 * +toString():String
 */
public class Trio extends Duo {
    /* private instance variables */
    private int thirdInt;
    private double thirdDbl;

    /** Trio default constructor. */
    public Trio() {
        /* super(); */
        /* above implicitly executed for default class */
        setThird();
    }

    /** Trio constructor for int instance variable. */
    public Trio(int firstInt, int secondInt, int thirdInt) {
        super(firstInt, secondInt);
        setThird(thirdInt);
    }

    /** Trio constructor for double instance variable. */
    public Trio(double firstDbl, double secondDbl, double thirdDbl) {
        super(firstDbl, secondDbl);
        setThird(thirdDbl);
    }

    /** Trio setter for default instance variables. */
    public void setThird() {
        thirdInt = 0;
        thirdDbl = 0;
    }

    /** Trio setter for int instance variable. */
    public void setThird(int thirdInt) {
        this.thirdInt = thirdInt;
    }

    /** Trio setter for double instance variable. */
    public void setThird(double thirdDbl) {
        this.thirdDbl = thirdDbl;
    }

    /** Trio getter for int instance variable. */
    public double getThirdInt() {
        return thirdInt;
    }

    /** Trio getter for double instance variable. */
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
