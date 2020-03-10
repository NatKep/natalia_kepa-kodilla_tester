package com.kodilla.abstracts;

public abstract class Animal {

    private int numberOfLegs;  // prywatna zmienna

    // konstruktor Animal
    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    // getter
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public abstract void giveVoice();
}
