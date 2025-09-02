package lesson.l13_AnnotationsWithoutXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        System.out.println(musicPlayer.playMusic());

        context.close();

        System.out.println("Имитация командной работы");
    }
}
