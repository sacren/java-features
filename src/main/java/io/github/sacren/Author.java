/**
 * Author instance is used in Book class (reuse by composition).
 *
 * <p>Private instance variables:
 * -name:String
 * -email:String
 * -gender:Gender
 *
 * <p>Constructor:
 * +Author()
 * +Author(name:String, email:String, gender:Gender)
 *
 * <p>Public methods:
 * +setName(name:String):void
 * +setEmail(email:String):void
 * +setGender():void
 * +setGender(gender:Gender):void
 * +getName():String
 * +getEmail():String
 * +getGender():Gender
 * +clone():Author
 * +toString():String
 */
public class Author {
    /* private instance variables */
    private String name;
    private String email;
    private Gender gender;

    /** Author default constructor. */
    public Author() {
        setGender();
    }

    /** Author custom constructor. */
    public Author(String name, String email, Gender gender) {
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
    public void setGender() {
        this.gender = new Gender();
    }

    /** Author setter for author gender. */
    public void setGender(Gender gender) {
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
    public Gender getGender() {
        return gender;
    }

    /** Author clone method for a copy of Author object. */
    public Author clone() {
        return new Author(name, email, gender);
    }

    /** Author instance formatted string. */
    public String toString() {
        return String.format(
                "Author name:   %s%n"
                        + "Author email:  %s%n"
                        + "Author gender: %s",
                name,
                email,
                gender);
    }
}
