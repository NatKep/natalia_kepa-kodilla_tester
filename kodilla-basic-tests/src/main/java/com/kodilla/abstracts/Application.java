package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {

        // utworzenie obiektu dog na dwa sposoby
//        Dog dog = new Dog();
        Animal dog = new Dog();
        dog.giveVoice();

        // utworzenie obiektu duck
        Duck duck = new Duck();
        duck.giveVoice();

        // utworzenie obiektu processor z klasy AnimalProcessor
        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog); // Dog jest dzieckiem klasy Animal, więc metoda może zostać wywołana


    }
}
