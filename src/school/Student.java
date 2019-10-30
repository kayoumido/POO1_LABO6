package school;

public class Student extends Person {

    private int idNumber;

    public Student(String fname, String lname, int id) {
        super(fname, lname);

        this.idNumber = id;
    }

    @Override
    public String toString() {
        return "Stud. " + super.toString() + " (#" + this.idNumber + ")";
    }
}
