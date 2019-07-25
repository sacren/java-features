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
        System.out.println();
        System.out.println("=== Instance call ===");
        System.out.println();
        /* static method doesn't participate in polymorphism */
        System.out.println(carbon.getOrigin());
        Carbon graphite = (Carbon) carbon;
        System.out.println(graphite.getOrigin());
        System.out.println();
        System.out.println("=== Class call ===");
        System.out.println();
        System.out.println(Atom.getOrigin());
        System.out.println(Carbon.getOrigin());
        System.out.println();
        System.out.println("=== Inheritance of static method ===");
        System.out.println();
        System.out.println(carbon.getAtom());
        System.out.println(graphite.getAtom());
    }
}
