/**
 * Ball class.
 *
 * <p>Private data with default values:
 * -axisX:double
 * -axisY:double
 * -axisXStep:double
 * -axisYStep:double
 *
 * <p>Constructor:
 * +Ball(axisX:double, axisY:double, axisXStep:double, axisYStep:double)
 *
 * <p>Public methods:
 * +getX():double
 * +setX(axisX:double):void
 * +getY():double
 * +setY(axisY:double):void
 * +getXStep():double
 * +setXStep(axisXStep:double):void
 * +getYStep():double
 * +setYStep(axisYStep:double):void
 * +getX_Y():double[2]
 * +setX_Y(axisX:double, axisY:double):void
 * +getX_YStep():double[2]
 * +setX_YStep(axisXStep:double, axisYStep:double):void
 * +toString():String
 */
public class Ball {
    /* private instance data */
    private double axisX;
    private double axisY;
    private double axisXStep;
    private double axisYStep;

    /** Custom constructor. */
    public Ball(double axisX, double axisY, double axisXStep, double axisYStep) {
        this.axisX = axisX;
        this.axisY = axisY;
        this.axisXStep = axisXStep;
        this.axisYStep = axisYStep;
    }

    /** getter for axisX. */
    public double getX() {
        return axisX;
    }

    /** setter for axisX. */
    public void setX(double axisX) {
        this.axisX = axisX;
    }

    /** getter for axisY. */
    public double getY() {
        return axisY;
    }

    /** setter for axisY. */
    public void setY(double axisY) {
        this.axisY = axisY;
    }

    /** getter for axisXStep. */
    public double getXStep() {
        return axisXStep;
    }

    /** setter for axisXStep. */
    public void setXStep(double axisXStep) {
        this.axisXStep = axisXStep;
    }

    /** getter for axisYStep. */
    public double getYStep() {
        return axisYStep;
    }

    /** setter for axisYStep. */
    public void setYStep(double axisYStep) {
        this.axisYStep = axisYStep;
    }

    /** getter for both axisX and axisY. */
    public double[] getX_Y() {
        double[] doubleArray = new double[2];
        doubleArray[0] = axisX;
        doubleArray[1] = axisY;
        return doubleArray;
    }

    /** setter for both axisX and axisY. */
    public void setX_Y(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    /** getter for both axisXStep and axisYStep. */
    public double[] getX_YStep() {
        double[] doubleArray = new double[2];
        doubleArray[0] = axisXStep;
        doubleArray[1] = axisYStep;
        return doubleArray;
    }

    /** setter for both axisXStep and axisYStep. */
    public void setX_YStep(double axisXStep, double axisYStep) {
        this.axisXStep = axisXStep;
        this.axisYStep = axisYStep;
    }

    /** Ball description. */
    public String toString() {
        return String.format(
                "Ball@(%.2f, %.2f), Speed=(%.2f, %.2f)%n",
                axisX, axisY, axisXStep, axisYStep);
    }
}
