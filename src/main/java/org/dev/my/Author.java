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
    /* public static data */
    public static final String AUTHOR_NAME = "Dennis Ritchie";
    public static final char AUTHOR_GENDER = 'M';

    /* private instance data */
    private String name;
    private String email;
    private char gender;

    /** Custom constructor. */
    public Author(String name, String email, char gender) {
        this.name = AUTHOR_NAME;
        this.gender = AUTHOR_GENDER;
        setEmail(email);
    }

    /** Public accessor for name. */
    public String getName() {
        return name;
    }

    /** Public accessor for email. */
    public String getEmail() {
        return email;
    }

    /** Public mutator for email. */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Public accessor for gender. */
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
