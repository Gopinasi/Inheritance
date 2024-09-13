import java.sql.SQLOutput;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Did along with video and some extra.
    public static void main(String[] args) {
        ArrayList<Person> folks = new ArrayList<>();
        Person fred = new Person("Fred", "Williams","Mr.",2011);
        folks.add(fred);

        Worker fredw = new Worker(fred, 12);

       Worker w1 = new Worker ("00000001", "Bob", "Tester1", "Mr.", 1960,16.0);
        Worker w2 = new Worker("00000002", "Sally", "Tester2", "Mrs.", 1867,17.5);

        System.out.println(w2.displayWeeklyPay(52));
        System.out.println();
        System.out.println(w1.calculateWeeklyPay(40));

    }

}