/**
 * Test driver of Duo class.
 */
public class TestDuo {
    /** Duo test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default Duo instance ===");
        System.out.println();
        Duo defDuo = new Duo();
        System.out.println(defDuo);
        System.out.println();
        System.out.printf(
                "Default Duo instance: (%d, %d)%n"
                        + "                      (%.2f, %.2f)%n",
                defDuo.getFirstInt(), defDuo.getSecondInt(),
                defDuo.getFirstDbl(), defDuo.getSecondDbl());
        System.out.println();
        System.out.println("=== Custom Duo instance ===");
        System.out.println();
        Duo intDuo = new Duo(11, 2);
        System.out.println(intDuo);
        System.out.println();
        System.out.printf(
                "Custom Duo instance: (%d, %d)%n"
                          + "                     (%.2f, %.2f)%n",
                intDuo.getFirstInt(), intDuo.getSecondInt(),
                intDuo.getFirstDbl(), intDuo.getSecondDbl());
        System.out.println();
        Duo dblDuo = new Duo((double) 11, 2.0);
        System.out.println(dblDuo);
        System.out.println();
        System.out.printf(
                "Custom Duo instance: (%d, %d)%n"
                          + "                     (%.2f, %.2f)%n",
                dblDuo.getFirstInt(), dblDuo.getSecondInt(),
                dblDuo.getFirstDbl(), dblDuo.getSecondDbl());
        System.out.println();
        System.out.println("=== Mixed Duo instance ===");
        System.out.println();
        Duo mixed = new Duo(3, (double) 4);
        System.out.println(mixed);
        System.out.println();
        System.out.printf(
                "Mixed Duo instance: (%d, %d)%n"
                        + "                    (%.2f, %.2f)%n",
                mixed.getFirstInt(), mixed.getSecondInt(),
                mixed.getFirstDbl(), mixed.getSecondDbl());
    }
}
