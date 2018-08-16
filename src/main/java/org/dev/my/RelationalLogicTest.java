/**
 * Relational logic operators.
 */
public class RelationalLogicTest {
  public static void main(String[] args) {
    printRelationalLogic();
  }

  private static void printRelationalLogic() {
    int age = 18;
    double weight = 71.23;
    double height = 191;
    boolean married = false;
    boolean attached = false;
    char gender = 'm';

    System.out.println((age == 18 && !married && !attached && gender == 'm') + "\n"
                       + (married && gender == 'f') + "\n"
                       + (height >= 180 && weight >= 65 && weight <= 80) + "\n"
                       + (height >= 180 || weight >= 90));
  }
}
