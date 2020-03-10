package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double a;  // długość pierwszego boku
    private double b;  // długość drugiego boku

    // konstruktor Shape
    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }
    // abstrakcyjna metoda licząca pole powierzchni
    public abstract double surfaceArea();


    // abstrakcyjna metoda licząca obwód
    public abstract double countPerimeter();


    // getter a
    public double getA() {
        return a;
    }

    // getter b - bok kwadratu
    public double getB() {
        return b;
    }
}
