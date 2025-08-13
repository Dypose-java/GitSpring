package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //todo можно в констурктор,поле,метод
    @Autowired
private ClassicalMusic music;


    public String getSound(){
       return "Play:"+ music.getSong();
    }
}
