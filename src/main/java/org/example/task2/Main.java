package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee commissionedEmployee = new CommissionedEmployee("CommissionedEmployee 1", 1, 40);
        Employee salariesEmployee = new SalariedEmployee("SalariedEmployee 2", 5, 20);
        Employee hourlyEmployee = new HourlyEmployee("HourlyEmployee 3", 0, 10);

        List<Employee> employees = new ArrayList();
        employees.add(commissionedEmployee);
        employees.add(salariesEmployee);
        employees.add(hourlyEmployee);

        employees.stream().forEach(e -> {
            System.out.println("----------------------");
            System.out.println("User: " + e.getName());
            System.out.println("Pay: " + e.calculatePay());
            System.out.println("Bonus: " + e.calculateBonus());
        });

    }

}
