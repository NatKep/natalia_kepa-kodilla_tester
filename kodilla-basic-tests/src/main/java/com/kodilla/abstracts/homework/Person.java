package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Animal;

public class Person {

    public String firstName;
    public int age;
    public String job;


    public Person(String firstName,int age,String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return firstName;
    }

    // metoda która wyświetli obowiązki danej osob w pracy

    public void process(Person person) {
        System.out.println(person.getName());

    }

}
