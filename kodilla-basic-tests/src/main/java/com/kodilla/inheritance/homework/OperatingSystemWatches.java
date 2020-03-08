package com.kodilla.inheritance.homework;

public class OperatingSystemWatches extends OperatingSystem {
    public OperatingSystemWatches(int year) {
        super(year);
//        System.out.println("OpeartingSystemWatches year: " + year);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning watch system on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning watch system off...");
    }

}
