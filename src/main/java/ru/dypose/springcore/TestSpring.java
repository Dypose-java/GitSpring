package ru.dypose.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dypose.springcore.beans.*;


public class TestSpring  {
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            Music music = context.getBean("hipHopMusic", Music.class);
            System.out.println(music.getSong());

            MusicPlayer musicPlayer = new MusicPlayer(music);
            musicPlayer.getSound();


        }



    }
}
