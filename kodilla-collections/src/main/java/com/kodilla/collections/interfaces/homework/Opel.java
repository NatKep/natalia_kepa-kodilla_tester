package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        System.out.println(speed);
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 15;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 15;
    }
}
