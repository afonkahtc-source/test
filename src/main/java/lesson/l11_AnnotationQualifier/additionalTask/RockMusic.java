package lesson.l11_AnnotationQualifier.additionalTask;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("listRockMusic")
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("Wind cries Mary", "Bohemian Rhapsody", "Stairway to Heaven");
    }
}
