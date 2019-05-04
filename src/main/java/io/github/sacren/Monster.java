/**
 * Monster abstract superclass.
 *
 * <p>Private data:
 * -name:String
 *
 * <p>Constructor:
 * +Monster(name:String)
 *
 * <p>Public method:
 * +getName():String
 *
 * <p>Abstract method:
 * +attack():String
 */
public abstract class Monster {
    /* private instance data */
    private String name;

    /** Monster constructor. */
    public Monster(String name) {
        this.name = name;
    }

    /** Monster getter for name. */
    public String getName() {
        return name;
    }

    /** Monster abstract method for attack. */
    public abstract String attack();
}
