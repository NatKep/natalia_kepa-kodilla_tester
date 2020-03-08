package com.kodilla.inheritance.homework;

public class TestingOperatingSystems {

    public static void main (String[] args) {

//        operating system
        OperatingSystem operatingSystem = new OperatingSystem(2015);
        System.out.println("Opearting system year: " + operatingSystem.getYear());
        operatingSystem.turnOn();
        operatingSystem.turnOff();

//        operating system for phones
        OperatingSystemPhones operatingSystemPhones = new OperatingSystemPhones(2016);
        System.out.println("Opearting system for phones year: " + operatingSystemPhones.getYear());
        operatingSystemPhones.turnOn();
        operatingSystemPhones.turnOff();

//        operating system for watches
        OperatingSystemWatches operatingSystemWatches = new OperatingSystemWatches(2019);
        System.out.println("Opearting system for watches year: " + operatingSystemWatches.getYear());
        operatingSystemWatches.turnOn();
        operatingSystemWatches.turnOff();
    }





}
