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
    }
}
