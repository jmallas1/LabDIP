package dip.lab1.test;

import dip.lab1.SalariedEmployee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalariedEmployeeTest {

    SalariedEmployee emp;

    @BeforeEach
    void setUp() {
         emp = new SalariedEmployee(45000, 1250);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAnnualBonus() { assertEquals(1250d, emp.getAnnualBonus(), "Bonus time");
    }

    @Test
    void setAnnualBonus() {
        emp.setAnnualBonus(2000);
        assertEquals(2000d, emp.getAnnualBonus(), "Better bonus");
    }

    @Test
    void getAnnualSalary() {
        assertEquals(45000, emp.getAnnualSalary(), "Gettin paid");
    }

    @Test
    void setAnnualSalary() {
        emp.setAnnualSalary(50000d);
        assertEquals(50000d, emp.getAnnualSalary(), "Got a raise");
    }
}