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

    /** Ball description. */
    public String toString() {
        return String.format(
                "Ball@(%.2f, %.2f), Speed=(%.2f, %.2f)%n",
                axisX, axisY, axisXStep, axisYStep);
    }
}
