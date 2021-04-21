package encapsulation.validationData;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);

    }

    public void setFirstName(String firstName) {

        if(firstName.length()<3){
            throw new IllegalStateException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName.length()<3){
            throw new IllegalStateException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new IllegalStateException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<460){
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
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
