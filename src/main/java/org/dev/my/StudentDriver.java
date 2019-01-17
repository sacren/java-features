/**
 * Student driver.
 */
public class StudentDriver {
    /** Instantiate Student and display student info. */
    public static void main(String[] args) {
        final String name = "Charlie Smith";
        final String address = "24 College Drive, Anytown, Anystate";
        Student student = new Student(name, address);
        System.out.print(student);
    }
}
