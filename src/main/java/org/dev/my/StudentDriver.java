/**
 * Student driver.
 */
public class StudentDriver {
    /** Instantiate Student and display student info. */
    public static void main(String[] args) {
        Student student = new Student("Charlie Smith", "24 College Drive, Anytown, Anystate");
        System.out.print(student);
        System.out.printf(
                "Name is %s%n"
                        + "Address is %s%n",
                student.getName(),
                student.getAddress());
        System.out.println();
        System.out.printf("After updating the address.%n%n");
        student.setAddress("46 University Ave., Anytown, Anystate");
        System.out.print(student);
        System.out.printf(
                "Name is %s%n"
                        + "Address is %s%n",
                student.getName(),
                student.getAddress());
        /* add courses and grades */
        student.addCourseGrade("Quantum Mechanics", 100);
        student.addCourseGrade("Nuclear Physics", 110);
        String[] courses;
        courses = student.getCourses();
        int[] grades;
        grades = student.getGrades();
        System.out.println();
        System.out.print(student);
        for (int i = 0; i < student.getNumberOfCourses(); i++) {
            System.out.printf("%s: %d%n", courses[i], grades[i]);
        }
    }
}
