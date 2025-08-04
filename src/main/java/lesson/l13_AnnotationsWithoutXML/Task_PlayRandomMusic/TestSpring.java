package lesson.l13_AnnotationsWithoutXML.Task_PlayRandomMusic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");

        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}
