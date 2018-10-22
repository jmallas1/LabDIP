package dip.lab1.test;

import dip.lab1.HourlyEmployee;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    private HourlyEmployee emp;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        emp = new HourlyEmployee(10.50, 2020);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getAnnualWages() {
        assertEquals(21210d, emp.getAnnualCompensation(), "Total wages for year");
    }

    @org.junit.jupiter.api.Test
    void getHourlyRate() { assertEquals(10.50d, emp.getHourlyRate(), "Hourly rate");
    }

    @org.junit.jupiter.api.Test
    void setHourlyRate() {
        emp.setHourlyRate(11.50d);
        assertEquals(11.50d, emp.getHourlyRate(), "New rate");
    }

    @org.junit.jupiter.api.Test
    void getTotalHrsForYear() { assertEquals(2020, emp.getTotalHrsForYear(), "Total hours");
    }

    @org.junit.jupiter.api.Test
    void setTotalHrsForYear() {
        emp.setTotalHrsForYear(2080);
        assertEquals(2080, emp.getTotalHrsForYear(), "More hours");
    }
}