/**
 * Test driver for Monster class.
 */
public class TestMonster {
    /** Test driver for various monsters. */
    public static void main(String[] args) {
        Monster fireMonster = new FireMonster("f2a2");
        System.out.println(fireMonster);
        System.out.println(fireMonster.attack());
        Monster waterMonster = new WaterMonster("w2a2");
        System.out.println();
        System.out.println(waterMonster);
        System.out.println(waterMonster.attack());
        Monster cookieMonster = new CookieMonster("c2a2");
        System.out.println();
        System.out.println(cookieMonster);
        System.out.println(cookieMonster.attack());
    }
}
