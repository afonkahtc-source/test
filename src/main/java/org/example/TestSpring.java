package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music classicalMusic = (ClassicalMusic) context.getBean("musicBeanClassical");

        System.out.println(classicalMusic.getSong());

//        MusicPlayer firstmusicPlayer = (MusicPlayer) context.getBean(
//                "musicPlayer");
//        MusicPlayer secondmusicPlayer = (MusicPlayer) context.getBean(
//                "musicPlayer");
//
//        boolean comparison = firstmusicPlayer == secondmusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstmusicPlayer);
//        System.out.println(secondmusicPlayer);
//
//        firstmusicPlayer.setVolume(30);
//
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondmusicPlayer.getVolume());

        //musicPlayer.playMusic();

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
