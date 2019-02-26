/**
 * FireMonster subclass extends Monster superclass.
 *
 * <p>Constructor:
 * +FireMonster(name:String)
 *
 * <p>Public methods:
 * +attack():String
 * +toString():String
 */
public class FireMonster extends Monster {
    /** FireMonster constructor. */
    public FireMonster(String name) {
        super(name);
    }

    /** FireMonster public method for attack. */
    @Override
    public String attack() {
        return String.format("%s blows fire!", getName());
    }

    /** FireMonster description. */
    public String toString() {
        return String.format("[Fire Monster: %s]", getName());
    }
}
