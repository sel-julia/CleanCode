package org.example.task2;

public class SalariedEmployee extends Employee {

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int yearsOfExperience, int workingHours) {
        super(name, yearsOfExperience, workingHours);
    }

    double calculatePay() {
        return 100 * getWorkingHours() * getYearsOfExperience()/10;
    }

    double calculateBonus() {
        return getWorkingHours() >= 100 ? 200 : 0;
    }
}
