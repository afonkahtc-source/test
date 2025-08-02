package lesson.l08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson/l08_context.xml"
        );

        ClassicalMusic classicalMusic = (ClassicalMusic) context.getBean("musicBean");
        System.out.println(classicalMusic.getSong());


//        MusicPlayer firstMusicPlayer = (MusicPlayer) context.getBean("musicPlayer");
//        MusicPlayer secondMusicPlayer = (MusicPlayer) context.getBean("musicPlayer");
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
