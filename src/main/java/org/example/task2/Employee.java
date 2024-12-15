package org.example.task2;

public abstract class Employee {

    private String name;
    private int yearsOfExperience;
    private int workingHours;

    public Employee() {}

    public Employee(String name, int yearsOfExperience, int workingHours) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.workingHours = workingHours;
    }

    abstract double calculatePay();

    abstract double calculateBonus();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
