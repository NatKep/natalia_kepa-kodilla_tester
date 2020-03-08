package com.kodilla.inheritance.homework;

public class OperatingSystemPhones extends OperatingSystem {

    public OperatingSystemPhones(int year) {
        super(year);
//        System.out.println("OpeartingSystemPhones year: " + year);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning phone system on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning phone system off...");
    }
}
