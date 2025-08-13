package ru.dypose.springcore.beans;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    List<String> list = List.of("Рок1","Рок2","Рок3");

    @Override
    public String getSong() {
        return list.get(new Random().nextInt(0,list.size()));
    }
}
