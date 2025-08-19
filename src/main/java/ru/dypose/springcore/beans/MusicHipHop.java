package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
public class MusicHipHop implements Music{
    @Value("${music.MusicClassic}")
    private String music;

    @Override
    public String sound() {
        return music;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MusicHipHop that = (MusicHipHop) o;
        return Objects.equals(music, that.music);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(music);
    }
}
