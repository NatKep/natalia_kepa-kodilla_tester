package com.kodilla.collections.interfaces.homework;

public class Tesla implements Car {

    private int speed;

    public Tesla(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        System.out.println(speed);
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 25;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 15;
    }
}
