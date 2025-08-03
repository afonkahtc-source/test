package lesson.l10_AnnotationAutowired;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hangarian Rhapsody";
    }
}
