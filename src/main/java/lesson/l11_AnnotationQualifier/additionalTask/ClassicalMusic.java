package lesson.l11_AnnotationQualifier.additionalTask;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("listClassicalMusic")
public class ClassicalMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("Hangarian Rhapsody", "Day of Victory", "Lonely Day");
    }
}
