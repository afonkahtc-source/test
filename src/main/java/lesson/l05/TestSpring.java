package lesson.l05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson/l05_context.xml"
        );

//        Music music = (Music) context.getBean("musicBean");
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();

        //С помощью Spring внедрена зависимость - реазизован Dependency Injection
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
        musicPlayer.playMusic();

        context.close();
    }
}
