package com.kodilla.abstracts.homework;

public class JobApplication {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.getResp();
        teacher.getSalary();

        Politician politician = new Politician();
        politician.getResp();
        politician.getSalary();

        Trainer trainer = new Trainer();
        trainer.getResp();
        trainer.getSalary();
    }
}
