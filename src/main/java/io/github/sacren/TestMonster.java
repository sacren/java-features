/**
 * Test driver for Monster class.
 */
public class TestMonster {
    /** Monster test driver for various monsters. */
    public static void main(String[] args) {
        /* fire monster */
        Monster heat = new FireMonster("Fiery");
        System.out.println();
        System.out.println(heat);
        System.out.println();
        System.out.println(heat.attack());
        /* water monster */
        Monster water = new WaterMonster("Wetty");
        System.out.println();
        System.out.println(water);
        System.out.println();
        System.out.println(water.attack());
        /* cookie monster */
        Monster cookie1 = new CookieMonster("Tasty");
        System.out.println();
        System.out.println(cookie1);
        System.out.println();
        System.out.println(cookie1.attack());
        /* 
         * this doesn't compile:
         *
         * Monster m = new Monster("Baddy");
         *
         * next is not substituted but works perfectly
         */
        CookieMonster cookie2 = new CookieMonster("Bittery");
        System.out.println();
        System.out.println(cookie2);
        System.out.println();
        System.out.println(cookie2.attack());
    }
}
