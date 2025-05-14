package domain;

import interfaces.AreaCalculation;

public class Square implements AreaCalculation {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
