package ru.dypose.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dypose.springcore.inversionOfControl.Music;
import ru.dypose.springcore.inversionOfControl.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.play();
        }


    }
}
