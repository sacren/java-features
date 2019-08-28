/**
 * Person: superclass over Student and Teacher.
 *
 * <p>Private data:
 * -name:String
 * -address:String
 *
 * <p>Constructor:
 * +person(name:String, address:String)
 *
 * <p>Public methods:
 * +getName():String
 * +getAddress():String
 * +setName(name:String):void
 * +setAddress(address:String):void
 * +toString():String
 */
public class Person {
    /* private instance data */
    private String name;
    private String address;

    /** Person default constructor. */
    public Person() {
        setName("John Doe");
        setAddress("123 Main St., Anytown, Anystate");
    }

    /** Person constructor with name and address. */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /** getter for Person name. */
    public String getName() {
        return name;
    }

    /** getter for Person address. */
    public String getAddress() {
        return address;
    }

    /** Person setter for name. */
    public void setName(String name) {
        this.name = name;
    }

    /** setter for Person address. */
    public void setAddress(String address) {
        this.address = address;
    }

    /** Person description. */
    public String toString() {
        return String.format(
                "Name: %s%n"
                        + "Address: %s%n",
                name, address);
    }
}
