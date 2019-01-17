/**
 * Student class.
 *
 * <p>Private data with default values:
 * -name:String
 * -address:String
 * -numberCourses:int = 0
 * -courses:String[30] = {}
 * -grades:int[30] = {}
 *
 * <p>Constructor:
 * +Student(name:String, address:String)
 * +getName():String
 * +getAddress():String
 * +setAddress(address:String):void
 * +toString():String
 */
public class Student {
    /* private instance data */
    private String name;
    private String address;

    /** Custom constructor for student instance. */
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /** getter for student name. */
    public String getName() {
        return name;
    }

    /** getter for student address. */
    public String getAddress() {
        return address;
    }

    /** setter for student address. */
    public void setAddress(String address) {
        this.address = address;
    }

    /** Student description. */
    public String toString() {
        return String.format("%s (%s)%n", name, address);
    }
}
