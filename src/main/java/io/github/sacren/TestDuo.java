/**
 * Test driver of Duo class.
 */
public class TestDuo {
    /** Duo test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default Duo instance ===");
        System.out.println();
        System.out.println(new Duo());
        System.out.println();
        System.out.println("=== Custom Duo instances ===");
        System.out.println();
        System.out.println(new Duo(11, 2));
        System.out.println(new Duo((double) 11, (double) 2));
        System.out.println(new Duo(11, (double) 2));
        System.out.println();
        System.out.println("=== Mixed Duo instance ===");
        System.out.println();
        Duo dbl = new Duo(3, (double) 4);
        System.out.println(dbl);
        System.out.println();
        System.out.println("=== Messed up with double ===");
        System.out.println();
        System.out.printf(
                "(%.2f, %.2f)%n",
                dbl.getFirstDbl(),
                dbl.getSecondDbl());
        System.out.println();
        System.out.println("=== All Duo instance variables ===");
        System.out.println();
        Duo duo = new Duo();
        System.out.printf(
                "Integer: (%d, %d)%n"
                        + "Double:  (%.2f, %.2f)%n",
                duo.getFirstInt(), duo.getSecondInt(),
                duo.getFirstDbl(), duo.getSecondDbl());
    }
}
