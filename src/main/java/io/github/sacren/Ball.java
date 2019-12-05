/**
 * Ball class.
 *
 * <p>Private instance variables:
 * -position:Point
 * -speed:Duo
 *
 * <p>Constructor:
 * +Ball(position:Point, speed:Duo)
 *
 * <p>Public methods:
 * +setInitPos(position:Point):void
 * +setInitSpd(speed:Duo):void
 * +getPosX():double
 * +setPosX(posX:double):void
 * +getPosY():double
 * +setPosY(posY:double):void
 * +getSpdX():double
 * +setSpdX(spdX:double):void
 * +getSpdY():double
 * +setSpdY(spdY:double):void
 * +getPosition():Point
 * +getSpeed():Duo
 * +toString():String
 * +move():Ball
 */
public class Ball {
    /* private instance variables */
    private Point position;
    private Duo speed;

    /** Ball constructor by Point. */
    public Ball(Point position, Duo speed) {
        setInitPos(position);
        setInitSpd(speed);
    }

    /** Ball setter for ball initial position. */
    public void setInitPos(Point position) {
        double abscissa = position.getPoint().getFirstDbl();
        double ordinate = position.getPoint().getSecondDbl();
        this.position = new Point(abscissa, ordinate);
    }

    /** Ball setter for ball initial speed. */
    public void setInitSpd(Duo speed) {
        this.speed = new Duo(speed.getFirstDbl(), speed.getSecondDbl());
    }

    /** Ball getter for ball position on X-axis. */
    public double getPosX() {
        return position.getX();
    }

    /** Ball setter for ball position on X-axis. */
    public void setPosX(double posX) {
        position.setX(posX);
    }

    /** Ball getter for ball position on Y-axis. */
    public double getPosY() {
        return position.getY();
    }

    /** Ball setter for position on Y-axis. */
    public void setPosY(double posY) {
        position.setY(posY);
    }

    /** Ball getter for speed on X-axis. */
    public double getSpdX() {
        return speed.getFirstDbl();
    }

    /** Ball setter for speed on X-axis. */
    public void setSpdX(double spdX) {
        speed.setFirst(spdX);
    }

    /** Ball getter for speed on Y-axis. */
    public double getSpdY() {
        return speed.getSecondDbl();
    }

    /** Ball setter for speed on Y-axis. */
    public void setSpdY(double spdY) {
        speed.setSecond(spdY);
    }

    /** Ball getter for the ball position. */
    public Point getPosition() {
        return position;
    }

    /** Ball getter for the ball speed. */
    public Duo getSpeed() {
        return speed;
    }

    /** Ball formatted string. */
    public String toString() {
        return String.format(
                "Position: P%s%n"
                        + "Speed:     %s",
                position,
                speed);
    }

    /**
     * Ball public method for making steps.
     *
     * <p>Move a step by adding speed on X-axis and on Y-axis to the position.
     *
     * <p>Return the updated object for chaining.
     */
    public Ball move() {
        position.setX(getPosX() + getSpdX());
        position.setY(getPosY() + getSpdY());
        return this;
    }
}
