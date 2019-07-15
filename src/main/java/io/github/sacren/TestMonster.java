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
        /* water monster */
        Monster water = new WaterMonster("Wetty");
        System.out.println();
        System.out.println(water);
        /* cookie monster */
        Monster cookie1 = new CookieMonster("Tasty");
        System.out.println();
        System.out.println(cookie1);
        /* 
         * this doesn't compile:
         *
         * Monster m = new Monster("Baddy");
         *
         * not substituted but works perfectly
         */
        CookieMonster cookie2 = new CookieMonster("Bittery");
        System.out.println();
        System.out.println(cookie2);
    }
}
