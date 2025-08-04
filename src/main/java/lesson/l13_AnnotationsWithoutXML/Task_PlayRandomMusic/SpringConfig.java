package lesson.l13_AnnotationsWithoutXML.Task_PlayRandomMusic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public List<Music> musicStylesList(){return List.of(
            electronicPopMusic(),
            classicalMusic(),
            rockMusic());}

    @Bean
    public ElectronicPopMusic electronicPopMusic() {return new ElectronicPopMusic();}

    @Bean
    public ClassicalMusic classicalMusic(){return new ClassicalMusic();}

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(List<Music> musicStalesList){
        return new MusicPlayer(musicStalesList);
    }

}
