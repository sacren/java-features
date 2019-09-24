/**
 * Gender instance is used in Author class by method overloading.
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
        this.gender = Character.toString(gender);
    }

    /** Gender instance formatted string. */
    public String toString() {
        return String.format("Author gender: %s", gender);
    }
}
