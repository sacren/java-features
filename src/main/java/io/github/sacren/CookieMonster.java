/**
 * CookieMonster subclass extends Monster superclass.
 *
 * <p>Constructor:
 * +CookieMonster(name:String)
 *
 * <p>Public methods:
 * +attack():String
 * +toString():String
 */
public class CookieMonster extends Monster {
    /** CookieMonster constructor. */
    public CookieMonster(String name) {
        super(name);
    }

    /** CookieMonster public method for attack. */
    @Override
    public String attack() {
        return String.format("%s eats all the cookies!", getName());
    }

    /** CookieMonster description. */
    public String toString() {
        return String.format("[Cookie Monster: %s]", getName());
    }
}
