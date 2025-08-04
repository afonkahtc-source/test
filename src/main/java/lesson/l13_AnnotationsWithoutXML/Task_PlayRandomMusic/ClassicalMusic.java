package lesson.l13_AnnotationsWithoutXML.Task_PlayRandomMusic;

//@Component
//@Scope("singleton")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hangarian Rhapsody";
    }
}
