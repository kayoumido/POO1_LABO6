package school;

public class Teacher extends Person {

    private String abbreviation;
    private Lesson[] lessons;

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


    void setLesson (Lesson lesson) {
        // Add new lesson into the static array
        Lesson[] newLessons = new Lesson[this.lessons.length + 1];
        int nbLessons = this.lessons.length;

        for (int i = 0; i < nbLessons; ++i) {
            newLessons[i] = this.lessons[i];
        }
        
        newLessons[nbLessons + 1] = lesson;
        this.lessons = newLessons;

        // TODO : Si 2 fois meme lessons
    }


    @Override
    public String toString() {
        return "Teach. " + super.toString() + " (" + this.abbreviation + ")";
    }
}
