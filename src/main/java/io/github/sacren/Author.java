/**
 * Author class.
 *
 * <p>Private data:
 * -authorName:String
 * -email:String
 * -gender:char
 *
 * <p>Constructor:
 * +Author(authorName:String, email:String, gender:char)
 *
 * <p>Public methods:
 * +getName():String
 * +getEmail():String
 * +setEmail(email:String):void
 * +getGender():char
 * +toString():String
 */
public class Author {
    /* private instance data */
    private String authorName;
    private String email;
    private char gender;

    /** Custom constructor. */
    public Author(String authorName, String email, char gender) {
        this.authorName = authorName;
        this.gender = gender;
        this.email = email;
    }

    /** getter of authorName. */
    public String getAuthorName() {
        return authorName;
    }

    /** getter of email. */
    public String getEmail() {
        return email;
    }

    /** setter of email. */
    public void setEmail(String email) {
        this.email = email;
    }

    /** getter of gender. */
    public char getGender() {
        return gender;
    }

    /** Author description. */
    public String toString() {
        return String.format(
                "Author name: %s%n"
                        + "Contact email: %s%n"
                        + "Gender: %c%n",
                authorName, email, gender);
    }
}
