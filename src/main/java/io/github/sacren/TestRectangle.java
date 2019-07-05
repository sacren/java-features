/**
 * Test driver for Rectangle class.
 */
public class TestRectangle {
    /** Circle test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default rectangle ===");
        System.out.println();
        /* default rectangle */
        Rectangle r = new Rectangle();
        System.out.println(r);
        System.out.println();
        System.out.println("=== Rectangle with place holder ===");
        System.out.println();
        System.out.println(new Rectangle(r));
        System.out.println();
        System.out.println(new Rectangle(null));
        System.out.println();
        Shape s = new Rectangle();
        System.out.println(new Rectangle((Rectangle) s));
    }
}
