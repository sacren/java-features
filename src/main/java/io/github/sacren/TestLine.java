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
        /* reset line points to all 0's. */
        line1.setBeginX(0);
        line1.setBeginY(0);
        line1.setEndX(0);
        line1.setEndY(0);
        System.out.println();
        System.out.println("=== Reset points to all zeroes ===");
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
        line2.setBegin(new Point(line2.getBeginX() + 1, line2.getBeginY() - 1));
        line2.setEnd(new Point(line2.getEndX() - 1, line2.getEndY() + 1));
        System.out.println();
        System.out.println("=== Update line points ===");
        System.out.println();
        System.out.println(line2);
        /* reset line points to all 0's by points. */
        line2.setBegin(new Point(0, 0));
        line2.setEnd(new Point(0, 0));
        System.out.println();
        System.out.println("=== Reset begin and end points to zero ===");
        System.out.println();
        System.out.println(line2);
    }
}
