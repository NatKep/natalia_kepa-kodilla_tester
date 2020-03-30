package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i].drawCar();
    }

    public static Car drawCar() {
        Random random = new Random();
        int numberOfSpeedIncrease = random.nextInt(11);
        //pętla ile wynosi numberOfSpeedIncrease tyle razy użyć metody increaseSpeed() na danym obiekcie samochodu

    }
}
