package com.kodilla.inheritance;

public class Car {
//    deklaracja prywatnych zmiennych
    private int wheels;
    private int seats;

//    konstruktor Car
    public Car(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
//        System.out.println("Car constructor");
    }

//    metody
    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }
    public void openDoors() {
        System.out.println("Opening 4 doors");
    }

//    metoda do wyświetlania liczb miejsc
    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }




//    gettery
    public int getWheels() {
        return wheels;
    }
    public int getSeats() {
        return seats;
    }
}
