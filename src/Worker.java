public class Worker extends Person{
    double hourlyPayRate;

    public Worker(String iDnum, String firstName, String lastName, String title, int YOB) {
        super(iDnum, firstName, lastName, title, YOB);
    }

    @Override
    public String toString() {

        return "Worker{" +
                super.toString() +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }

    public Worker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDnum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(Person person, double hourlyPayRate) {
        super(person.getIDnum(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getYOB());
        this.hourlyPayRate = hourlyPayRate;
    }

    double calculateWeeklyPay (double hoursWorked){

        if(hoursWorked <= 40){
            return hourlyPayRate*hoursWorked;
        }

        else{
            return (hourlyPayRate*40) + (hourlyPayRate*1.5)*(hoursWorked - 40);
        }
    }

    String displayWeeklyPay(double hoursWorked){
        double hoursWorkedReg;

        if(hoursWorked <= 40){
            hoursWorkedReg = hoursWorked;
        }
        else{
            hoursWorkedReg = 40;
        }

        System.out.print("Hours of regular pay: " + hoursWorkedReg + ", Total: " + hourlyPayRate*hoursWorked);

        if(hoursWorked > 40){
            System.out.print(", Hours of overtime pay: " + (hoursWorked - 40) + ", Total: " + (hourlyPayRate*1.5)*(hoursWorked - 40));
        }

        return ", Combined total pay = " + calculateWeeklyPay(hoursWorked);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + hourlyPayRate;
    }

    @Override
    public String toJSON(){
        char DQ = '\u0022';
        return "{" + super.toJSON() + ", " + DQ + "hourlyPayRate" + DQ + ":" + this.hourlyPayRate + "}";
    }

    @Override
    public String toXML(){
        return "<Worker>" + super.toXML() + "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate>" + "</Worker>";
    }
}
