/**
 * Test driver for Monster class.
 */
public class TestMonster {
    /** Test driver for various monsters. */
    public static void main(String[] args) {
        Monster monster = new FireMonster("f2a2");
        System.out.println(monster);
        System.out.println(monster.attack());
    }
}
