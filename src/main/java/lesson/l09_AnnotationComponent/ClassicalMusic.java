package lesson.l09_AnnotationComponent;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hangarian Rhapsody";
    }
}
