package lesson.l09_AnnotationComponent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson/l09_context(oneLine).xml"
        );

        Music music = (Music) context.getBean("musicBean");
        MusicPlayer rockMusicPlayer = new MusicPlayer(music);
        rockMusicPlayer.playMusic();

        Music music2 = (Music) context.getBean("classicalMusic");
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        classicalMusicPlayer.playMusic();

        context.close();
    }
}
