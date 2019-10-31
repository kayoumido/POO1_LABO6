package school;

public class Student extends Person {

    private int idNumber;
    private Group group;

    public Student(String fname, String lname, int id, Group group) {
        super(fname, lname);

        this.idNumber = id;
        this.group = group;
    }

    public Student(String fname, String lname, int id) {
        this(fname, lname, id, null);
    }

    void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Stud. " + super.toString() + " (#" + this.idNumber + ")" + (
                this.group != null ? " - " + this.group.name() : ""
        );
    }
}
