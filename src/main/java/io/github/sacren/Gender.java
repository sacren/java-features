/**
 * Gender instance is used in Author class by method overloading.
 *
 * <p>Private instance variable:
 * -gender:String
 *
 * <p>Constructor:
 * +Gender()
 * +Gender(gender:char)
 * +Gender(gender:String)
 *
 * <p>Public methods:
 * +setGender(gender:String)
 * +setGender(gender:char)
 * +toString()
 */
public class Gender {
    /** Priviate instance variable. */
    private String gender;

    /** Gender default constructor. */
    public Gender() {
        setGender("Unknown");
    }

    /** Gender custom constructor with char. */
    public Gender(char gender) {
        setGender(gender);
    }

    /** Gender custom constructor with string. */
    public Gender(String gender) {
        setGender(gender);
    }

    /** Gender setter for the gender by string. */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** Gender setter for the gender by character. */
    public void setGender(char gender) {
        setGender(Character.toString(gender));
    }

    /** Gender instance string. */
    public String toString() {
        return gender;
    }
}
