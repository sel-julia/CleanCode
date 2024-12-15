package org.example.task2;

public class CommissionedEmployee extends Employee {

    public CommissionedEmployee() {
    }

    public CommissionedEmployee(String name, int yearsOfExperience, int workingHours) {
        super(name, yearsOfExperience, workingHours);
    }

    double calculatePay() {
        return 50 * getYearsOfExperience() * getWorkingHours();
    }

    double calculateBonus() {
        return this.getYearsOfExperience() > 5 ? 100 : 50;
    }

}
