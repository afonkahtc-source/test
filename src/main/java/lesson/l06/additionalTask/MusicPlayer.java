package lesson.l06.additionalTask;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    //Необходим для бина
    public MusicPlayer() {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {

        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
