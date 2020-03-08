package com.kodilla.inheritance;

public class Application {

    public static void main (String[] args) {
        Car car = new Car(4,5);
        car.turnOnLights();

//        int wheelsNum = car.getWheels();
//        System.out.println("Number of wheels: " + wheelsNum);
//        int seatsNum = car.getSeats();
//        System.out.println("Number of seats: " + seatsNum);


        Convertible convertible = new Convertible(4,2);
        convertible.turnOnLights();
        System.out.println(car.getSeats());
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();

    }

}
