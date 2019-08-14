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
 * <p>Minimum age: 18.
 *
 * <p>Max salary to attract contribution: 6000.
 *
 * <p>Private instance data:
 * -salary:double
 * -age:int
 * -contribByAge:Point
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
        if (age < 18) {
            throw new IllegalArgumentException(
                    String.format("%d years old is too young!", age));
        }
        this.age = age;
    }

    /** Pension setter for contribution by age. */
    public void setContribByAge() {
        if (age > 65) {
            contribByAge = new Point(0.05, 0.075); /* 65+ */
            return;
        }
        if (age > 60) {
            contribByAge = new Point(0.075, 0.09); /* 60+ to 65 */
            return;
        }
        if (age > 55) {
            contribByAge = new Point(0.13, 0.13); /* 55+ to 60 */
            return;
        }
        contribByAge = new Point(0.2, 0.17); /* 55 and below */
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
                "Attracting salary:     %.2f%n"
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
