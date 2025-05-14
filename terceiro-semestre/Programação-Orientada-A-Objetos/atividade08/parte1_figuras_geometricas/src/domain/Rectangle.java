package domain;

import interfaces.AreaCalculation;

public class Rectangle implements AreaCalculation {
    public double base;
    public double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}
