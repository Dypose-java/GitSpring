package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Objects;
public class MusicClassic implements Music {
    @Value("${music.MusicHipHop}")
    private String music;

    @Override
    public String sound() {
        return this.music;
    }

    @Override
    public int hashCode() {
        return music.hashCode()*32;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null||this.getClass()!=obj.getClass())return false;
        MusicClassic musicClassic = (MusicClassic) obj;
        return Objects.equals(this.music,musicClassic.music);
    }
}
