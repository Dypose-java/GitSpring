package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = new Random().nextInt(1, 1000);
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer:" + " id:" + id + ", " + musicPlayer.getSound();
    }
}
