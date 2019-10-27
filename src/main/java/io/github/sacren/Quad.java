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
 * +Quad(firstDbl:double, secondDbl:double, thirdDbl:double, fourthDbl:double)
 *
 * <p>Public methods:
 * +setFourth():void
 * +setFourth(fourthInt:int):void
 * +setFourth(fourthDbl:double):void
 * +getFourthInt():int
 * +getFourthDbl():double
 * +getIntQuad():String
 * +getDblQuad():String
 * +toString():String
 */
public class Quad extends Trio {
    /* private instance variables */
    private int fourthInt;
    private double fourthDbl;

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

    /** Quad constructor for double instance variable. */
    public Quad(double firstDbl, double secondDbl, double thirdDbl, double fourthDbl) {
        super(firstDbl, secondDbl, thirdDbl);
        setFourth(fourthDbl);
    }

    /** Quad setter for default instance variables. */
    public void setFourth() {
        fourthInt = 0;
    }

    /** Quad setter for int instance variable. */
    public void setFourth(int fourthInt) {
        this.fourthInt = fourthInt;
    }

    /** Quad setter for double instance variable. */
    public void setFourth(double fourthDbl) {
        this.fourthDbl = fourthDbl;
    }

    /** Quad getter for int instance variable. */
    public int getFourthInt() {
        return fourthInt;
    }

    /** Quad getter for double instance variable. */
    public double getFourthDbl() {
        return fourthDbl;
    }

    /** Quad getter for int string. */
    public String getIntQuad() {
        return String.format("%s, %02d", getIntTrio(), fourthInt);
    }

    /** Quad getter for double string. */
    public String getDblQuad() {
        return String.format("%s, %.2f", getDblTrio(), fourthDbl);
    }

    /** Quad instance formatted string. */
    @Override
    public String toString() {
        StringBuilder quad = new StringBuilder();
        switch (getWhich()) {
            case 1:
                quad.append("(").append(getIntQuad()).append(")");
                break;
            default:
                quad.append("(").append(getDblQuad()).append(")");
                break;
        }
        return quad.toString();
    }
}
