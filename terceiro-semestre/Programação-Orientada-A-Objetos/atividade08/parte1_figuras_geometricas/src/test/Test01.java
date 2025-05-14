package test;

import domain.*;


public class Test01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(5, 3);
        Triangle triangle = new Triangle(4, 2);
        Square square = new Square(3);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
        System.out.println(square.calculateArea());
    }
}
