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
 * +getCourses():String[]
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

    /** getter for Teacher courses array. */
    public String[] getCourses() {
        return courses;
    }

    /** getter for Teacher number of courses. */
    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    /** Add course to the courses array. */
    public boolean addCourse(String course) {
        for (int i = 0; i < numberOfCourses; i++) {
            /* if course is found, we cannot add it but return false */
            if (courses[i].equals(course)) {
                return false;
            }
        }
        courses[numberOfCourses++] = course;
        return true;
    }

    /** Remove course from the courses array. */
    public boolean removeCourse(String course) {
        if (hasCourse(course)) {
            resetCourses(course);
            return true;
        }
        return false;
    }

    private boolean hasCourse(String course) {
        for (int i = 0; i < numberOfCourses; i++) {
            if (courses[i].equals(course)) {
                return true;
            }
        }
        return false;
    }

    private void resetCourses(String course) {
        String[] newCourses = new String[MAX_COURSES];
        int j = 0;
        for (int i = 0; i < numberOfCourses; i++) {
            if (courses[i].equals(course)) {
                continue;
            }
            newCourses[j++] = courses[i];
        }
        courses = newCourses;
        numberOfCourses--;
    }
}
