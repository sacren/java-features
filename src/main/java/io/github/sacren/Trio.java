/**
 * Trio class extends Duo class.
 *
 * <p>Broadly Trio object could represent any data structure that contains
 * conceptual three elements.  See Time class for details.
 *
 * <p>Private instance variables:
 * -thirdInt:int
 * -thirdDbl:double
 * -type:int
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
 * +toString():String
 */
public class Trio extends Duo {
    /* private instance variables */
    private int thirdInt;
    private double thirdDbl;
    private int type;

    /** Trio default constructor. */
    public Trio() {
        /* super();      */
        /* thirdInt = 0; */
        /* thirdDbl = 0; */
        /* type     = 0; */
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

    /** Trio instance formatted string. */
    @Override
    public String toString() {
        String duo = super.toString();
        int len = duo.length();
        StringBuilder sb = new StringBuilder(duo);
        sb.deleteCharAt(len - 1);
        switch (type) {
            case 0:
                sb.append(String.format(", %d)", thirdInt));
                break;
            case 1:
                sb.append(String.format(", %.2f)", thirdDbl));
                break;
            default:
                sb.replace(0, len, "Invalid input!");
                break;
        }
        return sb.toString();
    }
}
