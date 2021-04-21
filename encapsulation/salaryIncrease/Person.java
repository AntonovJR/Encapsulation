package encapsulation.salaryIncrease;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        String format = "#######.###";
        DecimalFormat decimalFormat = new DecimalFormat(format);
        String number = decimalFormat.format(this.getSalary());

        return String.format("%s %s gets %s leva", this.getFirstName(), this.getLastName(), number);
    }

    public void increaseSalary(double bonus) {

        if (this.getAge() < 30) {
            bonus = ((bonus / 100) / 2) + 1;
        } else {
            bonus = (bonus / 100) + 1;
        }

        setSalary(getSalary() * bonus);
    }
}
