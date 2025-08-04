package lesson.l13_AnnotationsWithoutXML.Task_PlayRandomMusic;

//@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
