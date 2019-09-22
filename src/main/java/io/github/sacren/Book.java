/**
 * Book class models a book with any number of authors.
 *
 * <p>The author is an instance of Author class.
 *
 * <p>Private instance variables:
 * -name:String
 * -authors:Author[]
 * -price:double
 * -sales:int
 *
 * <p>Constructor:
 * +Book()
 * +Book(name:String, authors:Author[] price:double)
 * +Book(name:String, authors:Author[] price:double, sales:int)
 *
 * <p>Public methods:
 * +setName(name:String):void
 * +setAuthors(authors:Author[]):void
 * +setPrice(price:double):void
 * +setSales(sales:int):void
 * +getName():String
 * +getPrice():double
 * +getSales():int
 * +getAllAuthInfo():String
 * +toString():String
 */
public class Book {
    /* private instance variables */
    private String name;
    private Author[] authors;
    private double price;
    private int sales;

    /** Book default constructor. */
    public Book() {
        Author[] authors = new Author[2];
        authors[0] = new Author();
        authors[1] = new Author();
        setAuthors(authors);
    }

    /** Book constructor with name, list of authors and price. */
    public Book(String name, Author[] authors, double price) {
        setName(name);
        setAuthors(authors);
        setPrice(price);
    }

    /** Book constructor with additional sales quantity. */
    public Book(String name, Author[] authors, double price, int sales) {
        setName(name);
        setAuthors(authors);
        setPrice(price);
        setSales(sales);
    }

    /** Book setter for book name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Book setter for book authors. */
    public void setAuthors(Author[] authors) {
        this.authors = new Author[authors.length];
        for (int i = 0; i < authors.length; i++) {
            this.authors[i] = authors[i];
        }
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

    /** Book getter for the book price. */
    public double getPrice() {
        return price;
    }

    /** Book getter for book sales. */
    public int getSales() {
        return sales;
    }

    /** Book getter for info of all authors. */
    public String getAllAuthInfo() {
        int end = authors.length - 1;
        StringBuilder fmtAuth = new StringBuilder();
        for (int i = 0; i < end; i++) { /* last author excluded */
            fmtAuth.append(String.format("%s%n", authors[i]));
        }
        fmtAuth.append(authors[end]);
        return fmtAuth.toString();
    }

    /** Book instance formatted string. */
    public String toString() {
        return String.format(
                "Book name:     %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d",
                name,
                getAllAuthInfo(),
                price,
                sales);
    }
}
