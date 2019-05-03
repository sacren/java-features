/**
 * Test driver for Line class.
 */
import java.util.Scanner;

public class TestLine {
    /** Line test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int beginX;
        System.out.print("Enter x-axis for begin point: ");
        beginX = in.nextInt();
        int beginY;
        System.out.print("Enter y-axis for begin point: ");
        beginY = in.nextInt();
        int endX;
        System.out.print("Enter x-axis for end point: ");
        endX = in.nextInt();
        int endY;
        System.out.print("Enter y-axis for end point: ");
        endY = in.nextInt();
        in.close();
        /* use 4 numbers for Line instance */
        System.out.println();
        System.out.println("=== Line by 4 integers ===");
        System.out.println();
        Line line1 = new Line(beginX, beginY, endX, endY);
        System.out.println(line1);
        /* reset line points to all 0's. */
        line1.setBeginX(0);
        line1.setBeginY(0);
        line1.setEndX(0);
        line1.setEndY(0);
        System.out.println();
        System.out.println("=== Reset points to 0 ===");
        System.out.println();
        System.out.println(line1);
        /* use points for Line instance */
        System.out.println();
        System.out.println("=== Line by 2 points ===");
        System.out.println();
        Line line2 = new Line(new Point(beginX, beginY), new Point(endX, endY));
        System.out.println(line2);
        /* update line points. */
        line2.setBegin(new Point(line2.getBeginX() * 2, line2.getBeginY() / 2));
        line2.setEnd(new Point(line2.getEndX() * 3, line2.getEndY() / 3));
        System.out.println();
        System.out.println("=== Update line points ===");
        System.out.println();
        System.out.println(line2);
        /* reset line points to all 0's by points. */
        line2.setBegin(new Point(0, 0));
        line2.setEnd(new Point(0, 0));
        System.out.println();
        System.out.println("=== Reset points to 0 by points ===");
        System.out.println();
        System.out.println(line2);
    }
}
