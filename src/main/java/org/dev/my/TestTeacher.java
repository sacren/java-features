/**
 * Test driver for Teacher.
 */
import java.util.Arrays;

public class TestTeacher {
    /** Test and Teacher instance. */
    public static void main(String[] args) {
        String name = "Charlie Smith";
        String address = "24 College Drive, Anytown, Anystate";
        Teacher teacher = new Teacher(name, address);
        System.out.println(teacher);
        addCourse(teacher, "ENGL 2100");
        addCourse(teacher, "ENGL 3500");
        addCourse(teacher, "PHIL 1000");
        addCourse(teacher, "ENGL 2100");
        System.out.println();
        System.out.printf(
                "Teacher courses: %s%n"
                        + "Number of courses: %s%n",
                Arrays.toString(teacher.getCourses()),
                teacher.getNumberOfCourses());
        System.out.println();
        removeCourse(teacher, "ENGL 2100");
        removeCourse(teacher, "ENGL 2100");
        System.out.println();
        System.out.printf(
                "Teacher courses: %s%n"
                        + "Number of courses: %s%n",
                Arrays.toString(teacher.getCourses()),
                teacher.getNumberOfCourses());
    }

    private static void addCourse(Teacher teacher, String course) {
        if (teacher.addCourse(course)) {
            System.out.printf("%s is added.%n", course);
        } else {
            System.out.printf("%s cannot be added.%n", course);
        }
    }

    private static void removeCourse(Teacher teacher, String course) {
        if (teacher.removeCourse(course)) {
            System.out.printf("%s is removed.%n", course);
        } else {
            System.out.printf("%s cannot be removed.%n", course);
        }
    }
}
