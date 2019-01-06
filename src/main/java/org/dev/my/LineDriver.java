/**
 * Line driver.
 */
import java.util.Scanner;

public class LineDriver {
    /** Driver executes Line object. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int beginX;
        System.out.print("Enter x-axis for begin point: ");
        beginX = inStream.nextInt();
        int beginY;
        System.out.print("Enter y-axis for begin point: ");
        beginY = inStream.nextInt();
        int endX;
        System.out.print("Enter x-axis for end point: ");
        endX = inStream.nextInt();
        int endY;
        System.out.print("Enter y-axis for end point: ");
        endY = inStream.nextInt();
        inStream.close();
        Point from = new Point(beginX, beginY);
        Point to = new Point(endX, endY);
        Line line = new Line(from, to);
        System.out.printf("%s%n", line);
    }
}
