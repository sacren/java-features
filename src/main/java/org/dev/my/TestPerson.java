/**
 * Test driver for Person.
 */
public class TestPerson {
    /** Instantiate and run Person object. */
    public static void main(String[] args) {
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
