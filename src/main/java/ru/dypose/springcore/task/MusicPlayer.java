package ru.dypose.springcore.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.dypose.springcore.beans.Music;
@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private Music music3;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1
            ,@Qualifier("hipHopMusic") Music music2
            ,@Qualifier("rockMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }
    public String getSoundMusic(TypeMisic typeMisic){
        int ordinal = typeMisic.ordinal();

        switch (ordinal){
            case 0:return music1.getSong();
            case 1:return music2.getSong();
            case 2:return music3.getSong();
            default: return "";
        }

    }
}
