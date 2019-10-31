package school;

public class Group {

    private int numero;
    private String orientation;
    private int trimester;
    private Student[] students;
    private Lesson[] lessons;


    public Group(int numero, String orientation, int trimester, Student ... students){
        // Check weekday validity
        if(trimester < 1 || trimester > 6){
            throw new IllegalArgumentException("The week day must be between 0 (monday) and 6 (sunday).");
        }

        // TODO : Si y a deux fois le meme etudiant -> Error

        this.numero = numero;
        this.orientation = orientation;
        this.trimester = trimester;
        this.students = students;

        for(Student s : this.students){
            s.setGroup(this);
        }
    }


    public String name () {
        return orientation + numero + "-" + trimester ;
    }

    public int nombreEtudiants() {
        return students.length;
    }

    public void definirLecon(Lesson ... lessons) {
        // TODO : pas qu il y aie deux fois la même lecon
        this.lessons = lessons;
    }

    public String horaire(){
        return "";
    }
}
