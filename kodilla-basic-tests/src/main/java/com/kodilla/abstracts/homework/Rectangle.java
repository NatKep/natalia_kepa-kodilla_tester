package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    // konstruktor klasy Rectangle
    public Rectangle() {
        super(5,10);
    }

    @Override
    public double surfaceArea() {
        double area = getA() * getB();
        System.out.println("Pole prostokąta: " + area);
        return area;
    }

    @Override
    public double countPerimeter() {
        double perimeter = getA() * 2 + getB() * 2;
        System.out.println("Obwód prostokąta: " + perimeter);
        return perimeter;
    }
}
