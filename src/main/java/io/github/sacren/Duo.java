/**
 * Duo class for object with a pair of variables.
 *
 * <p>We identify Duo object by (firstDbl, secondDbl).  Broadly the pair could be
 * used for any object of two variables.  See Pension class for details.
 *
 * <p>Private instance variables with default values:
 * -firstInt:int = 0
 * -secondInt:int = 0
 * -firstDbl:double
 * -secondDbl:double
 *
 * <p>Constructor:
 * +Duo()
 * +Duo(firstInt:int, secondInt:int)
 * +Duo(firstDbl:double, secondDbl:double)
 *
 * <p>Public methods:
 * +setFirst(firstInt:int):void
 * +setFirst(firstDbl:double):void
 * +setSecond(secondInt:int):void
 * +setSecond(secondDbl:double):void
 * +getFirstInt():int
 * +getSecondInt():int
 * +getFirstDbl():double
 * +getSecondDbl():double
 * +getIntDuo():String
 * +getDoubleDuo():String
 * +toString():String
 */
public class Duo {
    /* private instance variables */
    private int firstInt;
    private int secondInt;
    private double firstDbl;
    private double secondDbl;
    private int which;

    /** Duo default constructor. */
    public Duo() {
        setFirst(0);
        setSecond(0);
    }

    /** Duo custom constructor for int instance variables. */
    public Duo(int firstInt, int secondInt) {
        setFirst(firstInt);
        setSecond(secondInt);
        which = 1;
    }

    /** Duo custom constructor for double instance variables. */
    public Duo(double firstDbl, double secondDbl) {
        setFirst(firstDbl);
        setSecond(secondDbl);
        which = 0;
    }

    /** Duo setter for the first integer variable. */
    public void setFirst(int firstInt) {
        this.firstInt = firstInt;
    }

    /** Duo setter for the first double variable. */
    public void setFirst(double firstDbl) {
        this.firstDbl = firstDbl;
    }

    /** Duo setter for integer variable on Y-axis. */
    public void setSecond(int secondInt) {
        this.secondInt = secondInt;
    }

    /** Duo setter for variable on Y-axis. */
    public void setSecond(double secondDbl) {
        this.secondDbl = secondDbl;
    }

    /** Duo getter for the first integer variable. */
    public int getFirstInt() {
        return firstInt;
    }

    /** Duo getter for the second integer variable. */
    public int getSecondInt() {
        return secondInt;
    }

    /** Duo getter for the first double variable. */
    public double getFirstDbl() {
        return firstDbl;
    }

    /** Duo getter for the second double variable. */
    public double getSecondDbl() {
        return secondDbl;
    }

    /** Duo getter for integer string. */
    public String getIntDuo() {
        return String.format("(%02d, %02d)", firstInt, secondInt);
    }

    /** Duo getter for double string. */
    public String getDoubleDuo() {
        return String.format("(%.2f, %.2f)", firstDbl, secondDbl);
    }

    /** Duo instance formatted string. */
    public String toString() {
        StringBuilder duo = new StringBuilder();
        switch (which) {
            case 1:
                duo.append(getIntDuo());
                break;
            default:
                duo.append(getDoubleDuo());
                break;
        }
        return duo.toString();
    }
}
