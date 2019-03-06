/**
 * Test driver for Ball class.
 */
import java.util.Arrays;

public class TestBall {
    /** Test driver for Ball. */
    public static void main(String[] args) {
        Ball ball = new Ball(1, 2, 11, 12);
        System.out.println(ball);
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
        System.out.println("=== Double the positions and increment speeds ===");
        System.out.println();
        ball.setX(ball.getX() * 2);
        ball.setY(ball.getY() * 2);
        ball.setXStep(ball.getXStep() + 1);
        ball.setYStep(ball.getYStep() + 1);
        ball.setX_Y(ball.getX(), ball.getY());
        ball.setXStepYStep(ball.getXStep(), ball.getYStep());
        System.out.println(ball);
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
        System.out.println("=== After we make a move ===");
        System.out.println();
        ball.move();
        System.out.println(ball);
        System.out.println();
        System.out.println("=== Make two additional moves ===");
        System.out.println();
        ball.move().move(); /* effect of chaining */
        System.out.println(ball);
    }
}
