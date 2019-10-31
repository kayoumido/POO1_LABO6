package school;

public class Lesson {

    private Teacher teacher;
    private String subject;
    private int weekDay;
    private int periodBeginning;
    private int duration;
    private String classroom;


    public Lesson(Teacher teacher, String subject, int weekDay, int periodBeginning, int duration, String classroom) {
        this(subject, weekDay, periodBeginning, duration, classroom);
        this.teacher = teacher;
        this.teacher.setLesson(this);
    }

    private Lesson(String subject, int weekDay, int periodBeginning, int duration, String classroom) {

        // Check weekday validity
        if(weekDay < 0 || weekDay > 6){
            throw new IllegalArgumentException("The week day must be between 0 (monday) and 6 (sunday).");
        }

        this.subject = subject;
        this.weekDay = weekDay;
        this.periodBeginning = periodBeginning;
        this.duration = duration;
        this.classroom = classroom;
    }

    public static String horaire(){
        return "Horaire";
    }

}
