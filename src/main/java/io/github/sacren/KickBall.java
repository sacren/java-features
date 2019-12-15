/**
 * KickBall subclass by Movable interface.
 *
 * <p>Private data:
 * -ball:Point = {10, 20}
 * -kick:Duo = {1, 2}
 *
 * <p>Constructor:
 * +KickBall()
 * +KickBall(ball:Point, kick:Duo)
 *
 * <p>Public methods:
 * +setBall():void
 * +setBall(ball:Point):void
 * +setKick():void
 * +setKick(kick:Duo):void
 * +moveUp():void
 * +movdeDown():void
 * +moveLeft():void
 * +moveRight():void
 * +toString():String
 */
public class KickBall implements Movable {
    /* private instance data */
    private Point ball;
    private Duo kick;

    /** KickBall default constructor. */
    public KickBall() {
        ball = new Point(10, 20);
        kick = new Duo((double) 1, (double) 2);
    }

    /** KickBall custom constructor. */
    public KickBall(Point ball, Duo kick) {
        setBall();
        setBall(ball);
        setKick();
        setKick(kick);
    }

    /** KickBall setter for the ball. */
    public void setBall() {
        ball = new Point(0, 0);
    }

    /** KickBall setter for the ball with parameter. */
    public void setBall(Point ball) {
        double abscissa = ball.getPoint().getFirstDbl();
        double ordinate = ball.getPoint().getSecondDbl();
        this.ball.setPoint(new Duo(abscissa, ordinate));
    }

    /** KickBall setter for the kick. */
    public void setKick() {
        kick = new Duo((double) 0, (double) 0);
    }

    /** KickBall setter for the kick with parameter. */
    public void setKick(Duo kick) {
        this.kick.setFirst(kick.getFirstDbl());
        this.kick.setSecond(kick.getSecondDbl());
    }

    /** KickBall method to move up ball in y-axis direction. */
    @Override
    public void moveUp() {
        double abscissa = ball.getPoint().getFirstDbl();
        double ordinate = ball.getPoint().getSecondDbl() + kick.getSecondDbl();
        ball.setPoint(new Duo(abscissa, ordinate));
    }

    /** KickBall method to move down ball in y-axis direction. */
    @Override
    public void moveDown() {
        double abscissa = ball.getPoint().getFirstDbl();
        double ordinate = ball.getPoint().getSecondDbl() - kick.getSecondDbl();
        ball.setPoint(new Duo(abscissa, ordinate));
    }

    /** KickBall method to move ball left in x-axis direction. */
    @Override
    public void moveLeft() {
        double abscissa = ball.getPoint().getFirstDbl() - kick.getFirstDbl();
        double ordinate = ball.getPoint().getSecondDbl();
        ball.setPoint(new Duo(abscissa, ordinate));
    }

    /** KickBall method to move ball right in x-axis direction. */
    @Override
    public void moveRight() {
        double abscissa = ball.getPoint().getFirstDbl() + kick.getFirstDbl();
        double ordinate = ball.getPoint().getSecondDbl();
        ball.setPoint(new Duo(abscissa, ordinate));
    }

    /** KickBall string method. */
    public String toString() {
        return ball.toString();
    }
}
