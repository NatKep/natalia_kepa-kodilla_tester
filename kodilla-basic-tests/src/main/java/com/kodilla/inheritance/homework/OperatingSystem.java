package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

//    OperatingSystem constructor
    public OperatingSystem(int year) {
        this.year = year;
    }

//    methods
    public void turnOn() {
        System.out.println("Turning system on...");
    }
    public void turnOff() {
        System.out.println("Turning system off...");
    }

//   getter of year
    public int getYear() {
        return year;
    }

}
