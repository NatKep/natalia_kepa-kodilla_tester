package com.kodilla.abstracts.homework;

public abstract class Job {

    private double salary;
    private String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public String getResp() {
        System.out.println(responsibilities);
        return responsibilities;
    }

    public double getSalary() {
        System.out.println(salary);
        return salary;
    }
}
