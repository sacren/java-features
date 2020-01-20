/**
 * Test driver of Trio class.
 */
public class TestTrio {
    /** Trio test driver. */
    public static void main(String[] args) {
        Trio defTrio = new Trio();
        System.out.println();
        System.out.println("=== Default Trio instance ===");
        System.out.println();
        System.out.println(defTrio);
        System.out.println();
        System.out.printf(
                "Default Trio instance: (%d, %d, %d)%n"
                        + "                       (%.2f, %.2f, %.2f)%n",
                defTrio.getFirstInt(),
                defTrio.getSecondInt(),
                defTrio.getThirdInt(),
                defTrio.getFirstDbl(),
                defTrio.getSecondDbl(),
                defTrio.getThirdDbl());
        System.out.println();
        System.out.println("=== Custom Trio instance ===");
        System.out.println();
        Trio trio = new Trio((double) 1, 2, 3);
        System.out.println(trio);
        System.out.println();
        System.out.printf(
                "Custom Trio instance: (%d, %d, %d)%n"
                        + "                      (%.2f, %.2f, %.2f)%n",
                trio.getFirstInt(),
                trio.getSecondInt(),
                trio.getThirdInt(),
                trio.getFirstDbl(),
                trio.getSecondDbl(),
                trio.getThirdDbl());
        System.out.println();
        System.out.println("=== Update Trio instance ===");
        System.out.println();
        trio.setFirst((double) 101);
        trio.setSecond(102);
        trio.setThird((double) 103);
        System.out.println(trio);
        System.out.println();
        System.out.printf(
                "Updated Trio instance: (%d, %d, %d)%n"
                        + "                       (%.2f, %.2f, %.2f)%n",
                trio.getFirstInt(),
                trio.getSecondInt(),
                trio.getThirdInt(),
                trio.getFirstDbl(),
                trio.getSecondDbl(),
                trio.getThirdDbl());
    }
}
