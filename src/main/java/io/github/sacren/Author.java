/**
 * Author instance is used in Book class (reuse by composition).
 *
 * <p>Private instance variables:
 * -name:String
 * -email:String
 * -gender:char
 * -genderObj:Gender
 *
 * <p>Constructor:
 * +Author()
 * +Author(name:String, email:String, gender:char)
 * +Author(name:String, email:String, genderObj:Gender)
 *
 * <p>Public methods:
 * +setName(name:String):void
 * +setEmail(email:String):void
 * +setGender(gender:char):void
 * +setGender(genderObj:Gender):void
 * +getName():String
 * +getEmail():String
 * +getGender():char
 * +getGenderObj():Gender
 * +toString():String
 */
public class Author {
    /* private instance variables */
    private String name;
    private String email;
    private char gender;
    private Gender genderObj;

    /** Author default constructor. */
    public Author() {
        setGender();
    }

    /** Author custome constructor. */
    public Author(String name, String email, char gender) {
        setName(name);
        setEmail(email);
        setGender(gender);
    }

    /** Author custome constructor with Gender instance. */
    public Author(String name, String email, Gender gender) {
        setName(name);
        setEmail(email);
        this.genderObj = gender;
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
        this.genderObj = new Gender();
    }

    /** Author setter for author gender. */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /** Author setter for author gender. */
    public void setGender(Gender gender) {
        this.genderObj = gender;
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

    /** Author getter for author gender. */
    public Gender getGenderObj() {
        return genderObj;
    }

    /** Author instance formatted string. */
    public String toString() {
        return String.format(
                "Author name:   %s%n"
                        + "Author email:  %s%n"
                        + "%s",
                name,
                email,
                genderObj);
    }
}
