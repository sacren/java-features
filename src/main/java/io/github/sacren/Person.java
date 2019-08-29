/**
 * Person superclass over Student and Teacher subclasses.
 *
 * <p>Private data:
 * -name:String
 * -address:String
 *
 * <p>Constructor:
 * +Person()
 * +Person(name:String, address:String)
 *
 * <p>Public methods:
 * +setName(name:String):void
 * +setAddress(address:String):void
 * +getName():String
 * +getAddress():String
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

    /** Person custom constructor. */
    public Person(String name, String address) {
        setName(name);
        setAddress(address);
    }

    /** Person setter for name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Person setter for address. */
    public void setAddress(String address) {
        this.address = address;
    }

    /** Person getter for name. */
    public String getName() {
        return name;
    }

    /** Person getter for address. */
    public String getAddress() {
        return address;
    }

    /** Person instance printout. */
    public String toString() {
        return String.format(
                "Name: %s%n"
                        + "Address: %s%n",
                name,
                address);
    }
}
