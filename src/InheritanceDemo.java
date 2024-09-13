import java.sql.SQLOutput;
import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {

        ArrayList<Worker> employees = new ArrayList<>();

        Worker Hannah = new Worker("000001", "Hannah", "Regal", "Mrs.",1987, 15.19);
        employees.add(Hannah);

        Worker Elliot = new Worker("000002","Elliot", "Harper", "Mr.", 1972, 22.50);
        employees.add(Elliot);

        Worker Ava = new Worker("000003", "Ava", "Thompson", "Mrs.", 2000, 18.75);
        employees.add(Ava);

        SalaryWorker Leo = new SalaryWorker("000004", "Leo", "Carter", "Mr.", 1983, 65000.0);
        employees.add(Leo);

        SalaryWorker Mia = new SalaryWorker("000005", "Mia", "Brooks", "Mrs.", 1992, 71000.0);
        employees.add(Mia);

        SalaryWorker Clara = new SalaryWorker("000006", "Clara", "Dillard", "Mrs.", 2002, 82500.0);
        employees.add(Clara);

        int[] hoursPerWeek = {40,50,40};

        System.out.printf("%s   %s    %s\n", "Week", "Worker", "Weekly Pay");

        for (int i = 0; i < hoursPerWeek.length; i++) {

            double hours = hoursPerWeek[i];

            for (Worker people : employees) {

                System.out.printf(" %s     %s       %s \n", i+1, people.getFirstName(), people.calculateWeeklyPay(hours));

        }
        }

    }
}
