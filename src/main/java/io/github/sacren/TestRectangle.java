/**
 * Test driver for Rectangle class.
 */
public class TestRectangle {
    /** Rectangle test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default rectangle ===");
        System.out.println();
        /* default rectangle */
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println();
        System.out.println("=== Rectangle with place holder ===");
        System.out.println();
        /* rectangle with place holder */
        System.out.println(new Rectangle(r1));
        System.out.println();
        Shape s = new Rectangle();
        System.out.println(new Rectangle((Rectangle) s));
        /* rectangle with length */
        Rectangle r2 = new Rectangle(10);
        System.out.println();
        System.out.println(new Rectangle(r2));
        System.out.println();
        System.out.println("=== Rectangle with length ===");
        System.out.println();
        System.out.println(r2);
        System.out.println();
        System.out.println("=== Rectangle with length and width ===");
        System.out.println();
        /* rectangle with length and width */
        Rectangle r3 = new Rectangle(22, 4);
        System.out.println(r3);
        System.out.println();
        System.out.println("=== Rectangle with Point for length and width ===");
        System.out.println();
        Point p1 = new Point(r3.getLength(), r3.getWidth());
        Rectangle r4 = new Rectangle(p1);
        System.out.println(r4);
        System.out.println();
        System.out.println("=== Rectangle with color, length and width ===");
        System.out.println();
        /* rectangle with color, length and width */
        Rectangle r5 = new Rectangle("orange", 102, 5);
        System.out.println(r5);
        r5.setLength(r5.getLength() + 1);
        r5.setWidth(r5.getWidth() + 1);
        System.out.println();
        System.out.println(r5);
        System.out.println();
        System.out.println("=== Rectangle with color and Point ===");
        System.out.println();
        /* rectangle with color and Point */
        Point p2 = new Point(r5.getLength(), r5.getWidth());
        Rectangle r6 = new Rectangle("orange", p2);
        r6.setColor("grey");
        System.out.println(r6);
        Point p3 = new Point(r5.getLength() + 1, r5.getWidth() + 1);
        r6.setSides(p3);
        System.out.println();
        System.out.println(r6);
    }
}
