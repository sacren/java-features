/** Relational logic operators. */
public class RelationalLogicTest {
    public static void main(String[] args) {
        printRelationalLogic();
    }

    private static void printRelationalLogic() {
        final int age = 18;
        final double weight = 71.23;
        final double height = 191;
        final boolean married = false;
        final boolean attached = false;
        final char gender = 'm';

        System.out.printf(
                "Age = 18%n"
                    + "Weight = 71.23%n"
                    + "Height = 191%n"
                    + "Married = false%n"
                    + "Attached = false%n"
                    + "Gender = 'm'%n%n"
                    + "Given the facts above, evaluate relational logic%n"
                    + "Age 18, not married, not attached and male = %b%n"
                    + "Married and female = %b%n"
                    + "Height at least 180, weight at least above 65 and below 80 = %b%n"
                    + "Height at least above 180 or weight at least above 90 = %b%n",
                    age == 18 && !married && !attached
                        && Character.valueOf(gender).equals(Character.valueOf('m')),
                    married && Character.valueOf(gender).equals(Character.valueOf('f')),
                    height >= 180 && weight >= 65 && weight <= 80,
                    height >= 180 || weight >= 90);
    }
}
