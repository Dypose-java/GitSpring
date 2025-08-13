package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class HipHopMusic implements Music{
    private List<String> hipHopMusicList = List.of("МоргеЧлен","Марабу","Травма");

    @Override
    public String getSong() {
        return hipHopMusicList.get(new Random().nextInt(0,hipHopMusicList.size()));
    }
}
