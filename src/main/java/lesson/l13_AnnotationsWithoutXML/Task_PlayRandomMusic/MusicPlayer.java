package lesson.l13_AnnotationsWithoutXML.Task_PlayRandomMusic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> styles;

    public MusicPlayer(List<Music> styles) {
        this.styles = styles;
    }

    public String playMusic() {
        Random rand = new Random();
        return "Playing: " + styles.get(rand.nextInt(styles.size())).getSong();
    }
}