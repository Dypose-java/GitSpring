package ru.dypose.springcore.beans;

import org.springframework.stereotype.Component;



public class MusicPlayer {
private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void getSound(){
        System.out.println("Play:"+music.getSong());
    }
}
