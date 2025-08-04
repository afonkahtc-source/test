package lesson.l13_AnnotationsWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("lesson.l13_AnnotationsWithoutXML")
@PropertySource("classpath:lesson/l13_musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusicBean(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusicBean(){
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusicBean(),classicalMusicBean());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
