package school;

import java.util.ArrayList;

public class Group {

    private int numero;
    private String orientation;
    private int trimester;
    private ArrayList<Student> students;


    public Group(int numero, String orientation, int trimester, ArrayList<Student> students){
        // Check weekday validity
        if(trimester < 1 || trimester > 6){
            throw new IllegalArgumentException("The week day must be between 0 (monday) and 6 (sunday).");
        }

        this.numero = numero;
        this.orientation = orientation;
        this.trimester = trimester;
        this.students = students;
    }


    public String name () {
        return orientation + numero + "-" + trimester ;
    }

    public int nombreEtudiants() {
        return students.size();
    }

    public void definirLecon() {

    }

    public String horaire(){
        return "";
    }
}
