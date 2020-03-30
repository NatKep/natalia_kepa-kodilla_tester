package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
            Ford ford = new Ford(0);
            doRace(ford);

            Opel opel = new Opel(0);
            doRace(opel);

            Tesla tesla = new Tesla(0);
            doRace(tesla);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();
    }
}
