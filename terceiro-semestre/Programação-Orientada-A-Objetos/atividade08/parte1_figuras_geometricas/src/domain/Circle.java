package domain;

import interfaces.AreaCalculation;

public class Circle implements AreaCalculation {
    public final double PI_VALUE = 3.14;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI_VALUE * radius * radius;
    }
}
