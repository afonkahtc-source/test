package lesson.l11_AnnotationQualifier.additionalTask;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson/l11_context(oneLine).xml"
        );

        Computer computer = (Computer) context.getBean("computer1");
        System.out.println(computer);

        context.close();
    }
}
