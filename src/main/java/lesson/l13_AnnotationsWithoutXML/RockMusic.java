package lesson.l13_AnnotationsWithoutXML;

import org.springframework.stereotype.Component;

//@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {return "Wind cries Mary";}
}
