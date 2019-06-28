/**
 * Test driver for Monster class.
 */
public class TestMonster {
    /** Monster test driver for various monsters. */
    public static void main(String[] args) {
        /* fire monster */
        Monster fireMon = new FireMonster("Escalante");
        System.out.println();
        System.out.println(fireMon);
        System.out.println();
        System.out.println(fireMon.attack());
        /* water monster */
        Monster water = new WaterMonster("Aquaphonia");
        System.out.println();
        System.out.println(water);
        System.out.println();
        System.out.println(water.attack());
        /* cookie monster */
        Monster cookieMon = new CookieMonster("Tasty");
        System.out.println();
        System.out.println(cookieMon);
        System.out.println();
        System.out.println(cookieMon.attack());
        /* declared as CookieMonster */
        CookieMonster ugly = new CookieMonster("Abominable");
        System.out.println();
        System.out.println(ugly);
        System.out.println();
        System.out.println(ugly.attack());
    }
}
