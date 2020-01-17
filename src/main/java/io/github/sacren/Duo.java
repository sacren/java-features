/**
 * Duo class for object with a pair of variables.
 *
 * <p>We identify Duo object by (firstVal, secondVal).  Broadly the pair could
 * be used for any object of two variables.  See Pension class for details.
 *
 * <p>Private instance variables with default values:
 * -firstInt:int = 0
 * -secondInt:int = 0
 * -firstDbl:double = 0
 * -secondDbl:double = 0
 * -type:int
 *
 * <p>Constructor:
 * +Duo()
 * +Duo(firstInt:int, secondInt:int)
 * +Duo(firstInt:int, secondDbl:double)
 * +Duo(firstDbl:double, secondInt:int)
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
 * +duoIntStr():String
 * +duoDblStr():String
 * +toString():String
 */
public class Duo {
    /* private instance variables */
    private int firstInt;
    private int secondInt;
    private double firstDbl;
    private double secondDbl;
    private int type;

    /** Duo default constructor. */
    public Duo() {
        setFirst(0);
        setSecond(0);
        type = 0;
    }

    /** Duo constructor for int instance variables. */
    public Duo(int firstInt, int secondInt) {
        setFirst(firstInt);
        setSecond(secondInt);
        type = 0;
    }

    /** Duo constructor with mixed int and double input variables. */
    public Duo(int firstInt, double secondDbl) {
        setFirst(firstInt);
        setSecond(secondDbl);
        type = 1;
    }

    /** Duo constructor with mixed double and int input variables. */
    public Duo(double firstDbl, int secondInt) {
        setFirst(firstDbl);
        setSecond(secondInt);
        type = 2;
    }

    /** Duo constructor for double instance variables. */
    public Duo(double firstDbl, double secondDbl) {
        setFirst(firstDbl);
        setSecond(secondDbl);
        type = 3;
    }

    /** Duo setter for the first int variable. */
    public void setFirst(int firstInt) {
        this.firstInt = firstInt;
    }

    /** Duo setter for the first double variable. */
    public void setFirst(double firstDbl) {
        this.firstDbl = firstDbl;
    }

    /** Duo setter for the second int variable. */
    public void setSecond(int secondInt) {
        this.secondInt = secondInt;
    }

    /** Duo setter for the second double variable . */
    public void setSecond(double secondDbl) {
        this.secondDbl = secondDbl;
    }

    /** Duo getter for the first int variable. */
    public int getFirstInt() {
        return firstInt;
    }

    /** Duo getter for the second int variable. */
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

    /** Duo method for int string. */
    public String duoIntStr() {
        return String.format("%d, %d", firstInt, secondInt);
    }

    /** Duo method for double string. */
    public String duoDblStr() {
        return String.format("%.2f, %.2f", firstDbl, secondDbl);
    }

    /** Duo method for int and double string. */
    public String intDblStr() {
        return String.format("%d, %.2f", firstInt, secondDbl);
    }

    /** Duo method for double and int string. */
    public String dblIntStr() {
        return String.format("%.2f, %d", firstDbl, secondInt);
    }

    /** Duo instance formatted string. */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (type) {
            case 0:
                sb.append("(").append(duoIntStr()).append(")");
                break;
            case 1:
                sb.append("(").append(intDblStr()).append(")");
                break;
            case 2:
                sb.append("(").append(dblIntStr()).append(")");
                break;
            case 3:
                sb.append("(").append(duoDblStr()).append(")");
                break;
            default:
                sb.append("Invalid input!");
                break;
        }
        return sb.toString();
    }
}
