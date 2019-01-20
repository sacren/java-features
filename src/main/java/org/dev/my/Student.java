/**
 * Student class.
 *
 * <p>Private data with default values:
 * -name:String
 * -address:String
 * -numberOfCourses:int = 0
 * -courses:String[30] = {}
 * -grades:int[30] = {}
 *
 * <p>Constructor:
 * +Student(name:String, address:String)
 *
 * <p>Public methods:
 * +getName():String
 * +getAddress():String
 * +setAddress(address:String):void
 * +toString():String
 */
public class Student {
    /* private static data */
    private static final int MAX_COURSES = 30;

    /* private instance data */
    private String name;
    private String address;
    private int numberOfCourses;
    private String[] courses;
    private int[] grades;

    /** Custom constructor for student instance. */
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
        numberOfCourses = 0;
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

    /** Add course and grade to the instance. */
    public void addCourseGrade(String course, int grade) {
        courses[numberOfCourses] = course;
        grades[numberOfCourses] = grade;
        numberOfCourses++;
    }

    /** Public method for number of courses. */
    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    /** Public method for courses array. */
    public String[] getCourses() {
        return courses;
    }

    /** Public method for grades array. */
    public int[] getGrades() {
        return grades;
    }
}
