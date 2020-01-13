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
                "Default Trio instance: P(%d, %d, %d)%n",
                defTrio.getFirstInt(),
                defTrio.getSecondInt(),
                defTrio.getThirdInt());
        System.out.println();
        System.out.println("=== Custom Trio instance ===");
        System.out.println();
        Trio trio = new Trio(1, 2, 3);
        System.out.println(trio);
        System.out.println();
        System.out.printf(
                "Trio of int: P(%d, %d, %d)%n",
                trio.getFirstInt(),
                trio.getSecondInt(),
                trio.getThirdInt());
        System.out.println();
        System.out.println("=== Update Trio instance ===");
        System.out.println();
        trio.setFirst(101);
        trio.setSecond(102);
        trio.setThird(103);
        System.out.println(trio);
        System.out.println();
        System.out.printf(
                "Trio of int: P(%d, %d, %d)%n",
                trio.getFirstInt(),
                trio.getSecondInt(),
                trio.getThirdInt());
    }
}
