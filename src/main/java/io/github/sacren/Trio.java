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
 * +Trio(firstInt:int, secondDbl:double, thirdInt:int)
 * +Trio(firstDbl:double, secondInt:int, thirdInt:int)
 * +Trio(firstDbl:double, secondDbl:double, thirdInt:int)
 * +Trio(firstInt:int, secondInt:int, thirdDbl:double)
 * +Trio(firstInt:int, secondDbl:double, thirdDbl:double)
 * +Trio(firstDbl:double, secondInt:int, thirdDbl:double)
 * +Trio(firstDbl:double, secondDbl:double, thirdDbl:double)
 *
 * <p>Public methods:
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
    private int type;

    /** Trio default constructor. */
    public Trio() {
        /* super(); */
        /* above implicitly executed for default class */
        setThird(0);
    }

    /** Trio constructor for int instance variable. */
    public Trio(int firstInt, int secondInt, int thirdInt) {
        super(firstInt, secondInt);
        setThird(thirdInt);
    }

    /** Trio constructor for int instance variable. */
    public Trio(int firstInt, double secondDbl, int thirdInt) {
        super(firstInt, secondDbl);
        setThird(thirdInt);
    }

    /** Trio constructor for int instance variable. */
    public Trio(double firstDbl, int secondInt, int thirdInt) {
        super(firstDbl, secondInt);
        setThird(thirdInt);
    }

    /** Trio constructor for int instance variable. */
    public Trio(double firstDbl, double secondDbl, int thirdInt) {
        super(firstDbl, secondDbl);
        setThird(thirdInt);
    }

    /** Trio constructor for double instance variable. */
    public Trio(int firstInt, int secondInt, double thirdDbl) {
        super(firstInt, secondInt);
        setThird(thirdDbl);
    }

    /** Trio constructor for double instance variable. */
    public Trio(int firstInt, double secondDbl, double thirdDbl) {
        super(firstInt, secondDbl);
        setThird(thirdDbl);
    }

    /** Trio constructor for double instance variable. */
    public Trio(double firstDbl, int secondInt, double thirdDbl) {
        super(firstDbl, secondInt);
        setThird(thirdDbl);
    }

    /** Trio constructor for double instance variable. */
    public Trio(double firstDbl, double secondDbl, double thirdDbl) {
        super(firstDbl, secondDbl);
        setThird(thirdDbl);
    }

    /** Trio setter for int instance variable. */
    public void setThird(int thirdInt) {
        this.thirdInt = thirdInt;
        type = 0;
    }

    /** Trio setter for double instance variable. */
    public void setThird(double thirdDbl) {
        this.thirdDbl = thirdDbl;
        type = 1;
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
        String duo = super.toString();
        StringBuilder sb = new StringBuilder(duo);
        sb.deleteCharAt(duo.length() - 1);
        return String.format("%s, %d)", sb.toString(), thirdInt);
    }

    /** Trio method for double string. */
    public String trioDblStr() {
        String duo = super.toString();
        StringBuilder sb = new StringBuilder(duo);
        sb.deleteCharAt(duo.length() - 1);
        return String.format("%s, %.2f)", sb.toString(), thirdDbl);
    }

    /** Trio instance formatted string. */
    @Override
    public String toString() {
        StringBuilder trio = new StringBuilder();
        switch (type) {
            case 0:
                trio.append(trioIntStr());
                break;
            case 1:
                trio.append(trioDblStr());
                break;
            default:
                trio.append("Invalid input!");
                break;
        }
        return trio.toString();
    }
}
