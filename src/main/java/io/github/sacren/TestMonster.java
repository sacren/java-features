/**
 * Test driver for Monster class.
 */
public class TestMonster {
    /** Monster test driver for various monsters. */
    public static void main(String[] args) {
        Monster fire = new FireMonster("Escalante");
        System.out.println();
        System.out.println(fire);
        System.out.println();
        System.out.println(fire.attack());
        Monster water = new WaterMonster("Aquaphonia");
        System.out.println();
        System.out.println(water);
        System.out.println();
        System.out.println(water.attack());
        Monster kuch = new CookieMonster("Kuch");
        System.out.println();
        System.out.println(kuch);
        System.out.println();
        System.out.println(kuch.attack());
        /* declared as CookieMonster */
        CookieMonster cookie = new CookieMonster("Abominable Cookie Monster");
        System.out.println();
        System.out.println(cookie);
        System.out.println();
        System.out.println(cookie.attack());
    }
}
