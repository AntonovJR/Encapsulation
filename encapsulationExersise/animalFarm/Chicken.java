package encapsulationExersise.animalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalStateException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalStateException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        double product = calculateProductPerDay();

        return product;
    }

    private double calculateProductPerDay() {
        double productPerDay = 0;
        if (this.age <= 5) {
            productPerDay += 2;
        } else if (this.age <= 11) {
            productPerDay += 1;
        } else {
            productPerDay += 0.75;
        }
        return productPerDay;
    }

    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, productPerDay());
    }


}
