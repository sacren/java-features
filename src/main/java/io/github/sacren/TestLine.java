/**
 * Test driver for Line class.
 */
import java.util.Scanner;

public class TestLine {
    /** Line test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double beginX;
        System.out.print("Enter X-axis for begin point: ");
        beginX = in.nextDouble();
        double beginY;
        System.out.print("Enter Y-axis for begin point: ");
        beginY = in.nextDouble();
        double endX;
        System.out.print("Enter X-axis for end point: ");
        endX = in.nextDouble();
        double endY;
        System.out.print("Enter Y-axis for end point: ");
        endY = in.nextDouble();
        in.close();
        /* use 4 numbers for Line instance */
        System.out.println();
        System.out.println("=== Line by 4 numbers ===");
        System.out.println();
        Line line1 = new Line(beginX, beginY, endX, endY);
        System.out.println(line1);
        /* reset line points to 0's and 1's. */
        line1.setPoints(new Point(0, 0), new Point(1, 1));
        System.out.println();
        System.out.println("=== Reset points to 0's and 1's ===");
        System.out.println();
        System.out.println(line1);
        /* use points for Line instance */
        System.out.println();
        System.out.println("=== Line by 2 points ===");
        System.out.println();
        Point begin = new Point(beginX, beginY);
        Point end = new Point(endX, endY);
        Line line2 = new Line(begin, end);
        System.out.println(line2);
        /* update line points. */
        beginX = line2.getBegin().getX() + 1;
        beginY = line2.getBegin().getY() - 1;
        endX = line2.getEnd().getX() - 1;
        endY = line2.getEnd().getY() + 1;
        line2.setPoints(new Point(beginX, beginY), new Point(endX, endY));
        System.out.println();
        System.out.println("=== Update line points ===");
        System.out.println();
        System.out.println(line2);
        /* reset line points to 1's and 0's */
        line2.setPoints(new Point(1, 1), new Point(0, 0));
        System.out.println();
        System.out.println("=== Reset begin and end points to 1's and 0's ===");
        System.out.println();
        System.out.println(line2);
    }
}
