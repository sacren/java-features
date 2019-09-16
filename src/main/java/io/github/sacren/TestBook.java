/**
 * Test driver for Book class.
 */
public class TestBook {
    /** Book test driver. */
    public static void main(String[] args) {
        /* Book default constructor */
        System.out.println();
        System.out.println("=== Book instance using default constructor ===");
        System.out.println();
        System.out.println(new Book());
        /* Book class */
        Author author = new Author("Dennis Ritchie", "dmr@bell-labs.com", 'M');
        Author[] authors = new Author[2];
        authors[0] = new Author("Brian Kernighan", "bwk@bell-labs.com", 'M');
        authors[1] = new Author("Dennis Ritchie", "dmr@bell-labs.com", 'M');
        String name = "The C Programming Language";
        Book book = new Book(name, author, authors, 29.99, 90000);
        System.out.println();
        System.out.println("=== Book instance using custom constructor ===");
        System.out.println();
        System.out.println(book);
        System.out.println();
        System.out.printf(
                "Book name:     %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n%n"
                        + "First author:%n"
                        + "%s%n",
                book.getName(),
                author,
                book.getPrice(),
                book.getSales(),
                book.getAuthors()[0]);
        /* update book */
        System.out.println();
        System.out.println("=== After update book price and sales ===");
        System.out.println();
        book.setPrice(69.99);
        book.setSales(1900);
        System.out.println(book);
        System.out.println();
        System.out.printf(
                "Book name:     %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n",
                book.getName(),
                author,
                book.getPrice(),
                book.getSales());
        /* use Author instance excluding sales */
        Author[] dummyAuthors = new Author[3];
        dummyAuthors[0] = new Author("Peter Pan", "peter@never.land", 'M');
        dummyAuthors[1] = new Author("Wendy", "wendy@never.land", 'F');
        dummyAuthors[2] = new Author("Tinker Bell", "tinker@never.land", 'F');
        Book dummy = new Book(
                "Java for Dummies",
                new Author("Peter Pan", "pan@nowhere.net", 'M'),
                dummyAuthors,
                19.99);
        System.out.println();
        System.out.println("=== Book of anonymous Author instance ===");
        System.out.println();
        System.out.println(dummy);
        System.out.println();
        System.out.println("=== Info of list of Author instances via Book ===");
        System.out.println();
        StringBuilder fmtAuth = new StringBuilder();
        for (Author a : dummy.getAuthors()) {
            fmtAuth.append(String.format(
                        "Author name:   %s%n"
                                + "Author email:  %s%n"
                                + "Author gender: %c%n",
                        a.getName(),
                        a.getEmail(),
                        a.getGender()));
        }
        System.out.print(fmtAuth.toString());
        /* use Book constructor with no single author */
        Book neverland = new Book("Never Land", dummyAuthors, 19.99);
        System.out.println();
        System.out.println("=== Book constructor excluding single Author ===");
        System.out.println();
        System.out.println(neverland);
    }
}
