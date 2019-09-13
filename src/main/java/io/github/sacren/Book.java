/**
 * Book class models a book with one or two authors.
 *
 * <p>The author is an instance of Author class.
 *
 * <p>Private instance data:
 * -name:String
 * -author:Author
 * -authors:Author[]
 * -price:double
 * -sales:int
 *
 * <p>Constructor:
 * +Book()
 * +Book(name:String, author:Author, price:double, sales:int)
 * +Book(name:String, author:Author, authors:Author[] price:double, sales:int)
 *
 * <p>Public methods:
 * +setName(name:String):void
 * +setAuthor(author:Author):void
 * +setAuthors(authors:Author[]):void
 * +setPrice(price:double):void
 * +setSales(sales:int):void
 * +getName():String
 * +getAuthor():Author
 * +getAuthors():Author[]
 * +getPrice():double
 * +getSales():int
 * +getAuthorName():String
 * +getAuthorEmail():String
 * +getAuthorGender():char
 * +toString():String
 */
public class Book {
    /* private instance variables */
    private String name;
    private Author author;
    private Author[] authors;
    private double price;
    private int sales;

    /** Book default constructor. */
    public Book() {
        Author[] authors = new Author[2];
        authors[0] = new Author();
        authors[1] = new Author();
        setAuthor(new Author());
        setAuthors(authors);
    }

    /** Book constructor with name, author and price. */
    public Book(String name, Author author, Author[] authors, double price) {
        setName(name);
        setAuthor(author);
        setAuthors(authors);
        setPrice(price);
    }

    /** Book constructor with additional sales quantity. */
    public Book(String name, Author author, Author[] authors, double price, int sales) {
        setName(name);
        setAuthor(author);
        setAuthors(authors);
        setPrice(price);
        setSales(sales);
    }

    /** Book setter for book name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Book setter for book author. */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /** Book setter for book authors. */
    public void setAuthors(Author[] authors) {
        this.authors = new Author[2];
        this.authors[0] = authors[0];
        this.authors[1] = authors[1];
    }

    /** Book setter for book price. */
    public void setPrice(double price) {
        this.price = price;
    }

    /** Book setter for book sales. */
    public void setSales(int sales) {
        this.sales = sales;
    }

    /** Book getter for the book name. */
    public String getName() {
        return name;
    }

    /** Book getter for Author instance. */
    public Author getAuthor() {
        return author;
    }

    /** Book getter for Author array. */
    public Author[] getAuthors() {
        return authors;
    }

    /** Book getter for the book price. */
    public double getPrice() {
        return price;
    }

    /** Book getter for book sales. */
    public int getSales() {
        return sales;
    }

    /** Book getter for Author name. */
    public String getAuthorName() {
        return author.getName();
    }

    /** Book getter for Author email address. */
    public String getAuthorEmail() {
        return author.getEmail();
    }

    /** Book getter for Author gender. */
    public char getAuthorGender() {
        return author.getGender();
    }

    /** Book instance formatted string. */
    public String toString() {
        return String.format(
                "Book name:     %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n%n"
                        + "%s%n"
                        + "%s",
                name,
                author,
                price,
                sales,
                authors[0],
                authors[1]);
    }
}
