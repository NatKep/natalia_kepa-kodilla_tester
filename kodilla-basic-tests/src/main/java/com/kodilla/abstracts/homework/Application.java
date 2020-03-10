package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square();
        square.surfaceArea();
        square.countPerimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.surfaceArea();
        rectangle.countPerimeter();

        Triangle triangle = new Triangle();
        triangle.surfaceArea();
        triangle.countPerimeter();
    }
}
