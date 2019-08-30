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
 * +setName(name:String):void
 * +setEmail(email:String):void
 * +setGender(gender:char):void
 * +getName():String
 * +getEmail():String
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
        setName(name);
        setEmail(email);
        setGender(gender);
    }

    /** Author setter for author name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Author setter for author email. */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Author setter for author gender. */
    public void setGender(char gender) {
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
