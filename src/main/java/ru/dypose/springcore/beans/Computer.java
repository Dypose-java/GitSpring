package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    @Qualifier("hipHopMusic")
    private Music music;

    public void setMusic(Music music) {
        this.music = music;
    }

    @Autowired
    public Computer(@Qualifier("hipHopMusic") Music music) {
        this.music = music;
    }

    public String getMusicSong(){
        return music.getSong();
    }
}
