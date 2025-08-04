package lesson.l13_AnnotationsWithoutXML;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hangarian Rhapsody";
    }
}
