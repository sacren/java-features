/**
 * Test driver for Author class.
 */
public class TestAuthor {
    /** Test driver for Author. */
    public static void main(String[] args) {
        /* Author class */
        String name = "Dennis Ritchie";
        String email = "dmr@bell-labs.com";
        Author dennis = new Author(name, email, 'M');
        System.out.println();
        System.out.println("=== Author class ===");
        System.out.println();
        System.out.println(dennis);
        System.out.println();
        System.out.printf(
                "The C Programming Language is authored by %s.%n"
                        + "Send email to %s for questions.%n",
                dennis.getName(),
                dennis.getEmail());
        /* delete Author instance private data */
        dennis.setName(null);
        dennis.setEmail(null);
        dennis.setGender(' ');
        System.out.println();
        System.out.println("=== After deleting Auther instance private data ===");
        System.out.println();
        System.out.println(dennis);
        /* restore Author instance private data */
        dennis.setName(name);
        dennis.setEmail(email);
        dennis.setGender('M');
        System.out.println();
        System.out.println("=== After restoring Author instance private data ===");
        System.out.println();
        System.out.println(dennis);
    }
}
