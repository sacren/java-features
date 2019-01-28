/**
 * Teacher: subclass under Person.
 *
 * <p>Private data with default values:
 * -numberOfCourses:int = 0
 * -courses:String[] = {}
 *
 * <p>Constructor:
 * +Teacher(name:String, address:String)
 *
 * <p>Public methods:
 * +toString():String
 * +addCourse(course:String):boolean
 * +removeCourse(course:String):boolean
 */
public class Teacher extends Person {
    /* public static data */
    private static final int INIT_NUMBER_OF_COURSES = 0;
    private static final int MAX_COURSES = 30;

    /* private instance data */
    private int numberOfCourses;
    private String[] courses;

    /** Teacher custom constructor. */
    public Teacher(String name, String address) {
        super(name, address);
        numberOfCourses = INIT_NUMBER_OF_COURSES;
        courses = new String[MAX_COURSES];
    }

    /** Teacher description. */
    @Override
    public String toString() {
        return String.format(
                "Instructor name: %s%n"
                        + "Instructor address: %s%n",
                getName(), getAddress());
    }
}
