package lesson.l12_OtherAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson/l12_context.xml"
        );

        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
