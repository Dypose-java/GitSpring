package ru.dypose.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dypose.springcore.beans.Music;
import ru.dypose.springcore.beans.MusicPlayer;
import ru.dypose.springcore.conf.SpringConfig;

import java.util.Random;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.play();


        context.close();

    }
}
