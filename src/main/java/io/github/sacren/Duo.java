/**
 * Duo class for object with a pair of variables.
 *
 * <p>We identify Duo object by (doubleX, doubleY).  Broadly the pair could be
 * used for any object of two variables.  See Pension class for details.
 *
 * <p>Private instance variables with default values:
 * -doubleX:double = 0
 * -doubleY:double = 0
 *
 * <p>Constructor:
 * +Duo()
 * +Duo(doubleX:double, doubleY:double)
 *
 * <p>Public methods:
 * +setX(intX:int):void
 * +setX(doubleX:double):void
 * +setY(intY:int):void
 * +setY(doubleY:double):void
 * +getIntX():int
 * +getIntY():int
 * +getX():double
 * +getY():double
 * +toString():String
 */
public class Duo {
    /* private instance variables */
    private int intX;
    private int intY;
    private double doubleX;
    private double doubleY;

    /** Duo default constructor. */
    public Duo() {
        setX(0);
        setY(0);
    }

    /** Duo custom constructor for int. */
    public Duo(int intX, int intY) {
        setX(intX);
        setY(intY);
    }

    /** Duo custom constructor. */
    public Duo(double doubleX, double doubleY) {
        setX(doubleX);
        setY(doubleY);
    }

    /** Duo setter for integer variable on X-axis. */
    public void setX(int intX) {
        this.intX = intX;
    }

    /** Duo setter for variable on X-axis. */
    public void setX(double doubleX) {
        this.doubleX = doubleX;
    }

    /** Duo setter for integer variable on Y-axis. */
    public void setY(int intY) {
        this.intY = intY;
    }

    /** Duo setter for variable on Y-axis. */
    public void setY(double doubleY) {
        this.doubleY = doubleY;
    }

    /** Duo getter for integer variable on X-axis. */
    public int getIntX() {
        return intX;
    }

    /** Duo getter for integer variable on Y-axis. */
    public int getIntY() {
        return intY;
    }

    /** Duo getter for variable on X-axis. */
    public double getX() {
        return doubleX;
    }

    /** Duo getter for variable on Y-axis. */
    public double getY() {
        return doubleY;
    }

    /** Duo instance formatted string. */
    public String toString() {
        return String.format("(%.2f, %.2f)", doubleX, doubleY);
    }
}
