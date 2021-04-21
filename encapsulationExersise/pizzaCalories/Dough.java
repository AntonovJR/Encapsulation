package encapsulationExersise.pizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!"White".equals(flourType) &&!"Wholegrain".equals(flourType)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if(!"Homemade".equals(bakingTechnique) && !"Crispy".equals(bakingTechnique) && !"Chewy".equals(bakingTechnique)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1||weight>200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");

        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return this.weight * 2 * getModifiersByDough(this.flourType)*getModifiersByDoughTechnique(this.bakingTechnique);
    }

    private double getModifiersByDoughTechnique(String bakingTechnique) {
        switch (bakingTechnique){
            case "Homemade":
                return 1.0;
            case "Crispy":
                return 0.9;
            case "Chewy":
                return 1.1;
        }
        return 0.0;
    }

    private double getModifiersByDough(String flourType) {
        switch (flourType) {
            case "White":
                return 1.5;
            case "Wholegrain":
                return 1.0;

        }
        return 0.0;
    }

}
