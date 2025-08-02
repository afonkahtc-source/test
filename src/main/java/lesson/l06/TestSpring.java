package lesson.l06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson/l06_context.xml"
        );

        //Вот это всё за меня делает bean "musicPlayer"
//        Music music = (Music) context.getBean("musicBean");
//        MusicPlayer musicPlayer2 = new MusicPlayer();
//        musicPlayer2.setMusic(music);
//        musicPlayer2.playMusic();

        //С помощью Spring внедрена зависимость - реазизован Dependency Injection
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
