package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MusicPlayer {
    private final List<Music> music;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }
    public void play(){
        String sound = music.get(new Random().nextInt(0, music.size())).sound();
        System.out.println(sound);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MusicPlayer that = (MusicPlayer) o;
        return Objects.equals(music, that.music);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(music);
    }
}
