/**
 * Test driver for Person.
 */
public class TestPerson {
    /** Person test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Person with default name and address ===");
        System.out.println();
        System.out.print(new Person());
        System.out.println();
        String name = "Charlie Smith";
        String address = "24 College Drive, Anytown, Anystate";
        Person person = new Person(name, address);
        System.out.print(person);
        System.out.printf(
                "Name is %s%n"
                        + "Address is %s%n",
                person.getName(), person.getAddress());
        System.out.println();
        System.out.println("After changing Person address.");
        System.out.println();
        person.setAddress("46 University Ave., Anytown, Anystate");
        System.out.print(person);
        System.out.printf(
                "Name is %s%n"
                        + "Address is %s%n",
                person.getName(), person.getAddress());
    }
}
