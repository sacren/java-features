/**
 * Author class is used in Book class (reuse by composition).
 *
 * <p>Private instance data:
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

    /** Author constructor. */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    /** Author getter for author name. */
    public String getName() {
        return name;
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

    /** Author string method. */
    public String toString() {
        return String.format(
                "Author name:   %s%n"
                        + "Contact email: %s%n"
                        + "Gender:        %c",
                name,
                email,
                gender);
    }
}
