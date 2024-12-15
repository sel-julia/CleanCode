package org.example.task2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

// TODO add tests
public class SalariedEmployeeTest {

    @Test
    public void calculateBonus_forEmployeeWithoutExperience() {
        Employee employee = new SalariedEmployee("name", 0, 0);

        double result = employee.calculateBonus();

        assertEquals(0D, result);
    }
}
