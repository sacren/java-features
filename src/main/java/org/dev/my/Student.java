/**
 * Student: subclass under Person.
 *
 * <p>Private data with default values:
 * -numberOfCourses:int = 0
 * -courses:String[30] = {}
 * -grades:int[30] = {}
 *
 * <p>Constructor:
 * +Student(name:String, address:String)
 *
 * <p>Public methods:
 * +toString():String
 * +addCourseGrade(course:String, grade:int):void
 * +getNumberOfCourses():int
 * +getCourses():String[]
 * +getGrades():int[]
 * +getStringOfGrades():String
 * +getAverageGrade():double
 */
public class Student extends Person {
    /* private static data */
    private static final int MAX_COURSES = 30;

    /* private instance data */
    private int numberOfCourses;
    private String[] courses;
    private int[] grades;

    /** Custom constructor for student instance. */
    public Student(String name, String address) {
        super(name, address);
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
        numberOfCourses = 0;
    }

    /** Student description. */
    @Override
    public String toString() {
        return String.format("%s (%s)%n", getName(), getAddress());
    }

    /** Public method adding course and grade. */
    public void addCourseGrade(String course, int grade) {
        courses[numberOfCourses] = course;
        grades[numberOfCourses] = grade;
        numberOfCourses++;
    }

    /** getter for number of courses. */
    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    /** getter for courses array. */
    public String[] getCourses() {
        return courses;
    }

    /** getter for grades array. */
    public int[] getGrades() {
        return grades;
    }

    /** Public method for string of grades. */
    public String getStringOfGrades() {
        /* initialize formatted string with the first element of array */
        String s = String.format("%s (%s:%d", getName(), courses[0], grades[0]);
        for (int i = 1; i < numberOfCourses; i++) {
            s += String.format(", %s:%d", courses[i], grades[i]);
        }
        s += ")"; /* do not forget the closing parenthesis */
        return s;
    }

    /** Public method for average of grades. */
    public double getAverageGrade() {
        if (numberOfCourses == 0) {
            throw new IllegalArgumentException("No courses taken yet!");
        }
        double sum = 0;
        for (int i = 0; i < numberOfCourses; i++) {
            sum += grades[i];
        }
        return sum / numberOfCourses;
    }
}
