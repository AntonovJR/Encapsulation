package encapsulationExersise.classBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (!isPositiveNumber(length)) {
            throw new IllegalStateException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private boolean isPositiveNumber(double number) {
        return number > 0;
    }

    private void setWidth(double width) {
        if (!isPositiveNumber(width)) {
            throw new IllegalStateException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (!isPositiveNumber(height)) {
            throw new IllegalStateException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return (2 * this.length * this.height) + (2 * this.width * this.height) + (2 * this.width * this.length);
    }

    public double calculateLateralSurfaceArea() {
        return (2 * this.length * this.height) + (2 * this.width * this.height);
    }

    public double calculateVolume() {
        return this.length * this.height * this.width;
    }




}
