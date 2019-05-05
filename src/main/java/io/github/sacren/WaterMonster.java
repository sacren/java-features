/**
 * WaterMonster subclass extends Monster superclass.
 *
 * <p>Constructor:
 * +WaterMonster(name:String)
 *
 * <p>Public methods:
 * +attack():String
 * +toString():String
 */
public class WaterMonster extends Monster {
    /** WaterMonster constructor. */
    public WaterMonster(String name) {
        super(name);
    }

    /** WaterMonster method for attack. */
    @Override
    public String attack() {
        return String.format(
                "%s pours water!",
                getName());
    }

    /** WaterMonster instance printout. */
    public String toString() {
        return String.format(
                "=== Water Monster %s ===%n",
                getName());
    }
}
