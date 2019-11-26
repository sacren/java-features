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
        /* Book by one author */
        Author[] oneAuth = new Author[1];
        char male = 'M';
        oneAuth[0] = new Author("Bjarne Stroustrup", "bjarne@stroustrup.com", new Gender(male));
        Book cppBook = new Book("The C++ Programming Language", oneAuth, 99.99, 59000);
        System.out.println();
        System.out.println("=== Book by one author ===");
        System.out.println();
        System.out.println(cppBook);
        /* Book class */
        Author[] authors = new Author[2];
        authors[0] = new Author("Brian Kernighan", "bwk@bell-labs.com", new Gender(male));
        authors[1] = new Author("Dennis Ritchie", "dmr@bell-labs.com", new Gender(male));
        String name = "The C Programming Language";
        Book book = new Book(name, authors, 29.99, 90000);
        System.out.println();
        System.out.println("=== Book instance using custom constructor ===");
        System.out.println();
        System.out.println(book);
        System.out.println();
        System.out.printf(
                "Book name:     %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n",
                book.getName(),
                book.allAuthInfo(),
                book.getPrice(),
                book.getSales());
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
                book.allAuthInfo(),
                book.getPrice(),
                book.getSales());
        /* use a list of Author instances but exclude sales */
        Author[] dummyAuthors = new Author[3];
        char female = 'F';
        dummyAuthors[0] = new Author("Peter Pan", "peter@never.land", new Gender(male));
        dummyAuthors[1] = new Author("Wendy", "wendy@never.land", new Gender(female));
        dummyAuthors[2] = new Author("Tinker Bell", "tinker@never.land", new Gender(female));
        Book dummy = new Book("Java for Dummies", dummyAuthors, 19.99);
        System.out.println();
        System.out.println("=== Book of a list of Author instances ===");
        System.out.println();
        System.out.println(dummy);
        System.out.println();
        System.out.println("=== Info of list of Author instances via Book ===");
        System.out.println();
        System.out.println(dummy.allAuthInfo());
    }
}
