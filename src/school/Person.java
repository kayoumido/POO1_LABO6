package school;

public class Person {
    private String firstName;
    private String lastName;

    Person(String fname, String lname) {
        this.firstName  = fname;
        this.lastName   = lname;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
