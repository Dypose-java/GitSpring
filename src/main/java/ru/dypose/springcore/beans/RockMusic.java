package ru.dypose.springcore.beans;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Sound RockMusic";
    }
}
