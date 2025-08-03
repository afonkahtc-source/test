package lesson.l10_AnnotationAutowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson/l10_context(oneLine).xml"
        );

        //Пример 1
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
        System.out.println(musicPlayer.playMusic());

        //Пример 2
        Computer computer = (Computer) context.getBean("computer");
        System.out.println(computer);

        context.close();
    }
}
