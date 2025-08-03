package ru.dypose.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dypose.springcore.beans.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println(musicPlayer1==musicPlayer);
            System.out.println(musicPlayer+"\n"+musicPlayer1);


        }



    }
}
