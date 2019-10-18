/**
 * Trio class extends Duo class.
 *
 * <p>We use Trio for 3-D pointers.  Broadly Trio could represent any object
 * that requires conceptual three dimensions.  See Time class for details.
 *
 * <p>Private instance variables with default value:
 * -thirdInt:int = 0
 * -thirdDbl:double
 * -which:int
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
 * +getIntTrio():String
 * +getDblTrio():String
 * +toString():String
 */
public class Trio extends Duo {
    /* private instance variables */
    private int thirdInt;
    private double thirdDbl;
    private int which;

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
        which = 1;
    }

    /** Trio setter for int instance variable. */
    public void setThird(int thirdInt) {
        this.thirdInt = thirdInt;
        which = 1;
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

    /** Trio getter for int string. */
    public String getIntTrio() {
        return String.format("%s, %02d", getIntDuo(), thirdInt);
    }

    /** Trio getter for double string. */
    public String getDblTrio() {
        return String.format("%s, %.2f", getDblDuo(), thirdDbl);
    }

    /** Trio instance formatted string. */
    @Override
    public String toString() {
        StringBuilder trio = new StringBuilder();
        switch (which) {
            case 1:
                trio.append("(").append(getIntTrio()).append(")");
                break;
            default:
                trio.append("(").append(getDblTrio()).append(")");
                break;
        }
        return trio.toString();
    }
}
