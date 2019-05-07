/**
 * Test driver for Ball class.
 */
import java.util.Arrays;

public class TestBall {
    /** Ball test driver. */
    public static void main(String[] args) {
        /* instantiate Ball */
        final double axisX = 1;
        final double axisY = 2;
        final double axisXStep = 11;
        final double axisYStep = 12;
        Ball ball = new Ball(axisX, axisY, axisXStep, axisYStep);
        System.out.println();
        System.out.println(ball);
        System.out.println();
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
                ball.getPos(),
                Arrays.toString(ball.getXStepYStep()));
        /* update Ball instance */
        ball.setX(ball.getX() * 2);
        ball.setY(ball.getY() * 2);
        ball.setXStep(ball.getXStep() + 1);
        ball.setYStep(ball.getYStep() + 1);
        ball.setXStepYStep(ball.getXStep(), ball.getYStep());
        System.out.println();
        System.out.println("=== Double the positions and increment speeds ===");
        System.out.println();
        System.out.println(ball);
        System.out.println();
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
                ball.getPos(),
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
