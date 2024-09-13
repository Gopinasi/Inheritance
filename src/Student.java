public class Student extends Person
{
    //Did along with video
    int gradeLevel;

    @Override
    public String toString() {
        return "Student{" + super.toString() + " gradeLevel=" + gradeLevel + "}";
    }

    public Student(String IDnum, String firstName, String lastName, String title, int YOB, int gradeLevel) {
        super(IDnum, firstName, lastName, title, YOB);
        this.gradeLevel = gradeLevel;
    }

    public Student(Person person, int gradeLevel){
        super(person.getIDnum(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getYOB());
        this.gradeLevel = gradeLevel;
    }


}
