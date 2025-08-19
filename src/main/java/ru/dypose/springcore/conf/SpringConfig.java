package ru.dypose.springcore.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.dypose.springcore.beans.MusicClassic;
import ru.dypose.springcore.beans.MusicHipHop;
import ru.dypose.springcore.beans.MusicPlayer;

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
    public MusicPlayer musicPlayerBean(){
        return new MusicPlayer(List.of(musicClassicBean(),musicHipHopBean()));
    }
}
