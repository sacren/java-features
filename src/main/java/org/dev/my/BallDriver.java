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
                Arrays.toString(ball.getX_YStep()));
        System.out.println();
        System.out.printf("After doubling all the data.%n%n");
        ball.setX(ball.getX() * 2);
        ball.setY(ball.getY() * 2);
        ball.setXStep(ball.getXStep() * 2);
        ball.setYStep(ball.getYStep() * 2);
        ball.setX_Y(ball.getX(), ball.getY());
        ball.setX_YStep(ball.getXStep(), ball.getYStep());
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
                Arrays.toString(ball.getX_YStep()));
    }
}
