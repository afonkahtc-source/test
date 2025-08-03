package lesson.l11_AnnotationQualifier.additionalTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("computer1")
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(@Qualifier("musicPlayer1") MusicPlayer musicPlayer) {
        this.id=1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }
}
