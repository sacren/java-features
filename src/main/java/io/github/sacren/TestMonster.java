/**
 * Test driver for Monster class.
 */
public class TestMonster {
    /** Moster test driver for various monsters. */
    public static void main(String[] args) {
        String fireMonsterName = "Escalante";
        Monster fireMonster = new FireMonster(fireMonsterName);
        System.out.println(fireMonster);
        System.out.println(fireMonster.attack());
        String waterMonsterName = "Aquaphonia";
        Monster waterMonster = new WaterMonster(waterMonsterName);
        System.out.println();
        System.out.println(waterMonster);
        System.out.println(waterMonster.attack());
        String cookieMonsterName = "Abominable Kuch";
        Monster cookieMonster = new CookieMonster(cookieMonsterName);
        System.out.println();
        System.out.println(cookieMonster);
        System.out.println(cookieMonster.attack());
        String monsterName2 = "Abominable Cookie Monster";
        CookieMonster monster2 = new CookieMonster(monsterName2);
        System.out.println();
        System.out.println(monster2);
        System.out.println(monster2.attack());
    }
}
