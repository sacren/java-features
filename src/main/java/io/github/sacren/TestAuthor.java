/**
 * Test driver for Author class.
 */
public class TestAuthor {
    /** Test driver for Author. */
    public static void main(String[] args) {
        /* Author class */
        String name = "Dennis Ritchie";
        String email = "dmr@bell-labs.com";
        Gender gender = new Gender('M');
        Author author = new Author(name, email, gender);
        System.out.println();
        System.out.println("=== Author class ===");
        System.out.println();
        System.out.println(author);
        System.out.println();
        System.out.printf(
                "Author name:   %s%n"
                        + "Author email:  %s%n"
                        + "%s%n",
                author.getName(),
                author.getEmail(),
                author.getGenderObj());
        /* delete Author instance private data */
        author.setName(null);
        author.setEmail(null);
        author.setGender(new Gender());
        System.out.println();
        System.out.println("=== After deleting Auther instance private data ===");
        System.out.println();
        System.out.println(author);
        /* restore Author instance private data */
        author.setName(name);
        author.setEmail(email);
        author.setGender(gender);
        System.out.println();
        System.out.println("=== After restoring Author instance private data ===");
        System.out.println();
        System.out.println(author);
    }
}
