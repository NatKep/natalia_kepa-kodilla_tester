package com.kodilla.abstracts;

public class AnimalProcessor {

    // metoda process, przyjmująca w argumencie abstrakcyjny typ Animal
    // metoda ta może zostać wywołana z każdego obiektu, kóry jest dzieckiem Animal
    public void process(Animal animal) {
        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs");
        animal.giveVoice();
    }
}
