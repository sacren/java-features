/**
 * Test driver for Atom superclass.
 */
public class TestAtom {
    /** Atom test driver. */
    public static void main(String[] args) {
        Atom hydrogen = new Hydrogen();
        Atom carbon = new Carbon();
        System.out.println();
        System.out.println("=== Atomic number ===");
        System.out.println();
        System.out.println(hydrogen.toString());
        System.out.println(carbon);
    }
}
