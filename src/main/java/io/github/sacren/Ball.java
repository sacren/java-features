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
 * +getPos():Point
 * +setX_Y(axisX:double, axisY:double):void
 * +getXStepYStep():double[2]
 * +setXStepYStep(axisXStep:double, axisYStep:double):void
 * +toString():String
 * +move():Ball
 */
public class Ball {
    /* private instance data */
    private double axisX;
    private double axisY;
    private double axisXStep;
    private double axisYStep;

    /** Ball custom constructor. */
    public Ball(double axisX, double axisY, double axisXStep, double axisYStep) {
        this.axisX = axisX;
        this.axisY = axisY;
        this.axisXStep = axisXStep;
        this.axisYStep = axisYStep;
    }

    /** Ball getter for axisX. */
    public double getX() {
        return axisX;
    }

    /** Ball setter for axisX. */
    public void setX(double axisX) {
        this.axisX = axisX;
    }

    /** Ball getter for axisY. */
    public double getY() {
        return axisY;
    }

    /** Ball setter for axisY. */
    public void setY(double axisY) {
        this.axisY = axisY;
    }

    /** Ball getter for axisXStep. */
    public double getXStep() {
        return axisXStep;
    }

    /** Ball setter for axisXStep. */
    public void setXStep(double axisXStep) {
        this.axisXStep = axisXStep;
    }

    /** Ball getter for axisYStep. */
    public double getYStep() {
        return axisYStep;
    }

    /** Ball setter for axisYStep. */
    public void setYStep(double axisYStep) {
        this.axisYStep = axisYStep;
    }

    /** Ball getter for the ball position. */
    public Point getPos() {
        return new Point(axisX, axisY);
    }

    /** Ball setter for both axisX and axisY. */
    public void setX_Y(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    /** Ball getter for both axisXStep and axisYStep. */
    public double[] getXStepYStep() {
        double[] doubleArray = new double[2];
        doubleArray[0] = axisXStep;
        doubleArray[1] = axisYStep;
        return doubleArray;
    }

    /** Ball setter for both axisXStep and axisYStep. */
    public void setXStepYStep(double axisXStep, double axisYStep) {
        this.axisXStep = axisXStep;
        this.axisYStep = axisYStep;
    }

    /** Ball instance description. */
    public String toString() {
        return String.format(
                "Ball[Position@(%.2f, %.2f), Speed=(%.2f, %.2f)]",
                axisX, axisY, axisXStep, axisYStep);
    }

    /**
     * Ball public method for making steps.
     *
     * <p>Move a step by increment axisX by axisXStep and axisY by axisYStep.
     *
     * <p>Return this for chaining.
     */
    public Ball move() {
        axisX += axisXStep;
        axisY += axisYStep;
        return this;
    }
}
