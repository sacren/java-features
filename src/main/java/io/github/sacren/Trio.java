/**
 * Trio class extends Duo class.
 *
 * <p>We use Trio for 3-D pointers.  Broadly Trio could represent any object
 * that requires conceptual three dimensions.  See Time class for details.
 *
 * <p>Private instance variables with default value:
 * -thirdInt:int = 0
 * -thirdDbl:double
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
 * +trioIntStr():String
 * +trioDblStr():String
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
    public int getThirdInt() {
        return thirdInt;
    }

    /** Trio getter for double instance variable. */
    public double getThirdDbl() {
        return thirdDbl;
    }

    /** Trio method for int string. */
    public String trioIntStr() {
        return String.format("%s, %02d", duoIntStr(), thirdInt);
    }

    /** Trio method for double string. */
    public String trioDblStr() {
        return String.format("%s, %.2f", duoDblStr(), thirdDbl);
    }

    /** Trio instance formatted string. */
    @Override
    public String toString() {
        StringBuilder trio = new StringBuilder();
        switch (getType()) {
            case 1:
                trio.append("(").append(trioIntStr()).append(")");
                break;
            default:
                trio.append("(").append(trioDblStr()).append(")");
                break;
        }
        return trio.toString();
    }
}
