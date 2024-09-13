import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw1, sw2;
    @BeforeEach
    void setUP()
    {
        sw1 = new SalaryWorker ("00000001", "Bob", "Tester1", "Mr.", 1960, 84500.0);
        sw2 = new SalaryWorker("00000002", "Sally", "Tester2", "Mrs.", 1867, 59228.0);
    }

    @Test
    void calculateWeeklyPay() {
        double expected = 84500.0/52;
        assertEquals(expected, sw1.calculateWeeklyPay(845.0));
    }

    @Test
    void displayWeeklyPay() {
        String expected =  "Weekly pay: 1139.0 is a fraction (1/52) of the annual salary: 59228.0";
        assertEquals(expected, sw2.displayWeeklyPay(59228.0));
    }

    @Test
    void testToCSV() {
        String expected = "00000001, Bob, Tester1, Mr., 1960, 0.0, 84500.0";
        assertEquals(expected, sw1.toCSV());
    }

    @Test
    void testToJSON() {
        String expected = "{{{\"IDNum\":00000002\", \"firstName\":Sally\", \"lastName\":Tester2\", \"title\":Mrs.\", \"YOB\":1867}, \"hourlyPayRate\":0.0}, \"annualSalary\":59228.0}";
        assertEquals(expected, sw2.toJSON());
    }

    @Test
    void testToXML() {
        String expected = "<salaryWorker><Worker><Person><IDNum>00000001</IDNum><firstName>Bob</firstName><lastName>Tester1</lastName><title>Mr.</title><YOB>1960</YOB></Person><hourlyPayRate>0.0</hourlyPayRate></Worker><annualSalary>84500.0</annualSalary></salaryWorker>";
        assertEquals(expected, sw1.toXML());
    }
}