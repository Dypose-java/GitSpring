package ru.dypose.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class HipHopMusic implements Music{

    @Override
    public String getSong() {
        return "Sound HipHopMusic";
    }
}
