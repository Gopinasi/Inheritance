public class SalaryWorker extends Worker {
    double annualSalary;

    @Override
    public String toString() {
        return "SalaryWorker{" + super.toString() +
                "annualSalary=" + annualSalary +
                '}';
    }

    public SalaryWorker(String IDnum, String firstName, String lastName, String title, int YOB, double annualSalary) {
        super(IDnum, firstName, lastName, title, YOB);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(Worker worker, double annualSalary) {
        super(worker.getIDnum(), worker.getFirstName(), worker.getLastName(), worker.getTitle(), worker.getYOB());
        this.annualSalary = annualSalary;

    }


    @Override
    double calculateWeeklyPay(double hoursWorked) {
        return annualSalary/52;
    }

    @Override
    String displayWeeklyPay(double hoursWorked) {
        return "Weekly pay: " + annualSalary/52 + " is a fraction (1/52) of the annual salary: " + annualSalary;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + annualSalary;
    }

    @Override
    public String toJSON() {
        char DQ = '\u0022';
        return "{" + super.toJSON() + ", " + DQ + "annualSalary" + DQ + ":" + this.annualSalary + "}";
    }

    @Override
    public String toXML() {
        return "<salaryWorker>" + super.toXML() + "<annualSalary>" + annualSalary + "</annualSalary>" + "</salaryWorker>";
    }
}
