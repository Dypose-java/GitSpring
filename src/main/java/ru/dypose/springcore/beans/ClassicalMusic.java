package ru.dypose.springcore.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
   private List<String> classicalMusicList = List.of("Времена года","Кармен","Травиата");

    @Override
    public String getSong() {
        return classicalMusicList.get(new Random().nextInt(0,classicalMusicList.size()));
    }

}
