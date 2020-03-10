package com.kodilla.abstracts;

public class Duck extends Animal {

    // konstruktor klasy Duck
    public Duck() {
        super(2);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }


}
