package com.kodilla.abstracts.homework;

public class Square extends Shape {

    // konstruktor klasy Square
    public Square() {
        super(5,5);
    }

    @Override
    public double surfaceArea() {
        double area = getA() * getB();
        System.out.println("Pole kwadratu: " + area);
        return area;
    }

    @Override
    public double countPerimeter() {
        double perimeter = getA() * 4;
        System.out.println("Obwód kwadratu: " + perimeter);
        return perimeter;
    }

}
