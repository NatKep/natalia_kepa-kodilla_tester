package com.kodilla.collections.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {
        Square square = new Square(10.0);
        showShapeDetails(square);

        Circle circle = new Circle(7.00);
        showShapeDetails(circle);

        Triangle triangle = new Triangle(10.0, 12.0, 18.0);
        showShapeDetails(triangle);
    }

    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }




}
