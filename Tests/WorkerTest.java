import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest{
    Worker w1, w2;

    @BeforeEach
    void setUP()
    {
        Person.setIDSeed(0);
        w1 = new Worker ("00000001", "Bob", "Tester1", "Mr.", 1960,16.0);
        w2 = new Worker("00000002", "Sally", "Tester2", "Mrs.", 1867,17.5);
    }

    @Test
    void testCalculateWeeklyPay() {
        double expected = (16*40)+(16*1.5)*(43 - 40);
        assertEquals(expected, w1.calculateWeeklyPay(43));

    }

   @Test
    void testDisplayWeeklyPay() {
        String expected = ", Combined total pay = 1015.0";
        assertEquals(expected, w2.displayWeeklyPay(52));
    }

    @Test
    void testToCSV() {
        String expected = "00000001, Bob, Tester1, Mr., 1960, 16.0";
        assertEquals(expected, w1.toCSV());

    }

    @Test
    void testToJSON() {
        String expected = "{{\"IDNum\":00000002\", \"firstName\":Sally\", \"lastName\":Tester2\", \"title\":Mrs.\", \"YOB\":1867}, \"hourlyPayRate\":17.5}";
        assertEquals(expected, w2.toJSON());
    }

    @Test
    void testToXML() {
        String expected = "<Worker><Person><IDNum>00000001</IDNum><firstName>Bob</firstName><lastName>Tester1</lastName><title>Mr.</title><YOB>1960</YOB></Person><hourlyPayRate>16.0</hourlyPayRate></Worker>";
        assertEquals(expected, w1.toXML());
    }
}