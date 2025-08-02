package lesson.l08_init_destroy_factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson/l08_context.xml"
        );

        ClassicalMusic classicalMusic = (ClassicalMusic) context.getBean("musicBean");
        System.out.println(classicalMusic.getSong());

        context.close();
    }
}
