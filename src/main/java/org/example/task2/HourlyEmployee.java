package org.example.task2;

public class HourlyEmployee extends Employee {

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int yearsOfExperience, int workingHours) {
        super(name, yearsOfExperience, workingHours);
    }

    double calculatePay() {
        return 70 * getWorkingHours();
    }

    double calculateBonus() {
        return 100;
    }

}
