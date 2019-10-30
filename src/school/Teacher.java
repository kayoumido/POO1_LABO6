package school;

public class Teacher extends Person {
    private String abbreviation;

    public Teacher(String fname, String lname, String abbr) {
        super(fname, lname);

        this.abbreviation = abbr;
    }

    public String abbreviation() {
        return abbreviation;
    }

    public String schedule() {
        return "";
    }

    @Override
    public String toString() {
        return "Teach. " + super.toString() + " (" + this.abbreviation + ")";
    }
}
