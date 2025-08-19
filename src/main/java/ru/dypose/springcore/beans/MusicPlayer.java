package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Component
public class MusicPlayer {
    private List<Music> music = new ArrayList<>();

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }
    public void play(){
        music.forEach(el-> System.out.println(el.sound()));
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
