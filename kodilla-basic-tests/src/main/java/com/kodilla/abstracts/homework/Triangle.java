package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    double c = 9;   // trzeci bok trójkąta
    double h = 13;  // wysokość trójkąta

    // konstruktor klasy Triangle
    public Triangle() {
        super(7, 8);
    }

    // getter c
    public double getC() {
        return c;
    }

    // getter h
    public double getH() {
        return h;
    }

    @Override
    public double surfaceArea() {
        double area = getA() * getH() / 2;
        System.out.println("Pole trójkąta: " + area);
        return area;
    }

    @Override
    public double countPerimeter() {
        double perimeter = getA() + getB() + getC();
        System.out.println("Obwód trójkąta: " + perimeter);
        return perimeter;
    }
}
