package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music = context.getBean("musicBeanClassical",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = (MusicPlayer) context.getBean(
                "musicPlayer");
        musicPlayer.playMusic();

        context.close();
    }
}
