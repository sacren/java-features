/**
 * Pension class for employee and employer contribution.
 *
 * <p>Age 55 and below: employee 20%, employer 17%.
 *
 * <p>Age 55+ to 60: employee 13%, employer 13%.
 *
 * <p>Age 60+ to 65: employee 7.5%, employer 9%.
 *
 * <p>Age 65+: employee 5%, employer 7.5%.
 *
 * <p>Max salary to attract contribution: 6000.
 *
 * <p>Private instance data:
 * -salary:double
 * -age:int
 *
 * <p>Constructor:
 * +Pension(salary:double, age:int)
 *
 * <p>Public methods:
 * +setSalary(salary:double):void
 * +setAge(age:int):void
 * +setContribByAge():void
 * +getEeContrib():double
 * +getErContrib():double
 * +toString():String
 */
public class Pension {
    /* private static data */
    private static final Point CONTRIB55 = new Point(0.2, 0.17);
    private static final Point CONTRIB60 = new Point(0.13, 0.13);
    private static final Point CONTRIB65 = new Point(0.075, 0.09);
    private static final Point CONTRIB65UP = new Point(0.05, 0.075);
    /* max salary to attract contribution */
    private static final double MAX_ATTR = 6000;

    /* private instance data */
    private double salary;
    private int age;
    private Point contribByAge;

    /** Pension constructor. */
    public Pension(double salary, int age) {
        setSalary(salary);
        setAge(age);
        setContribByAge();
    }

    /** Pension setter for salary. */
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", salary));
        }
        if (salary > MAX_ATTR) {
            salary = MAX_ATTR;
        }
        this.salary = salary;
    }

    /** Pension setter for age. */
    public void setAge(int age) {
        if (age < 20) {
            throw new IllegalArgumentException(
                    String.format("%d years old is too young!", age));
        }
        this.age = age;
    }

    /** Pension setter for contribution by age. */
    public void setContribByAge() {
        if (age > 65) {
            contribByAge = CONTRIB65UP;
            return;
        }
        if (age > 60) {
            contribByAge = CONTRIB65;
            return;
        }
        if (age > 55) {
            contribByAge = CONTRIB60;
            return;
        }
        contribByAge = CONTRIB55;
    }

    /** Pension getter for employee contribution. */
    public double getEeContrib() {
        return salary * contribByAge.getX();
    }

    /** Pension getter for employer contribution. */
    public double getErContrib() {
        return salary * contribByAge.getY();
    }

    /** Pension string method. */
    public String toString() {
        return String.format(
                "Monthly salary:        %.2f%n"
                        + "Employee age:          %d%n"
                        + "Employee contribution: %.2f%n"
                        + "Employer contribution: %.2f%n"
                        + "Total contribution:    %.2f",
                salary,
                age,
                getEeContrib(),
                getErContrib(),
                getEeContrib() + getErContrib());
    }
}
