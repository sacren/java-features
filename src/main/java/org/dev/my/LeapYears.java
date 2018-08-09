/**
 * All the leap years between AD1 and AD2010, and also print the number of leap
 * years.
 */
public class LeapYears {
  public static void main(String[] args) {
    printLeapYears();
  }

  private static void printLeapYears() {
    int upperBound = 2010;
    int lowerBound = 1;
    int count = 0;

    for (int i = lowerBound; i <= upperBound; i++) {
      if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
        System.out.println(i);
        count++;
      }
    }

    System.out.println("Number of leap years is " + count + ".");
  }
}
