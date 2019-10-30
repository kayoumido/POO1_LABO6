
import school.Student;
import school.Teacher;

public class Main {

    public static void main(String[] args) {
        Teacher pier = new Teacher("Pier", "Donini", "PDO");
        Teacher marc = new Teacher("Marc", "Dikötter", "MDK");

        Student john    = new Student("John", "Lennon", 1234);
        Student paul    = new Student("Paul", "Mc Cartney", 2341);
        Student ringo   = new Student("Ringo", "Starr", 3412);
        Student george  = new Student("George", "Harisson", 4321);
        Student roger   = new Student("Roger", "Waters", 1324);
        Student david   = new Student("David", "Gilmour", 4312);
    }
}
