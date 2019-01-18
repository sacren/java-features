/**
 * Ball driver.
 */
import java.util.Arrays;

public class BallDriver {
    /** Instantiate Ball and apply methods. */
    public static void main(String[] args) {
        Ball ball = new Ball(1, 2, 11, 12);
        System.out.print(ball);
        System.out.printf(
                "axisX is %.2f%n"
                        + "axisY is %.2f%n"
                        + "axisXStep is %.2f%n"
                        + "axisYStep is %.2f%n"
                        + "(axisX, axisY) is %s%n"
                        + "(axisXStep, axisYStep) is %s%n",
                ball.getX(),
                ball.getY(),
                ball.getXStep(),
                ball.getYStep(),
                Arrays.toString(ball.getX_Y()),
                Arrays.toString(ball.getXStepYStep()));
        System.out.println();
        System.out.printf("After doubling the positions and incrementing speeds.%n%n");
        ball.setX(ball.getX() * 2);
        ball.setY(ball.getY() * 2);
        ball.setXStep(ball.getXStep() + 1);
        ball.setYStep(ball.getYStep() + 1);
        ball.setX_Y(ball.getX(), ball.getY());
        ball.setXStepYStep(ball.getXStep(), ball.getYStep());
        System.out.print(ball);
        System.out.printf(
                "axisX is %.2f%n"
                        + "axisY is %.2f%n"
                        + "axisXStep is %.2f%n"
                        + "axisYStep is %.2f%n"
                        + "(axisX, axisY) is %s%n"
                        + "(axisXStep, axisYStep) is %s%n",
                ball.getX(),
                ball.getY(),
                ball.getXStep(),
                ball.getYStep(),
                Arrays.toString(ball.getX_Y()),
                Arrays.toString(ball.getXStepYStep()));
        System.out.println();
        System.out.printf("After we make a move.%n%n");
        ball.move();
        System.out.print(ball);
        System.out.println();
        System.out.printf("Make two additional moves.%n%n");
        ball.move().move(); /* effect of chaining */
        System.out.print(ball);
    }
}
