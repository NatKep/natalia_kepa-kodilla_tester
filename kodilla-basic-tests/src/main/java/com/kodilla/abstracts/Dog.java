package com.kodilla.abstracts;

public class Dog extends Animal {

    // konstruktor klasy Dog
    public Dog() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");
    }
}
