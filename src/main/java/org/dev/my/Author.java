/**
 * Author class.
 *
 * <p>Private data with default values:
 * -name:String
 * -email:String
 * -gender:char
 *
 * <p>Constructor:
 * +Author(name:String, email:String, gender:char)
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
    private String name;
    private String email;
    private char gender;

    /** Custom constructor. */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    /** getter of name. */
    public String getName() {
        return name;
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
                "Name: %s%n"
                        + "Contact email: %s%n"
                        + "Gender: %c%n",
                name, email, gender);
    }
}
