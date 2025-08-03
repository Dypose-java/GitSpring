package ru.dypose.springcore.inversionOfControl;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void play(){
        System.out.println("Play song:"+music.getSong());
    }
}
