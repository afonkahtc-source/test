package lesson.l11_AnnotationQualifier;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hangarian Rhapsody";
    }
}
