package ru.dypose.springcore.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.dypose.springcore.beans.*;

import java.util.List;


@Configuration
@PropertySource("classpath:music.properties")
public class SpringConfig {
    @Bean
    public MusicClassic musicClassicBean(){
        return new MusicClassic();
    }
    @Bean
    public MusicHipHop musicHipHopBean(){
        return new MusicHipHop();
    }
    @Bean
    public MusicVampire musicVampireBean(){
        return new MusicVampire();
    }
    @Bean
    public List<Music> musicListBean(){
        return List.of(musicClassicBean(),musicVampireBean(),musicHipHopBean());
    }

    @Bean
    public MusicPlayer musicPlayerBean(){
        return new MusicPlayer(musicListBean());
    }
}
