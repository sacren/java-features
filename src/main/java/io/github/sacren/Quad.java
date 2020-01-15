/**
 * Quad class extends Trio class.
 *
 * <p>Broadly Quad could represent any object that contains conceptual four
 * elements.
 *
 * <p>Private instance variables with default value:
 * -fourthInt:int = 0
 * -fourthDbl:double
 *
 * <p>Constructor:
 * +Quad()
 * +Quad(firstInt:int, secondInt:int, thirdInt:int, fourthInt:int)
 * +Quad(firstInt:int, secondDbl:double, thirdInt:int, fourthInt:int)
 * +Quad(firstInt:int, secondInt:int, thirdDbl:double, fourthInt:int)
 * +Quad(firstInt:int, secondDbl:double, thirdDbl:double, fourthInt:int)
 * +Quad(firstDbl:double, secondInt:int, thirdInt:int, fourthInt:int)
 * +Quad(firstDbl:double, secondDbl:double, thirdInt:int, fourthInt:int)
 * +Quad(firstDbl:double, secondInt:int, thirdDbl:double, fourthInt:int)
 * +Quad(firstDbl:double, secondDbl:double, thirdDbl:double, fourthInt:int)
 * +Quad(firstInt:int, secondInt:int, thirdInt:int, fourthDbl:double)
 * +Quad(firstInt:int, secondDbl:double, thirdInt:int, fourthDbl:double)
 * +Quad(firstInt:int, secondInt:int, thirdDbl:double, fourthDbl:double)
 * +Quad(firstInt:int, secondDbl:double, thirdDbl:double, fourthDbl:double)
 * +Quad(firstDbl:double, secondInt:int, thirdInt:int, fourthDbl:double)
 * +Quad(firstDbl:double, secondDbl:double, thirdInt:int, fourthDbl:double)
 * +Quad(firstDbl:double, secondInt:int, thirdDbl:double, fourthDbl:double)
 * +Quad(firstDbl:double, secondDbl:double, thirdDbl:double, fourthDbl:double)
 *
 * <p>Public methods:
 * +setFourth():void
 * +setFourth(fourthInt:int):void
 * +setFourth(fourthDbl:double):void
 * +getFourthInt():int
 * +getFourthDbl():double
 * +toString():String
 */
public class Quad extends Trio {
    /* private instance variables */
    private int fourthInt;
    private double fourthDbl;
    private int type;

    /** Quad default constructor. */
    public Quad() {
        /* super(); */
        /* above implicitly executed for default class */
        setFourth();
    }

    /** Quad constructor for int instance variable. */
    public Quad(int firstInt, int secondInt, int thirdInt, int fourthInt) {
        super(firstInt, secondInt, thirdInt);
        setFourth(fourthInt);
    }

    /** Quad constructor for int instance variable. */
    public Quad(int firstInt, double secondDbl, int thirdInt, int fourthInt) {
        super(firstInt, secondDbl, thirdInt);
        setFourth(fourthInt);
    }

    /** Quad constructor for int instance variable. */
    public Quad(int firstInt, int secondInt, double thirdDbl, int fourthInt) {
        super(firstInt, secondInt, thirdDbl);
        setFourth(fourthInt);
    }

    /** Quad constructor for int instance variable. */
    public Quad(int firstInt, double secondDbl, double thirdDbl, int fourthInt) {
        super(firstInt, secondDbl, thirdDbl);
        setFourth(fourthInt);
    }

    /** Quad constructor for int instance variable. */
    public Quad(double firstDbl, int secondInt, int thirdInt, int fourthInt) {
        super(firstDbl, secondInt, thirdInt);
        setFourth(fourthInt);
    }

    /** Quad constructor for int instance variable. */
    public Quad(double firstDbl, double secondDbl, int thirdInt, int fourthInt) {
        super(firstDbl, secondDbl, thirdInt);
        setFourth(fourthInt);
    }

    /** Quad constructor for int instance variable. */
    public Quad(double firstDbl, int secondInt, double thirdDbl, int fourthInt) {
        super(firstDbl, secondInt, thirdDbl);
        setFourth(fourthInt);
    }

    /** Quad constructor for int instance variable. */
    public Quad(double firstDbl, double secondDbl, double thirdDbl, int fourthInt) {
        super(firstDbl, secondDbl, thirdDbl);
        setFourth(fourthInt);
    }

    /** Quad constructor for double instance variable. */
    public Quad(int firstInt, int secondInt, int thirdInt, double fourthDbl) {
        super(firstInt, secondInt, thirdInt);
        setFourth(fourthDbl);
    }

    /** Quad constructor for double instance variable. */
    public Quad(int firstInt, double secondDbl, int thirdInt, double fourthDbl) {
        super(firstInt, secondDbl, thirdInt);
        setFourth(fourthDbl);
    }

    /** Quad constructor for double instance variable. */
    public Quad(int firstInt, int secondInt, double thirdDbl, double fourthDbl) {
        super(firstInt, secondInt, thirdDbl);
        setFourth(fourthDbl);
    }

    /** Quad constructor for double instance variable. */
    public Quad(int firstInt, double secondDbl, double thirdDbl, double fourthDbl) {
        super(firstInt, secondDbl, thirdDbl);
        setFourth(fourthDbl);
    }

    /** Quad constructor for double instance variable. */
    public Quad(double firstDbl, int secondInt, int thirdInt, double fourthDbl) {
        super(firstDbl, secondInt, thirdInt);
        setFourth(fourthDbl);
    }

    /** Quad constructor for double instance variable. */
    public Quad(double firstDbl, double secondDbl, int thirdInt, double fourthDbl) {
        super(firstDbl, secondDbl, thirdInt);
        setFourth(fourthDbl);
    }

    /** Quad constructor for double instance variable. */
    public Quad(double firstDbl, int secondInt, double thirdDbl, double fourthDbl) {
        super(firstDbl, secondInt, thirdDbl);
        setFourth(fourthDbl);
    }

    /** Quad constructor for double instance variable. */
    public Quad(double firstDbl, double secondDbl, double thirdDbl, double fourthDbl) {
        super(firstDbl, secondDbl, thirdDbl);
        setFourth(fourthDbl);
    }

    /** Quad setter for default instance variables. */
    public void setFourth() {
        fourthInt = 0;
        type = 0;
    }

    /** Quad setter for int instance variable. */
    public void setFourth(int fourthInt) {
        this.fourthInt = fourthInt;
        type = 0;
    }

    /** Quad setter for double instance variable. */
    public void setFourth(double fourthDbl) {
        this.fourthDbl = fourthDbl;
        type = 1;
    }

    /** Quad getter for int instance variable. */
    public int getFourthInt() {
        return fourthInt;
    }

    /** Quad getter for double instance variable. */
    public double getFourthDbl() {
        return fourthDbl;
    }

    /** Quad instance formatted string. */
    @Override
    public String toString() {
        String trio = super.toString();
        int len = trio.length();
        StringBuilder sb = new StringBuilder(trio);
        sb.deleteCharAt(len - 1);
        switch (type) {
            case 0:
                sb.append(String.format(", %d)", fourthInt));
                break;
            case 1:
                sb.append(String.format(", %.2f)", fourthDbl));
                break;
            default:
                sb.delete(0, len).append("Invalid input!");
                break;
        }
        return sb.toString();
    }
}
