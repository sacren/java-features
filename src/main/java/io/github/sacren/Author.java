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

    /** Author constructor. */
    public Author(String authorName, String email, char gender) {
        this.authorName = authorName;
        this.email = email;
        this.gender = gender;
    }

    /** Author getter for author name. */
    public String getAuthorName() {
        return authorName;
    }

    /** Author getter for author email. */
    public String getEmail() {
        return email;
    }

    /** Author setter of author email. */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Author getter for author gender. */
    public char getGender() {
        return gender;
    }

    /** Author instance display. */
    public String toString() {
        return String.format(
                "Author name: %s%n"
                        + "Contact email: %s%n"
                        + "Gender: %c",
                authorName,
                email,
                gender);
    }
}
