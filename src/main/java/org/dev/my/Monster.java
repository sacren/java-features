/**
 * Monster abstract superclass.
 *
 * <p>Private data:
 * -name:String
 *
 * <p>Constructor:
 * +Monster(name:String)
 *
 * <p>Abstract methods:
 * +attack():String
 */
public abstract class Monster {
    /* private instance data */
    private String name;

    /** Monster custom constructor. */
    public Monster(String name) {
        this.name = name;
    }

    /** Monster abstract method for attack. */
    public abstract String attack();
}
