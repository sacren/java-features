/**
 * Another decision making.
 */
public class CheckOddEven {
  public static void main(String[] args) {
    isOddOrEven();
  }

  private static void isOddOrEven() {
    int number = 49;
    int remainder = number % 2;

    if (remainder == 0) {
      System.out.println(number + " is even.");
    } else {
      System.out.println(number + " is odd.");
    }
  }
}
